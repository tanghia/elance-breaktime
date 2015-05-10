import breaktime.BreakTime
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_breaktime_breakTimeshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/breakTime/show.gsp" }
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
invokeTag('set','g',8,['var':("entityName"),'value':(message(code: 'breakTime.label', default: 'BreakTime'))],-1)
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
invokeTag('message','g',14,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(4)
})
invokeTag('link','g',15,['class':("list btn btn-info"),'action':("index")],2)
printHtmlPart(4)
createTagBody(2, {->
printHtmlPart(3)
invokeTag('message','g',17,['code':("default.new.label"),'args':([entityName])],-1)
printHtmlPart(4)
})
invokeTag('link','g',18,['class':("create btn btn-info"),'action':("create")],2)
printHtmlPart(5)
if(true && (flash.message)) {
printHtmlPart(6)
expressionOut.print(flash.message)
printHtmlPart(7)
}
printHtmlPart(8)
if(true && (breakTimeInstance?.time)) {
printHtmlPart(9)
invokeTag('message','g',36,['code':("breakTime.time.label"),'default':("Time")],-1)
printHtmlPart(10)
invokeTag('formatDate','g',38,['date':(breakTimeInstance?.time)],-1)
printHtmlPart(11)
}
printHtmlPart(12)
if(true && (breakTimeInstance?.restTime)) {
printHtmlPart(13)
invokeTag('message','g',44,['code':("breakTime.restTime.label"),'default':("Rest Time")],-1)
printHtmlPart(14)
invokeTag('fieldValue','g',46,['bean':(breakTimeInstance),'field':("restTime")],-1)
printHtmlPart(11)
}
printHtmlPart(12)
if(true && (breakTimeInstance?.day)) {
printHtmlPart(15)
invokeTag('message','g',52,['code':("breakTime.day.label"),'default':("Day")],-1)
printHtmlPart(16)
createTagBody(3, {->
printHtmlPart(17)
expressionOut.print(breakTimeInstance?.day?.encodeAsHTML())
printHtmlPart(18)
})
invokeTag('link','g',57,['controller':("day"),'action':("show"),'id':(breakTimeInstance?.day?.id)],3)
printHtmlPart(11)
}
printHtmlPart(12)
if(true && (breakTimeInstance?.image)) {
printHtmlPart(19)
invokeTag('message','g',63,['code':("breakTime.image.label"),'default':("Image")],-1)
printHtmlPart(20)
createTagBody(3, {->
printHtmlPart(17)
expressionOut.print(breakTimeInstance?.image?.encodeAsHTML())
printHtmlPart(18)
})
invokeTag('link','g',68,['controller':("image"),'action':("show"),'id':(breakTimeInstance?.image?.id)],3)
printHtmlPart(11)
}
printHtmlPart(12)
if(true && (breakTimeInstance?.song)) {
printHtmlPart(21)
invokeTag('message','g',74,['code':("breakTime.song.label"),'default':("Song")],-1)
printHtmlPart(22)
createTagBody(3, {->
printHtmlPart(17)
expressionOut.print(breakTimeInstance?.song?.encodeAsHTML())
printHtmlPart(18)
})
invokeTag('link','g',79,['controller':("song"),'action':("show"),'id':(breakTimeInstance?.song?.id)],3)
printHtmlPart(11)
}
printHtmlPart(23)
createTagBody(2, {->
printHtmlPart(24)
createTagBody(3, {->
printHtmlPart(25)
invokeTag('message','g',87,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(26)
})
invokeTag('link','g',88,['class':("edit"),'action':("edit"),'resource':(breakTimeInstance)],3)
printHtmlPart(26)
invokeTag('actionSubmit','g',91,['class':("delete btn btn-info"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(27)
})
invokeTag('form','g',93,['url':([resource:breakTimeInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(28)
})
invokeTag('captureBody','sitemesh',96,[:],1)
printHtmlPart(29)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1431038324526L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
