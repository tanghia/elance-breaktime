import breaktime.Image
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_breaktime_imageindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/image/index.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'image.label', default: 'Image'))],-1)
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
expressionOut.print(createLink(uri: '/'))
printHtmlPart(5)
invokeTag('message','g',12,['code':("default.home.label")],-1)
printHtmlPart(6)
createTagBody(2, {->
invokeTag('message','g',13,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',13,['class':("btn btn-info"),'action':("create")],2)
printHtmlPart(7)
if(true && (flash.message)) {
printHtmlPart(8)
expressionOut.print(flash.message)
printHtmlPart(9)
}
printHtmlPart(10)
invokeTag('sortableColumn','g',24,['property':("name"),'title':(message(code: 'image.name.label', default: 'Name'))],-1)
printHtmlPart(11)
invokeTag('sortableColumn','g',26,['property':("image"),'title':(message(code: 'image.image.label', default: 'Image'))],-1)
printHtmlPart(11)
invokeTag('sortableColumn','g',28,['property':("title"),'title':(message(code: 'image.title.label', default: 'Title'))],-1)
printHtmlPart(11)
invokeTag('sortableColumn','g',30,['property':("description"),'title':(message(code: 'image.description.label', default: 'Description'))],-1)
printHtmlPart(11)
invokeTag('sortableColumn','g',32,['property':("status"),'title':(message(code: 'image.status.label', default: 'Status'))],-1)
printHtmlPart(12)
loop:{
int i = 0
for( imageInstance in (imageInstanceList) ) {
printHtmlPart(13)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(14)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: imageInstance, field: "name"))
})
invokeTag('link','g',40,['action':("show"),'id':(imageInstance.id)],3)
printHtmlPart(15)
expressionOut.print(imageInstance.image.encodeBase64())
printHtmlPart(16)
expressionOut.print(fieldValue(bean: imageInstance, field: "title"))
printHtmlPart(17)
expressionOut.print(fieldValue(bean: imageInstance, field: "description"))
printHtmlPart(17)
invokeTag('formatBoolean','g',50,['boolean':(imageInstance.status)],-1)
printHtmlPart(18)
i++
}
}
printHtmlPart(19)
invokeTag('paginate','g',57,['total':(imageInstanceCount ?: 0)],-1)
printHtmlPart(20)
})
invokeTag('captureBody','sitemesh',60,[:],1)
printHtmlPart(21)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1430928307535L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
