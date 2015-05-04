package breaktime

class User {

	transient springSecurityService

	String username
	String password
	byte[] photo
	String description
	String address
	String phoneNumber
	Date createdDate
	boolean enabled = true
	boolean accountExpired
	boolean accountLocked
	boolean passwordExpired

	static transients = ['springSecurityService']

	static constraints = {
		username blank: false, unique: true, email:true
		password blank: false
		photo blank:true, nullable:true
		address blank:true,nullable:true
		description blank:true, nullable:true
		phoneNumber blank:true, nullable:true 
		createdDate blank:true, nullable:true
	}

	static mapping = {
		password column: '`password`'
	}

	Set<Role> getAuthorities() {
		UserRole.findAllByUser(this).collect { it.role }
	}

	def beforeInsert() {
		if(createdDate==DateUtil.NULL_DATE){
			createdDate=new Date()
		}
		encodePassword()
	}

	def beforeUpdate() {
		if (isDirty('password')) {
			encodePassword()
		}
	}

	protected void encodePassword() {
		password = springSecurityService?.passwordEncoder ? springSecurityService.encodePassword(password) : password
	}
}
