import breaktime.Slide
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_breaktime_slideshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/slide/show.gsp" }
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
invokeTag('set','g',8,['var':("entityName"),'value':(message(code: 'slide.label', default: 'Slide'))],-1)
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
invokeTag('message','g',13,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(2)
})
invokeTag('link','g',14,['class':("list  btn btn-info"),'action':("index")],2)
printHtmlPart(2)
createTagBody(2, {->
printHtmlPart(3)
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
printHtmlPart(2)
})
invokeTag('link','g',17,['class':("create  btn btn-info"),'action':("create")],2)
printHtmlPart(4)
if(true && (flash.message)) {
printHtmlPart(5)
expressionOut.print(flash.message)
printHtmlPart(6)
}
printHtmlPart(7)
if(true && (slideInstance?.image)) {
printHtmlPart(8)
invokeTag('message','g',30,['code':("slide.image.label"),'default':("Image")],-1)
printHtmlPart(9)
}
printHtmlPart(10)
if(true && (slideInstance?.title)) {
printHtmlPart(11)
invokeTag('message','g',36,['code':("slide.title.label"),'default':("Title")],-1)
printHtmlPart(12)
invokeTag('fieldValue','g',38,['bean':(slideInstance),'field':("title")],-1)
printHtmlPart(9)
}
printHtmlPart(10)
if(true && (slideInstance?.content)) {
printHtmlPart(13)
invokeTag('message','g',44,['code':("slide.content.label"),'default':("Content")],-1)
printHtmlPart(14)
invokeTag('fieldValue','g',46,['bean':(slideInstance),'field':("content")],-1)
printHtmlPart(9)
}
printHtmlPart(10)
if(true && (slideInstance?.createdDate)) {
printHtmlPart(15)
invokeTag('message','g',52,['code':("slide.createdDate.label"),'default':("Created Date")],-1)
printHtmlPart(16)
invokeTag('formatDate','g',54,['date':(slideInstance?.createdDate)],-1)
printHtmlPart(9)
}
printHtmlPart(10)
if(true && (slideInstance?.status)) {
printHtmlPart(17)
invokeTag('message','g',60,['code':("slide.status.label"),'default':("Status")],-1)
printHtmlPart(18)
invokeTag('formatBoolean','g',62,['boolean':(slideInstance?.status)],-1)
printHtmlPart(9)
}
printHtmlPart(19)
createTagBody(2, {->
printHtmlPart(20)
createTagBody(3, {->
printHtmlPart(21)
invokeTag('message','g',70,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(22)
})
invokeTag('link','g',71,['class':("edit"),'action':("edit"),'resource':(slideInstance)],3)
printHtmlPart(22)
invokeTag('actionSubmit','g',74,['class':("delete  btn btn-info"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(23)
})
invokeTag('form','g',76,['url':([resource:slideInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(24)
})
invokeTag('captureBody','sitemesh',78,[:],1)
printHtmlPart(25)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1431040354823L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
