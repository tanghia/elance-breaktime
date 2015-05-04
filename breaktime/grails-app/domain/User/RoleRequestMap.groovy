package User

import org.apache.commons.lang.builder.HashCodeBuilder

class RoleRequestMap implements Serializable {

	private static final long serialVersionUID = 1

	Role role
	RequestMap requestMap

	boolean equals(other) {
		if (!(other instanceof RoleRequestMap)) {
			return false
		}

		other.role?.id == role?.id &&
		other.requestMap?.id == requestMap?.id
	}

	int hashCode() {
		def builder = new HashCodeBuilder()
		if (role) builder.append(role.id)
		if (requestMap) builder.append(requestMap.id)
		builder.toHashCode()
	}

	static RoleRequestMap get(long roleId, long requestMapId) {
		RoleRequestMap.where {
			role == Role.load(roleId) &&
			requestMap == RequestMap.load(requestMapId)
		}.get()
	}

	static boolean exists(long roleId, long requestMapId) {
		RoleRequestMap.where {
			role == Role.load(roleId) &&
			requestMap == RequestMap.load(requestMapId)
		}.count() > 0
	}

	static RoleRequestMap create(Role role, RequestMap requestMap, boolean flush = false) {
		def instance = new RoleRequestMap(role: role, requestMap: requestMap)
		instance.save(flush: flush, insert: true)
		instance
	}

	static boolean remove(Role u, RequestMap r, boolean flush = false) {
		if (u == null || r == null) return false

		int rowCount = RoleRequestMap.where {
			role == Role.load(u.id) &&
			requestMap == RequestMap.load(r.id)
		}.deleteAll()

		if (flush) { RoleRequestMap.withSession { it.flush() } }

		rowCount > 0
	}

	static void removeAll(Role u, boolean flush = false) {
		if (u == null) return

		RoleRequestMap.where {
			role == Role.load(u.id)
		}.deleteAll()

		if (flush) { RoleRequestMap.withSession { it.flush() } }
	}

	static void removeAll(RequestMap r, boolean flush = false) {
		if (r == null) return

		RoleRequestMap.where {
			requestMap == RequestMap.load(r.id)
		}.deleteAll()

		if (flush) { RoleRequestMap.withSession { it.flush() } }
	}

	static constraints = {
		requestMap validator: { RequestMap r, RoleRequestMap ur ->
			if (ur.role == null) return
			boolean existing = false
			RoleRequestMap.withNewSession {
				existing = RoleRequestMap.exists(ur.role.id, r.id)
			}
			if (existing) {
				return 'userRole.exists'
			}
		}
	}

	static mapping = {
		id composite: ['requestMap', 'role']
		version false
	}
}
