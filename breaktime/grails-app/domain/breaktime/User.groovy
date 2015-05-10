package breaktime

class User {

	transient springSecurityService
	static hasMany=[days:Day]
	String fullName
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
		fullName blank:false, unique:true, nullable:false
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
		fullName defaultValue:'Mr Breaktime'
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
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return fullName
	}
}
