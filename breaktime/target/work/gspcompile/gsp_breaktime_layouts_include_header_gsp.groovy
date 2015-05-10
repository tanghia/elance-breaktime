import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_breaktime_layouts_include_header_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/include/_header.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
expressionOut.print(resource(dir: 'images', file: 'BreakTime_logo.png'))
printHtmlPart(2)
})
invokeTag('link','g',13,['controller':("index"),'action':("index")],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('username','sec',20,[:],-1)
printHtmlPart(5)
createTagBody(2, {->
printHtmlPart(6)
createClosureForHtmlPart(7, 3)
invokeTag('link','g',24,['controller':("slide"),'action':("index")],3)
printHtmlPart(8)
createClosureForHtmlPart(9, 3)
invokeTag('link','g',26,['controller':("song"),'action':("index")],3)
printHtmlPart(8)
createClosureForHtmlPart(10, 3)
invokeTag('link','g',28,['controller':("image"),'action':("index")],3)
printHtmlPart(8)
createClosureForHtmlPart(11, 3)
invokeTag('link','g',30,['controller':("user"),'action':("index")],3)
printHtmlPart(12)
})
invokeTag('ifAllGranted','sec',31,['roles':("ROLE_ADMIN")],2)
printHtmlPart(13)
createClosureForHtmlPart(14, 2)
invokeTag('link','g',33,['controller':("breakTime"),'action':("create")],2)
printHtmlPart(15)
createClosureForHtmlPart(16, 2)
invokeTag('link','g',36,['controller':("logout")],2)
printHtmlPart(17)
})
invokeTag('ifLoggedIn','sec',37,[:],1)
printHtmlPart(18)
createTagBody(1, {->
printHtmlPart(13)
createClosureForHtmlPart(19, 2)
invokeTag('link','g',41,['controller':("user"),'action':("create")],2)
printHtmlPart(15)
createClosureForHtmlPart(20, 2)
invokeTag('link','g',43,['controller':("login")],2)
printHtmlPart(17)
})
invokeTag('ifNotLoggedIn','sec',44,[:],1)
printHtmlPart(21)
createClosureForHtmlPart(22, 1)
invokeTag('form','g',53,['class':("form-group"),'style':("width:200px"),'method':("GET"),'controller':("search")],1)
printHtmlPart(23)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1431004358210L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
