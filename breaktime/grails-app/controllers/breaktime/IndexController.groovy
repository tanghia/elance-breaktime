package breaktime
import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional;

@Transactional(readOnly = true)
class IndexController {
	static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
    def index(Integer max) { 
		respond User.list(sort:"createdDate",order:"asc",offset:0,max:4), model:[slideInstanceList : Slide.list(),slideInstanceCount:Slide.count]
		
	}
}
