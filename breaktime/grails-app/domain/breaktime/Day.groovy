package breaktime

import org.grails.databinding.BindingFormat;

class Day {
	transient springSecurityService
	static transients = ['springSecurityService']
	static belongsTo=[user:User]
	static hasMany=[breaktimes:BreakTime]
	@BindingFormat("yyyy-MM-dd")
	Date day
	@BindingFormat("HH:mm")
	Date startTime
	@BindingFormat("HH:mm")
	Date finishTime
	boolean status
    static constraints = {
		day blank:false, nullable:false
		startTime blank:false, nullable:false
		finishTime blank:false, nullable:false, validator: {val,obj->
			obj.startTime>val?'Wrong time setting':true
		} 
    }
	static mapping={
		status defaultValue:true
	}
	def beforeInsert(){
	  this.user=springSecurityService.currentUser
	}
}
