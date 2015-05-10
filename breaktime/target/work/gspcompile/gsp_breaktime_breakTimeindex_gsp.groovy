import breaktime.BreakTime
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_breaktime_breakTimeindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/breakTime/index.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'breakTime.label', default: 'BreakTime'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.list.label"),'args':([entityName])],-1)
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
createTagBody(2, {->
invokeTag('message','g',12,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',12,['class':("create btn btn-info"),'action':("create")],2)
printHtmlPart(5)
if(true && (flash.message)) {
printHtmlPart(6)
expressionOut.print(flash.message)
printHtmlPart(7)
}
printHtmlPart(8)
invokeTag('sortableColumn','g',22,['property':("time"),'title':(message(code: 'breakTime.time.label', default: 'Time'))],-1)
printHtmlPart(9)
invokeTag('sortableColumn','g',24,['property':("restTime"),'title':(message(code: 'breakTime.restTime.label', default: 'Rest Time'))],-1)
printHtmlPart(10)
invokeTag('message','g',26,['code':("breakTime.day.label"),'default':("Day")],-1)
printHtmlPart(11)
invokeTag('message','g',28,['code':("breakTime.image.label"),'default':("Image")],-1)
printHtmlPart(11)
invokeTag('message','g',30,['code':("breakTime.song.label"),'default':("Song")],-1)
printHtmlPart(12)
loop:{
int i = 0
for( breakTimeInstance in (breakTimeInstanceList) ) {
printHtmlPart(13)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(14)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: breakTimeInstance, field: "time"))
})
invokeTag('link','g',38,['action':("show"),'id':(breakTimeInstance.id)],3)
printHtmlPart(15)
expressionOut.print(fieldValue(bean: breakTimeInstance, field: "restTime"))
printHtmlPart(15)
expressionOut.print(fieldValue(bean: breakTimeInstance, field: "day"))
printHtmlPart(15)
expressionOut.print(fieldValue(bean: breakTimeInstance, field: "image"))
printHtmlPart(15)
expressionOut.print(fieldValue(bean: breakTimeInstance, field: "song"))
printHtmlPart(16)
i++
}
}
printHtmlPart(17)
invokeTag('paginate','g',53,['total':(breakTimeInstanceCount ?: 0)],-1)
printHtmlPart(18)
})
invokeTag('captureBody','sitemesh',56,[:],1)
printHtmlPart(19)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1431037767596L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
