package breaktime
import static org.springframework.http.HttpStatus.*

import java.math.MathContext;

import grails.transaction.Transactional
@Transactional(readOnly = true)
class SearchController {
	static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
	def index() {
		def users=User.findAll("from User as u where u.fullName like ?",["%${params.q}%"])
		def searchInstanceList=[]
		users.each {
			def gso=new GroovySearchObject();
			def days=it.days
			def totalTime=0
			def totalRestTime=0
			days.each {obj->
				totalTime+=obj.finishTime.getTime()-obj.startTime.getTime()
				obj.breaktimes.each {bt->
					totalRestTime+=bt.restTime*60*1000
				}
			}
			def totalWorkingTime=totalTime-totalRestTime
			gso.fullName=it.fullName
			gso.photo=it.photo
			gso.restTime=(totalRestTime/(60*1000*60)).round(new MathContext(2))
			gso.workingTime=(totalWorkingTime/(60*60*1000)).round(new MathContext(2))
			searchInstanceList.add(gso)
		}
	  [searchInstanceList:searchInstanceList]
	}
}
