import breaktime.Image
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_breaktime_imageshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/image/show.gsp" }
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
invokeTag('message','g',8,['code':("default.show.label"),'args':([entityName])],-1)
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
invokeTag('message','g',12,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',12,['class':("list btn btn-info"),'action':("index")],2)
printHtmlPart(5)
createTagBody(2, {->
invokeTag('message','g',13,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',13,['class':("create btn btn-info"),'action':("create")],2)
printHtmlPart(6)
if(true && (flash.message)) {
printHtmlPart(7)
expressionOut.print(flash.message)
printHtmlPart(8)
}
printHtmlPart(9)
if(true && (imageInstance?.name)) {
printHtmlPart(10)
invokeTag('message','g',23,['code':("image.name.label"),'default':("Name")],-1)
printHtmlPart(11)
invokeTag('fieldValue','g',25,['bean':(imageInstance),'field':("name")],-1)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (imageInstance?.image)) {
printHtmlPart(14)
invokeTag('message','g',32,['code':("image.image.label"),'default':("Image")],-1)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (imageInstance?.title)) {
printHtmlPart(15)
invokeTag('message','g',39,['code':("image.title.label"),'default':("Title")],-1)
printHtmlPart(16)
invokeTag('fieldValue','g',41,['bean':(imageInstance),'field':("title")],-1)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (imageInstance?.description)) {
printHtmlPart(17)
invokeTag('message','g',48,['code':("image.description.label"),'default':("Description")],-1)
printHtmlPart(18)
invokeTag('fieldValue','g',50,['bean':(imageInstance),'field':("description")],-1)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (imageInstance?.status)) {
printHtmlPart(19)
invokeTag('message','g',57,['code':("image.status.label"),'default':("Status")],-1)
printHtmlPart(20)
invokeTag('formatBoolean','g',59,['boolean':(imageInstance?.status)],-1)
printHtmlPart(12)
}
printHtmlPart(21)
createTagBody(2, {->
printHtmlPart(22)
createTagBody(3, {->
invokeTag('message','g',67,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',67,['class':("edit"),'action':("edit"),'resource':(imageInstance)],3)
printHtmlPart(23)
invokeTag('actionSubmit','g',68,['class':("delete btn btn-info"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(24)
})
invokeTag('form','g',70,['url':([resource:imageInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(25)
})
invokeTag('captureBody','sitemesh',72,[:],1)
printHtmlPart(26)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1431041011654L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
