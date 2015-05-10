import breaktime.Day
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_breaktime_breakTime_form_create_day_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/breakTime/_form_create_day.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: dayInstance, field: 'day', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("day.day.label"),'default':("Day")],-1)
printHtmlPart(2)
invokeTag('datePicker','g',13,['name':("day"),'precision':("day"),'value':(dayInstance?.day)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: dayInstance, field: 'startTime', 'error'))
printHtmlPart(4)
invokeTag('message','g',22,['code':("day.startTime.label"),'default':("Start Time")],-1)
printHtmlPart(5)
invokeTag('datePicker','g',28,['name':("startTime"),'precision':("minute"),'value':(dayInstance?.startTime)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: dayInstance, field: 'finishTime', 'error'))
printHtmlPart(6)
invokeTag('message','g',37,['code':("day.finishTime.label"),'default':("Finish Time")],-1)
printHtmlPart(5)
invokeTag('datePicker','g',43,['name':("finishTime"),'precision':("minute"),'value':(dayInstance?.finishTime)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: dayInstance, field: 'status', 'error'))
printHtmlPart(7)
invokeTag('message','g',51,['code':("day.status.label"),'default':("Status")],-1)
printHtmlPart(8)
invokeTag('checkBox','g',56,['name':("status"),'value':(dayInstance?.status)],-1)
printHtmlPart(9)
expressionOut.print(hasErrors(bean: dayInstance, field: 'user', 'error'))
printHtmlPart(10)
invokeTag('message','g',61,['code':("day.user.label"),'default':("User")],-1)
printHtmlPart(11)
invokeTag('select','g',64,['id':("user"),'name':("user.id"),'from':(breaktime.User.list()),'optionKey':("id"),'required':(""),'value':(dayInstance?.user?.id),'class':("many-to-one")],-1)
printHtmlPart(12)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1431041737780L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
