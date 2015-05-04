package breaktime

class Song {
	String name
	String description
	String url
	boolean status
    static constraints = {
		name blank:false, nullable:false, maxLength:50, minLength:1
		description blank:false, nullable:false, maxLength:100, minLength:1
		url blank:false, nullable:false, maxLength:200, minLength:1
    }
	static mapping={
		status defaultValue:true
	}

}
