import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_breaktime_layouts_include_menubar_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/include/_menubar.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
printHtmlPart(2)
createClosureForHtmlPart(3, 3)
invokeTag('link','g',12,['controller':("program")],3)
printHtmlPart(4)
createClosureForHtmlPart(5, 3)
invokeTag('link','g',15,['controller':("course")],3)
printHtmlPart(4)
createClosureForHtmlPart(6, 3)
invokeTag('link','g',18,['controller':("programCourse")],3)
printHtmlPart(7)
})
invokeTag('ifAllGranted','sec',20,['roles':("ROLE_ADMIN")],2)
printHtmlPart(1)
createTagBody(2, {->
printHtmlPart(8)
createTagBody(3, {->
printHtmlPart(9)
createClosureForHtmlPart(10, 4)
invokeTag('link','g',29,['controller':("student")],4)
printHtmlPart(11)
createClosureForHtmlPart(12, 4)
invokeTag('link','g',33,['controller':("studentCourse")],4)
printHtmlPart(13)
})
invokeTag('ifAnyGranted','sec',35,['roles':("ROLE_COURSECOORDINATOR,ROLE_ADMIN")],3)
printHtmlPart(14)
createTagBody(3, {->
printHtmlPart(9)
createClosureForHtmlPart(15, 4)
invokeTag('link','g',39,['controller':("studentAttendant")],4)
printHtmlPart(16)
})
invokeTag('ifAnyGranted','sec',40,['roles':("ROLE_ADMIN,ROLE_TUTOR")],3)
printHtmlPart(17)
createTagBody(3, {->
printHtmlPart(9)
createClosureForHtmlPart(18, 4)
invokeTag('link','g',45,['controller':("staff")],4)
printHtmlPart(19)
createClosureForHtmlPart(20, 4)
invokeTag('link','g',48,['controller':("tutor")],4)
printHtmlPart(19)
createClosureForHtmlPart(21, 4)
invokeTag('link','g',51,['controller':("courseCoordinator")],4)
printHtmlPart(16)
})
invokeTag('ifAnyGranted','sec',52,['roles':("ROLE_ADMIN")],3)
printHtmlPart(22)
})
invokeTag('ifAnyGranted','sec',54,['roles':("ROLE_ADMIN,ROLE_TUTOR,ROLE_COURSECOORDINATOR")],2)
printHtmlPart(23)
createTagBody(2, {->
printHtmlPart(24)
createClosureForHtmlPart(25, 3)
invokeTag('link','g',64,['controller':("teachingReport"),'action':("tutorCheckAttendantReport")],3)
printHtmlPart(4)
createClosureForHtmlPart(26, 3)
invokeTag('link','g',68,['controller':("teachingReport"),'action':("studentAttendantReport")],3)
printHtmlPart(27)
})
invokeTag('ifAnyGranted','sec',69,['roles':("ROLE_ADMIN,ROLE_TUTOR,ROLE_STAFF,ROLE_STUDENT")],2)
printHtmlPart(28)
createTagBody(2, {->
printHtmlPart(29)
createClosureForHtmlPart(30, 3)
invokeTag('link','g',78,['controller':("role")],3)
printHtmlPart(4)
createClosureForHtmlPart(31, 3)
invokeTag('link','g',81,['controller':("requestmap")],3)
printHtmlPart(32)
})
invokeTag('ifAllGranted','sec',84,['roles':("ROLE_ADMIN")],2)
printHtmlPart(1)
createTagBody(2, {->
printHtmlPart(33)
createClosureForHtmlPart(34, 3)
invokeTag('link','g',91,['controller':("teachingSession")],3)
printHtmlPart(4)
createClosureForHtmlPart(35, 3)
invokeTag('link','g',94,['controller':("place")],3)
printHtmlPart(4)
createClosureForHtmlPart(36, 3)
invokeTag('link','g',97,['controller':("sessionPlace")],3)
printHtmlPart(7)
})
invokeTag('ifAnyGranted','sec',99,['roles':("ROLE_COURSECOORDINATOR,ROLE_ADMIN")],2)
printHtmlPart(37)
createTagBody(2, {->
printHtmlPart(38)
invokeTag('username','sec',101,[:],-1)
printHtmlPart(39)
})
invokeTag('link','g',103,['controller':("logout")],2)
printHtmlPart(40)
})
invokeTag('ifLoggedIn','sec',104,[:],1)
printHtmlPart(41)
createTagBody(1, {->
printHtmlPart(42)
createClosureForHtmlPart(43, 2)
invokeTag('link','g',108,['controller':("login")],2)
printHtmlPart(40)
})
invokeTag('ifNotLoggedIn','sec',109,[:],1)
printHtmlPart(44)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1430362191180L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
