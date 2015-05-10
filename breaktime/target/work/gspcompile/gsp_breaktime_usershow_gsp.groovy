import breaktime.User
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_breaktime_usershow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/user/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'user.label', default: 'User'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.show.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(5)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(6)
invokeTag('message','g',14,['code':("default.home.label")],-1)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("list"),'action':("index")],2)
printHtmlPart(8)
createTagBody(2, {->
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("create"),'action':("create")],2)
printHtmlPart(9)
invokeTag('message','g',20,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
expressionOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (userInstance?.username)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("user.username.label"),'default':("Username")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(userInstance),'field':("username")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (userInstance?.password)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("user.password.label"),'default':("Password")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(userInstance),'field':("password")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (userInstance?.photo)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("user.photo.label"),'default':("Photo")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (userInstance?.description)) {
printHtmlPart(21)
invokeTag('message','g',53,['code':("user.description.label"),'default':("Description")],-1)
printHtmlPart(22)
invokeTag('fieldValue','g',55,['bean':(userInstance),'field':("description")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (userInstance?.phoneNumber)) {
printHtmlPart(23)
invokeTag('message','g',62,['code':("user.phoneNumber.label"),'default':("Phone Number")],-1)
printHtmlPart(24)
invokeTag('fieldValue','g',64,['bean':(userInstance),'field':("phoneNumber")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (userInstance?.createdDate)) {
printHtmlPart(25)
invokeTag('message','g',71,['code':("user.createdDate.label"),'default':("Created Date")],-1)
printHtmlPart(26)
invokeTag('formatDate','g',73,['date':(userInstance?.createdDate)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (userInstance?.accountExpired)) {
printHtmlPart(27)
invokeTag('message','g',80,['code':("user.accountExpired.label"),'default':("Account Expired")],-1)
printHtmlPart(28)
invokeTag('formatBoolean','g',82,['boolean':(userInstance?.accountExpired)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (userInstance?.accountLocked)) {
printHtmlPart(29)
invokeTag('message','g',89,['code':("user.accountLocked.label"),'default':("Account Locked")],-1)
printHtmlPart(30)
invokeTag('formatBoolean','g',91,['boolean':(userInstance?.accountLocked)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (userInstance?.address)) {
printHtmlPart(31)
invokeTag('message','g',98,['code':("user.address.label"),'default':("Address")],-1)
printHtmlPart(32)
invokeTag('fieldValue','g',100,['bean':(userInstance),'field':("address")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (userInstance?.enabled)) {
printHtmlPart(33)
invokeTag('message','g',107,['code':("user.enabled.label"),'default':("Enabled")],-1)
printHtmlPart(34)
invokeTag('formatBoolean','g',109,['boolean':(userInstance?.enabled)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (userInstance?.passwordExpired)) {
printHtmlPart(35)
invokeTag('message','g',116,['code':("user.passwordExpired.label"),'default':("Password Expired")],-1)
printHtmlPart(36)
invokeTag('formatBoolean','g',118,['boolean':(userInstance?.passwordExpired)],-1)
printHtmlPart(16)
}
printHtmlPart(37)
createTagBody(2, {->
printHtmlPart(38)
createTagBody(3, {->
invokeTag('message','g',126,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',126,['class':("edit"),'action':("edit"),'resource':(userInstance)],3)
printHtmlPart(39)
invokeTag('actionSubmit','g',127,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(40)
})
invokeTag('form','g',129,['url':([resource:userInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(41)
})
invokeTag('captureBody','sitemesh',131,[:],1)
printHtmlPart(42)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1430537990722L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
