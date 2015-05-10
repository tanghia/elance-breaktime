import breaktime.User
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_breaktime_userindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/user/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(0)
invokeTag('set','g',8,['var':("entityName"),'value':(message(code: 'user.label', default: 'User'))],-1)
printHtmlPart(0)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',9,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',9,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',9,[:],2)
printHtmlPart(0)
})
invokeTag('captureHead','sitemesh',10,[:],1)
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(2)
if(true && (flash.message)) {
printHtmlPart(3)
expressionOut.print(flash.message)
printHtmlPart(4)
}
printHtmlPart(5)
invokeTag('sortableColumn','g',23,['property':("username"),'title':(message(code: 'user.username.label', default: 'Username'))],-1)
printHtmlPart(6)
invokeTag('sortableColumn','g',26,['property':("password"),'title':(message(code: 'user.password.label', default: 'Password'))],-1)
printHtmlPart(6)
invokeTag('sortableColumn','g',29,['property':("photo"),'title':(message(code: 'user.photo.label', default: 'Photo'))],-1)
printHtmlPart(6)
invokeTag('sortableColumn','g',32,['property':("description"),'title':(message(code: 'user.description.label', default: 'Description'))],-1)
printHtmlPart(6)
invokeTag('sortableColumn','g',35,['property':("phoneNumber"),'title':(message(code: 'user.phoneNumber.label', default: 'Phone Number'))],-1)
printHtmlPart(6)
invokeTag('sortableColumn','g',38,['property':("createdDate"),'title':(message(code: 'user.createdDate.label', default: 'Created Date'))],-1)
printHtmlPart(7)
loop:{
int i = 0
for( userInstance in (userInstanceList) ) {
printHtmlPart(8)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(9)
expressionOut.print(fieldValue(bean: userInstance, field: "username"))
printHtmlPart(10)
expressionOut.print(fieldValue(bean: userInstance, field: "password"))
printHtmlPart(11)
if(true && (userInstance.photo)) {
printHtmlPart(12)
expressionOut.print(userInstance.photo?.encodeBase64())
printHtmlPart(13)
}
else {
printHtmlPart(14)
expressionOut.print(resource(dir: 'images', file: 'User_Circle.png'))
printHtmlPart(15)
}
printHtmlPart(16)
expressionOut.print(fieldValue(bean: userInstance, field: "description"))
printHtmlPart(10)
expressionOut.print(fieldValue(bean: userInstance, field: "phoneNumber"))
printHtmlPart(11)
invokeTag('formatDate','g',72,['date':(userInstance.createdDate)],-1)
printHtmlPart(17)
i++
}
}
printHtmlPart(18)
invokeTag('paginate','g',79,['total':(userInstanceCount ?: 0)],-1)
printHtmlPart(19)
})
invokeTag('captureBody','sitemesh',82,[:],1)
printHtmlPart(20)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1431040595736L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
