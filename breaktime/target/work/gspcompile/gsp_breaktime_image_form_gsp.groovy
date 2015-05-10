import breaktime.Image
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_breaktime_image_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/image/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: imageInstance, field: 'name', 'error'))
printHtmlPart(1)
invokeTag('message','g',9,['code':("image.name.label"),'default':("Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',13,['name':("name"),'required':(""),'value':(imageInstance?.name)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: imageInstance, field: 'image', 'error'))
printHtmlPart(4)
invokeTag('message','g',21,['code':("image.image.label"),'default':("Image")],-1)
printHtmlPart(5)
expressionOut.print(hasErrors(bean: imageInstance, field: 'title', 'error'))
printHtmlPart(6)
invokeTag('message','g',33,['code':("image.title.label"),'default':("Title")],-1)
printHtmlPart(2)
invokeTag('textField','g',37,['name':("title"),'required':(""),'value':(imageInstance?.title)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: imageInstance, field: 'description', 'error'))
printHtmlPart(7)
invokeTag('message','g',45,['code':("image.description.label"),'default':("Description")],-1)
printHtmlPart(8)
invokeTag('textField','g',51,['name':("description"),'required':(""),'value':(imageInstance?.description)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: imageInstance, field: 'status', 'error'))
printHtmlPart(9)
invokeTag('message','g',59,['code':("image.status.label"),'default':("Status")],-1)
printHtmlPart(10)
invokeTag('checkBox','g',64,['name':("status"),'value':(imageInstance?.status)],-1)
printHtmlPart(11)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1431040907483L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
