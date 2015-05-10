import breaktime.Song
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_breaktime_songindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/song/index.gsp" }
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
invokeTag('set','g',8,['var':("entityName"),'value':(message(code: 'song.label', default: 'Song'))],-1)
printHtmlPart(0)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',9,['code':("default.list.label"),'args':([entityName])],-1)
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
expressionOut.print(createLink(uri: '/'))
printHtmlPart(3)
invokeTag('message','g',14,['code':("default.home.label")],-1)
printHtmlPart(4)
createTagBody(2, {->
printHtmlPart(5)
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
printHtmlPart(6)
})
invokeTag('link','g',17,['class':("btn btn-info"),'action':("create")],2)
printHtmlPart(7)
if(true && (flash.message)) {
printHtmlPart(8)
expressionOut.print(flash.message)
printHtmlPart(9)
}
printHtmlPart(10)
invokeTag('sortableColumn','g',31,['property':("name"),'title':(message(code: 'song.name.label', default: 'Name'))],-1)
printHtmlPart(11)
invokeTag('sortableColumn','g',34,['property':("description"),'title':(message(code: 'song.description.label', default: 'Description'))],-1)
printHtmlPart(11)
invokeTag('sortableColumn','g',37,['property':("url"),'title':(message(code: 'song.url.label', default: 'Url'))],-1)
printHtmlPart(11)
invokeTag('sortableColumn','g',40,['property':("status"),'title':(message(code: 'song.status.label', default: 'Status'))],-1)
printHtmlPart(12)
loop:{
int i = 0
for( songInstance in (songInstanceList) ) {
printHtmlPart(13)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(14)
createTagBody(3, {->
printHtmlPart(15)
expressionOut.print(fieldValue(bean: songInstance, field: "name"))
printHtmlPart(16)
})
invokeTag('link','g',50,['action':("show"),'id':(songInstance.id)],3)
printHtmlPart(17)
expressionOut.print(fieldValue(bean: songInstance, field: "description"))
printHtmlPart(18)
expressionOut.print(fieldValue(bean: songInstance, field: "url"))
printHtmlPart(19)
invokeTag('formatBoolean','g',60,['boolean':(songInstance.status)],-1)
printHtmlPart(20)
i++
}
}
printHtmlPart(21)
invokeTag('paginate','g',67,['total':(songInstanceCount ?: 0)],-1)
printHtmlPart(22)
})
invokeTag('captureBody','sitemesh',70,[:],1)
printHtmlPart(23)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1430928419415L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
