package breaktime



import static org.springframework.http.HttpStatus.*

import java.math.MathContext;

import grails.transaction.Transactional

@Transactional(readOnly = true)
class BreakTimeController {
	def springSecurityService
	static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

	def index(Integer max) {
		params.max = Math.min(max ?: 10, 100)
		def breaktimes=BreakTime.findAllByDay(Day.findById(params.dayId));
		println "${breaktimes} " +Day.findById(params.dayId)
		respond breaktimes, model:[breakTimeInstanceCount: breaktimes.size()]
	}

	def show(BreakTime breakTimeInstance) {
		if(params.from.equals("breaktime")){
			redirect controller:'breakTime',action:'create'
			
		}else{
			respond breakTimeInstance
		}
	}

	def create(Integer max) {
		params.max = Math.min(max ?: 10, 100)
		def user=springSecurityService.currentUser
		def days=user.days
		def totalTime=0
		def totalRestTime=0
		days.each {obj->
			totalTime+=(obj.finishTime.getTime() - obj.startTime.getTime())
			obj.breaktimes.each {bt->
				totalRestTime+=(bt.restTime)
			}
		}
		def totalWorkingTime=totalTime-totalRestTime*60*1000
		respond new BreakTime(params), model:[dayInstance:new Day(params),workingTime:(totalWorkingTime/(1000*60*60)).round(new MathContext(2)),restTime:(totalRestTime/60).round(new MathContext(2)),dayInstanceCount: Day.count(),dayInstanceList: (Day.findByUser(springSecurityService.currentUser))?.list(params) ]
	}

	@Transactional
	def save(BreakTime breakTimeInstance) {
		if (breakTimeInstance == null) {
			notFound()
			return
		}

		if (breakTimeInstance.hasErrors()) {
			respond breakTimeInstance.errors, view:'create'
			return
		}

		breakTimeInstance.save flush:true

		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.created.message', args: [
					message(code: 'breakTime.label', default: 'BreakTime'),
					breakTimeInstance.id
				])
				redirect breakTimeInstance
			}
			'*' { respond breakTimeInstance, [status: CREATED] }
		}
	}

	def edit(BreakTime breakTimeInstance) {
		respond breakTimeInstance
	}

	@Transactional
	def update(BreakTime breakTimeInstance) {
		if (breakTimeInstance == null) {
			notFound()
			return
		}

		if (breakTimeInstance.hasErrors()) {
			respond breakTimeInstance.errors, view:'edit'
			return
		}

		breakTimeInstance.save flush:true

		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.updated.message', args: [
					message(code: 'BreakTime.label', default: 'BreakTime'),
					breakTimeInstance.id
				])
				redirect breakTimeInstance
			}
			'*'{ respond breakTimeInstance, [status: OK] }
		}
	}

	@Transactional
	def delete(BreakTime breakTimeInstance) {

		if (breakTimeInstance == null) {
			notFound()
			return
		}

		breakTimeInstance.delete flush:true

		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.deleted.message', args: [
					message(code: 'BreakTime.label', default: 'BreakTime'),
					breakTimeInstance.id
				])
				redirect action:"index", method:"GET"
			}
			'*'{ render status: NO_CONTENT }
		}
	}

	protected void notFound() {
		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.not.found.message', args: [
					message(code: 'breakTime.label', default: 'BreakTime'),
					params.id
				])
				redirect action: "index", method: "GET"
			}
			'*'{ render status: NOT_FOUND }
		}
	}
}
