package breaktime

import org.grails.databinding.BindingFormat;

class BreakTime {
	static belongsTo=[song:Song,image:Image,day:Day]
	@BindingFormat("HH-mm")
	Date time
	int restTime
    static constraints = {
		time blank:false, nullable:false
		restTime blank:false, nullable:false, min:1, max:30
    }
	
	def beforeInsert(){
		time.date=day.day.getDate()
		time.month=day.day.getMonth()
		time.year=day.day.getYear()
	}
}
