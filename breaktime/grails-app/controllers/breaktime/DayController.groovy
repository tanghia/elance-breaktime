package breaktime



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class DayController {

	static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

	def index(Integer max) {
		 redirect controller:'breakTime',action:'create'
	}

	def show(Day dayInstance) {
		if(params.from.equals("breaktime")){
			respond dayInstance
		}else{
		    redirect controller:'breakTime',action:'create'
		}
	}


	def create() {
		respond new Day(params)
	}

	@Transactional
	def save(Day dayInstance) {
		if (dayInstance == null) {
			notFound()
			return
		}

		if (dayInstance.hasErrors()) {
			respond dayInstance.errors, view:'create'
			return
		}

		dayInstance.save flush:true

		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.created.message', args: [
					message(code: 'day.label', default: 'Day'),
					dayInstance.id
				])
				redirect dayInstance
			}
			'*' { respond dayInstance, [status: CREATED] }
		}
	}

	def edit(Day dayInstance) {
		respond dayInstance
	}

	@Transactional
	def update(Day dayInstance) {
		if (dayInstance == null) {
			notFound()
			return
		}

		if (dayInstance.hasErrors()) {
			respond dayInstance.errors, view:'edit'
			return
		}

		dayInstance.save flush:true

		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.updated.message', args: [
					message(code: 'Day.label', default: 'Day'),
					dayInstance.id
				])
				redirect dayInstance
			}
			'*'{ respond dayInstance, [status: OK] }
		}
	}
	@Transactional
	def delete(Day dayInstance) {

		if (dayInstance == null) {
			notFound()
			return
		}

		dayInstance.delete flush:true

		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.deleted.message', args: [
					message(code: 'Day.label', default: 'Day'),
					dayInstance.id
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
					message(code: 'day.label', default: 'Day'),
					params.id
				])
				redirect action: "index", method: "GET"
			}
			'*'{ render status: NOT_FOUND }
		}
	}
}
