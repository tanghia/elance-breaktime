package breaktime

class Slide {
	byte[] image
	String title
	String content
	Date createdDate
	boolean status
    static constraints = {
		image blank:false, nullable:false, maxSize:1073741824
		title blank:false, nullable:false, minLength:1, maxLength:100
		content blank:false, nullable:false, minLength:1, maxLength:500
		createdDate blank:true, nullable:true
		status blank:true, nullable:true
    }
	static mapping={
		status defaultValue:true
	}
	def beforeInsert(){
		if(createdDate==DateUtil.NULL_DATE){
			createdDate=new Date()
		}
	}
}
