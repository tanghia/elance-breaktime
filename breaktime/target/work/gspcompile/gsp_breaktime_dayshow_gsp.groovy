import breaktime.Day
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_breaktime_dayshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/day/show.gsp" }
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
invokeTag('set','g',8,['var':("entityName"),'value':(message(code: 'day.label', default: 'Day'))],-1)
printHtmlPart(0)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',9,['code':("default.show.label"),'args':([entityName])],-1)
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
createTagBody(2, {->
printHtmlPart(3)
invokeTag('message','g',13,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(2)
})
invokeTag('link','g',14,['class':("list btn btn-info"),'action':("index")],2)
printHtmlPart(2)
createTagBody(2, {->
printHtmlPart(3)
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
printHtmlPart(2)
})
invokeTag('link','g',17,['class':("create btn btn-info"),'action':("create")],2)
printHtmlPart(4)
if(true && (flash.message)) {
printHtmlPart(5)
expressionOut.print(flash.message)
printHtmlPart(6)
}
printHtmlPart(7)
if(true && (dayInstance?.day)) {
printHtmlPart(8)
invokeTag('message','g',30,['code':("day.day.label"),'default':("Day")],-1)
printHtmlPart(9)
invokeTag('formatDate','g',32,['date':(dayInstance?.day)],-1)
printHtmlPart(10)
}
printHtmlPart(11)
if(true && (dayInstance?.startTime)) {
printHtmlPart(12)
invokeTag('message','g',38,['code':("day.startTime.label"),'default':("Start Time")],-1)
printHtmlPart(13)
invokeTag('formatDate','g',40,['date':(dayInstance?.startTime)],-1)
printHtmlPart(10)
}
printHtmlPart(11)
if(true && (dayInstance?.finishTime)) {
printHtmlPart(14)
invokeTag('message','g',46,['code':("day.finishTime.label"),'default':("Finish Time")],-1)
printHtmlPart(15)
invokeTag('formatDate','g',48,['date':(dayInstance?.finishTime)],-1)
printHtmlPart(10)
}
printHtmlPart(11)
if(true && (dayInstance?.status)) {
printHtmlPart(16)
invokeTag('message','g',54,['code':("day.status.label"),'default':("Status")],-1)
printHtmlPart(17)
invokeTag('formatBoolean','g',56,['boolean':(dayInstance?.status)],-1)
printHtmlPart(10)
}
printHtmlPart(11)
if(true && (dayInstance?.user)) {
printHtmlPart(18)
invokeTag('message','g',62,['code':("day.user.label"),'default':("User")],-1)
printHtmlPart(19)
createTagBody(3, {->
printHtmlPart(20)
expressionOut.print(dayInstance?.user?.encodeAsHTML())
printHtmlPart(21)
})
invokeTag('link','g',66,['controller':("user"),'action':("show"),'id':(dayInstance?.user?.id)],3)
printHtmlPart(10)
}
printHtmlPart(22)
createTagBody(2, {->
printHtmlPart(23)
createTagBody(3, {->
printHtmlPart(24)
invokeTag('message','g',73,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(25)
})
invokeTag('link','g',74,['class':("edit"),'action':("edit"),'resource':(dayInstance)],3)
printHtmlPart(25)
invokeTag('actionSubmit','g',77,['class':("delete btn btn-info"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(26)
})
invokeTag('form','g',79,['url':([resource:dayInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(27)
})
invokeTag('captureBody','sitemesh',81,[:],1)
printHtmlPart(28)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1431038928606L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
