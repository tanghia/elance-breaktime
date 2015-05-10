import breaktime.RequestMap;
import breaktime.Role;
import breaktime.User;
import breaktime.UserRole;

class BootStrap {

    def init = { 
		/**
		 * Creare User and Admin role
		 */
		def userRole = Role.findByAuthority('ROLE_USER') ?: new Role(authority: 'ROLE_USER').save(failOnError: true)
		def adminRole = Role.findByAuthority('ROLE_ADMIN') ?: new Role(authority: 'ROLE_ADMIN').save(failOnError: true)
		/**
		 * Create Admin
		 */
		def adminUser = User.findByUsername('admin@company.com') ?: new User(
				username: 'admin@company.com',
				password: 'admin',
				enabled: true).save(failOnError: true)

		if (!adminUser.authorities.contains(adminRole)) {
			new UserRole(user: adminUser, role:adminRole).save(flush:true)
		}
		/**
		 * Create mapping URL
		 */
		if(RequestMap.count==0){
			for (String url in [
				'/',
				'/index',
				'/index.gsp',
				'/**/search/**',
				'/**/index/**',
				'/**/favicon.ico',
				'/**/js/**',
				'/**/css/**',
				'/**/images/**',
				'/**/fonts/**',
				'/**/assets/**',
				'/login',
				'/login.*',
				'/login/*',
				'/logout',
				'/logout.*',
				'/logout/*'
			]) {
				new RequestMap(url: url, configAttribute: 'permitAll').save()
			}
			/*new RequestMap(url: '/user/**', configAttribute: 'ROLE_ADMIN,ROLE_USER').save()*/
			new RequestMap(url: '/user/**', configAttribute: 'permitAll').save()
			new RequestMap(url: '/breaktime/**', configAttribute: 'ROLE_ADMIN,ROLE_USER').save()
			new RequestMap(url: '/day/**', configAttribute: 'ROLE_ADMIN,ROLE_USER').save()
			new RequestMap(url: '/image/**', configAttribute: 'ROLE_ADMIN').save()
			new RequestMap(url: '/slide/**', configAttribute: 'ROLE_ADMIN').save()
			new RequestMap(url: '/song/**', configAttribute: 'ROLE_ADMIN').save()
			new RequestMap(url: '/j_spring_security_switch_user',
			configAttribute: 'ROLE_SWITCH_USER,isFullyAuthenticated()').save()
		}
    }
    def destroy = {
    }
}
