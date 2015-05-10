import breaktime.Slide
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_breaktime_slide_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/slide/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: slideInstance, field: 'image', 'error'))
printHtmlPart(1)
invokeTag('message','g',9,['code':("slide.image.label"),'default':("Image")],-1)
printHtmlPart(2)
expressionOut.print(hasErrors(bean: slideInstance, field: 'title', 'error'))
printHtmlPart(3)
invokeTag('message','g',21,['code':("slide.title.label"),'default':("Title")],-1)
printHtmlPart(4)
invokeTag('textField','g',25,['name':("title"),'required':(""),'value':(slideInstance?.title)],-1)
printHtmlPart(5)
expressionOut.print(hasErrors(bean: slideInstance, field: 'content', 'error'))
printHtmlPart(6)
invokeTag('message','g',33,['code':("slide.content.label"),'default':("Content")],-1)
printHtmlPart(4)
invokeTag('textField','g',38,['name':("content"),'required':(""),'value':(slideInstance?.content)],-1)
printHtmlPart(7)
expressionOut.print(hasErrors(bean: slideInstance, field: 'status', 'error'))
printHtmlPart(8)
invokeTag('message','g',48,['code':("slide.status.label"),'default':("Status")],-1)
printHtmlPart(9)
invokeTag('checkBox','g',56,['name':("status"),'value':(slideInstance?.status)],-1)
printHtmlPart(10)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1431040164090L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
