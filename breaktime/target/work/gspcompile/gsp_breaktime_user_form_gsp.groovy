import breaktime.User
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_breaktime_user_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/user/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: userInstance, field: 'fullName', 'error'))
printHtmlPart(1)
invokeTag('field','g',10,['type':("text"),'id':("fullName"),'class':("form-control"),'name':("fullName"),'required':(""),'value':(userInstance?.fullName)],-1)
printHtmlPart(2)
expressionOut.print(hasErrors(bean: userInstance, field: 'username', 'error'))
printHtmlPart(3)
invokeTag('field','g',19,['type':("email"),'class':("form-control"),'name':("username"),'required':(""),'value':(userInstance?.username)],-1)
printHtmlPart(4)
expressionOut.print(hasErrors(bean: userInstance, field: 'password', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("user.password.label"),'default':("Password")],-1)
printHtmlPart(6)
invokeTag('passwordField','g',28,['name':("password"),'type':("password"),'class':("form-control"),'required':(""),'value':(userInstance?.password)],-1)
printHtmlPart(7)
expressionOut.print(hasErrors(bean: userInstance, field: 'phoneNumber', 'error'))
printHtmlPart(8)
invokeTag('message','g',37,['code':("user.phoneNumber.label"),'default':("Phone Number")],-1)
printHtmlPart(9)
invokeTag('textField','g',42,['name':("phoneNumber"),'class':("form-control"),'value':(userInstance?.phoneNumber)],-1)
printHtmlPart(10)
expressionOut.print(hasErrors(bean: userInstance, field: 'address', 'error'))
printHtmlPart(11)
invokeTag('message','g',47,['code':("user.address.label"),'default':("Address")],-1)
printHtmlPart(6)
invokeTag('textField','g',53,['name':("address"),'class':("form-control"),'required':(""),'value':(userInstance?.address)],-1)
printHtmlPart(12)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1431041944882L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
