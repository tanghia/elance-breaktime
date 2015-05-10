import breaktime.Day
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_breaktime_breakTimecreate_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/breakTime/create.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'breakTime.label', default: 'BreakTime'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',9,['code':("default.create.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',9,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',9,[:],2)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',11,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(3)
expressionOut.print(workingTime)
printHtmlPart(4)
expressionOut.print(restTime)
printHtmlPart(5)
if(true && (flash.message)) {
printHtmlPart(6)
expressionOut.print(flash.message)
printHtmlPart(7)
}
printHtmlPart(8)
createTagBody(2, {->
printHtmlPart(9)
createTagBody(3, {->
printHtmlPart(10)
if(true && (error in org.springframework.validation.FieldError)) {
printHtmlPart(11)
expressionOut.print(error.field)
printHtmlPart(12)
}
printHtmlPart(13)
invokeTag('message','g',40,['error':(error)],-1)
printHtmlPart(14)
})
invokeTag('eachError','g',41,['bean':(dayInstance),'var':("error")],3)
printHtmlPart(15)
})
invokeTag('hasErrors','g',43,['bean':(dayInstance)],2)
printHtmlPart(8)
createTagBody(2, {->
printHtmlPart(16)
invokeTag('render','g',48,['template':("form_create_day")],-1)
printHtmlPart(17)
invokeTag('submitButton','g',56,['name':("create"),'class':("save btn btn-info"),'params':([from:'breaktime']),'value':(message(code: 'default.button.create.label', default: 'Create'))],-1)
printHtmlPart(18)
})
invokeTag('form','g',61,['controller':("day"),'url':([resource:dayInstance, action:'save']),'role':("form"),'class':("row")],2)
printHtmlPart(19)
if(true && (flash.message)) {
printHtmlPart(6)
expressionOut.print(flash.message)
printHtmlPart(7)
}
printHtmlPart(8)
createTagBody(2, {->
printHtmlPart(9)
createTagBody(3, {->
printHtmlPart(10)
if(true && (error in org.springframework.validation.FieldError)) {
printHtmlPart(11)
expressionOut.print(error.field)
printHtmlPart(12)
}
printHtmlPart(13)
invokeTag('message','g',74,['error':(error)],-1)
printHtmlPart(14)
})
invokeTag('eachError','g',75,['bean':(breakTimeInstance),'var':("error")],3)
printHtmlPart(15)
})
invokeTag('hasErrors','g',77,['bean':(breakTimeInstance)],2)
printHtmlPart(8)
createTagBody(2, {->
printHtmlPart(20)
invokeTag('render','g',81,['template':("form")],-1)
printHtmlPart(17)
invokeTag('submitButton','g',89,['params':([from:'breaktime']),'name':("create"),'class':("save btn btn-info"),'value':(message(code: 'default.button.create.label', default: 'Create'))],-1)
printHtmlPart(21)
})
invokeTag('form','g',93,['url':([resource:breakTimeInstance, action:'save'])],2)
printHtmlPart(22)
if(true && (flash.message)) {
printHtmlPart(23)
expressionOut.print(flash.message)
printHtmlPart(24)
}
printHtmlPart(25)
invokeTag('sortableColumn','g',107,['property':("day"),'title':(message(code: 'day.day.label', default: 'Day'))],-1)
printHtmlPart(26)
invokeTag('sortableColumn','g',110,['property':("startTime"),'title':(message(code: 'day.startTime.label', default: 'Start Time'))],-1)
printHtmlPart(27)
invokeTag('sortableColumn','g',113,['property':("finishTime"),'title':(message(code: 'day.finishTime.label', default: 'Finish Time'))],-1)
printHtmlPart(27)
invokeTag('sortableColumn','g',116,['property':("status"),'title':(message(code: 'day.status.label', default: 'Status'))],-1)
printHtmlPart(28)
loop:{
int i = 0
for( dayInstance in (dayInstanceList) ) {
printHtmlPart(29)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(30)
invokeTag('formatDate','g',126,['format':("yyyy-MM-dd"),'date':(dayInstance.day)],-1)
printHtmlPart(31)
createTagBody(3, {->
printHtmlPart(32)
expressionOut.print(dayInstance.breaktimes.size())
printHtmlPart(33)
})
invokeTag('link','g',128,['controller':("breakTime"),'action':("index"),'params':([dayId:dayInstance.id])],3)
printHtmlPart(34)
invokeTag('formatDate','g',131,['format':("HH:mm a"),'date':(dayInstance.startTime)],-1)
printHtmlPart(35)
invokeTag('formatDate','g',134,['format':("hh:mm a"),'date':(dayInstance.finishTime)],-1)
printHtmlPart(36)
expressionOut.print(dayInstance.id)
printHtmlPart(37)
loop:{
int k = 0
for( breaktime in (dayInstance.breaktimes) ) {
printHtmlPart(38)
expressionOut.print(dayInstance.id)
printHtmlPart(39)
expressionOut.print(k)
printHtmlPart(40)
expressionOut.print(breaktime.time.toString())
printHtmlPart(41)
expressionOut.print(breaktime.restTime)
printHtmlPart(42)
expressionOut.print(HtmlUtils.htmlEscape(breaktime.song.url))
printHtmlPart(43)
expressionOut.print(breaktime.image.title)
printHtmlPart(44)
expressionOut.print(breaktime.image.image.encodeBase64())
printHtmlPart(45)
expressionOut.print(breaktime.image.description)
printHtmlPart(46)
k++
}
}
printHtmlPart(47)
createClosureForHtmlPart(48, 3)
invokeTag('link','g',143,['controller':("day"),'action':("show"),'params':([from:'breaktime']),'id':(dayInstance.id)],3)
printHtmlPart(49)
i++
}
}
printHtmlPart(50)
invokeTag('paginate','g',149,['total':(dayInstanceCount ?: 0)],-1)
printHtmlPart(51)
})
invokeTag('captureBody','sitemesh',247,[:],1)
printHtmlPart(52)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1431193914464L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
