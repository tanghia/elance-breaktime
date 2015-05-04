package breaktime



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class SlideController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Slide.list(params), model:[slideInstanceCount: Slide.count()]
    }

    def show(Slide slideInstance) {
        respond slideInstance
    }

    def create() {
        respond new Slide(params)
    }

    @Transactional
    def save(Slide slideInstance) {
        if (slideInstance == null) {
            notFound()
            return
        }

        if (slideInstance.hasErrors()) {
            respond slideInstance.errors, view:'create'
            return
        }

        slideInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'slide.label', default: 'Slide'), slideInstance.id])
                redirect slideInstance
            }
            '*' { respond slideInstance, [status: CREATED] }
        }
    }

    def edit(Slide slideInstance) {
        respond slideInstance
    }

    @Transactional
    def update(Slide slideInstance) {
        if (slideInstance == null) {
            notFound()
            return
        }

        if (slideInstance.hasErrors()) {
            respond slideInstance.errors, view:'edit'
            return
        }

        slideInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Slide.label', default: 'Slide'), slideInstance.id])
                redirect slideInstance
            }
            '*'{ respond slideInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Slide slideInstance) {

        if (slideInstance == null) {
            notFound()
            return
        }

        slideInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Slide.label', default: 'Slide'), slideInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'slide.label', default: 'Slide'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
