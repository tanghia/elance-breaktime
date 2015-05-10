import breaktime.BreakTime
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_breaktime_breakTime_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/breakTime/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: breakTimeInstance, field: 'time', 'error'))
printHtmlPart(1)
invokeTag('message','g',9,['code':("breakTime.time.label"),'default':("Time")],-1)
printHtmlPart(2)
invokeTag('datePicker','g',14,['name':("time"),'precision':("minute"),'value':(breakTimeInstance?.time)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: breakTimeInstance, field: 'restTime', 'error'))
printHtmlPart(4)
invokeTag('message','g',22,['code':("breakTime.restTime.label"),'default':("Rest Time")],-1)
printHtmlPart(5)
invokeTag('field','g',28,['name':("restTime"),'type':("number"),'min':("1"),'max':("30"),'value':(breakTimeInstance.restTime),'required':("")],-1)
printHtmlPart(6)
expressionOut.print(hasErrors(bean: breakTimeInstance, field: 'day', 'error'))
printHtmlPart(7)
invokeTag('message','g',36,['code':("breakTime.day.label"),'default':("Day")],-1)
printHtmlPart(2)
invokeTag('select','g',42,['id':("day"),'name':("day.id"),'from':(breaktime.Day.list()),'optionKey':("id"),'required':(""),'value':(breakTimeInstance?.day?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: breakTimeInstance, field: 'image', 'error'))
printHtmlPart(8)
invokeTag('message','g',50,['code':("breakTime.image.label"),'default':("Image")],-1)
printHtmlPart(2)
invokeTag('select','g',56,['id':("image"),'name':("image.id"),'from':(breaktime.Image.list()),'optionKey':("id"),'required':(""),'value':(breakTimeInstance?.image?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: breakTimeInstance, field: 'song', 'error'))
printHtmlPart(9)
invokeTag('message','g',64,['code':("breakTime.song.label"),'default':("Song")],-1)
printHtmlPart(2)
invokeTag('select','g',70,['id':("song"),'name':("song.id"),'from':(breaktime.Song.list()),'optionKey':("id"),'required':(""),'value':(breakTimeInstance?.song?.id),'class':("many-to-one")],-1)
printHtmlPart(10)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1431037142581L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
