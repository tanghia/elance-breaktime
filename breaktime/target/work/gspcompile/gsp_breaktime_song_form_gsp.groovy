import breaktime.Song
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_breaktime_song_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/song/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: songInstance, field: 'name', 'error'))
printHtmlPart(1)
invokeTag('message','g',9,['code':("song.name.label"),'default':("Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',13,['name':("name"),'required':(""),'value':(songInstance?.name)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: songInstance, field: 'description', 'error'))
printHtmlPart(4)
invokeTag('message','g',21,['code':("song.description.label"),'default':("Description")],-1)
printHtmlPart(5)
invokeTag('textField','g',27,['name':("description"),'required':(""),'value':(songInstance?.description)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: songInstance, field: 'url', 'error'))
printHtmlPart(6)
invokeTag('textField','g',39,['name':("url"),'required':(""),'value':(songInstance?.url)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: songInstance, field: 'status', 'error'))
printHtmlPart(7)
invokeTag('message','g',47,['code':("song.status.label"),'default':("Status")],-1)
printHtmlPart(8)
invokeTag('checkBox','g',52,['name':("status"),'value':(songInstance?.status)],-1)
printHtmlPart(9)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1431039684439L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
