package breaktime

class Image {
	String name
	byte[] image
	String title 
	String description
	boolean status
    static constraints = {
		name blank:false, nullable:false, minLength:1, maxLength:50
		image blank:false, nullable:false, maxSize: 1073741824
		title blank:false, nullable:false, minLength:1, maxLength:100
		description blank:false, nullable:false, minLength:1, maxLength:1000
    }
	static mapping={
		status defaultValue:true
	}
	
}
