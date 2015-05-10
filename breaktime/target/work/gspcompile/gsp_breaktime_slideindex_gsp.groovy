import breaktime.Slide
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_breaktime_slideindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/slide/index.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'slide.label', default: 'Slide'))],-1)
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
invokeTag('sortableColumn','g',23,['property':("image"),'title':(message(code: 'slide.image.label', default: 'Image'))],-1)
printHtmlPart(11)
invokeTag('sortableColumn','g',25,['property':("title"),'title':(message(code: 'slide.title.label', default: 'Title'))],-1)
printHtmlPart(11)
invokeTag('sortableColumn','g',27,['property':("content"),'title':(message(code: 'slide.content.label', default: 'Content'))],-1)
printHtmlPart(11)
invokeTag('sortableColumn','g',29,['property':("createdDate"),'title':(message(code: 'slide.createdDate.label', default: 'Created Date'))],-1)
printHtmlPart(11)
invokeTag('sortableColumn','g',31,['property':("status"),'title':(message(code: 'slide.status.label', default: 'Status'))],-1)
printHtmlPart(12)
loop:{
int i = 0
for( slideInstance in (slideInstanceList) ) {
printHtmlPart(13)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(14)
createTagBody(3, {->
printHtmlPart(15)
expressionOut.print(slideInstance.image.encodeBase64())
printHtmlPart(16)
})
invokeTag('link','g',39,['action':("show"),'id':(slideInstance.id)],3)
printHtmlPart(17)
expressionOut.print(fieldValue(bean: slideInstance, field: "title"))
printHtmlPart(17)
expressionOut.print(fieldValue(bean: slideInstance, field: "content"))
printHtmlPart(17)
invokeTag('formatDate','g',45,['date':(slideInstance.createdDate)],-1)
printHtmlPart(17)
invokeTag('formatBoolean','g',47,['boolean':(slideInstance.status)],-1)
printHtmlPart(18)
i++
}
}
printHtmlPart(19)
invokeTag('paginate','g',54,['total':(slideInstanceCount ?: 0)],-1)
printHtmlPart(20)
})
invokeTag('captureBody','sitemesh',57,[:],1)
printHtmlPart(21)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1430928071267L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
