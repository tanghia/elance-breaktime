import breaktime.Slide
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_breaktime_slideedit_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/slide/edit.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('set','g',6,['var':("entityName"),'value':(message(code: 'slide.label', default: 'Slide'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',7,['code':("default.edit.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',7,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',7,[:],2)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',8,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
createTagBody(2, {->
invokeTag('message','g',11,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',11,['class':("list  btn btn-info"),'action':("index")],2)
printHtmlPart(4)
createTagBody(2, {->
invokeTag('message','g',12,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',12,['class':("create  btn btn-info"),'action':("create")],2)
printHtmlPart(5)
if(true && (flash.message)) {
printHtmlPart(6)
expressionOut.print(flash.message)
printHtmlPart(7)
}
printHtmlPart(8)
createTagBody(2, {->
printHtmlPart(9)
createTagBody(3, {->
printHtmlPart(10)
if(true && (error in org.springframework.validation.FieldError)) {
printHtmlPart(11)
expressionOut.print(error.field)
printHtmlPart(12)
}
printHtmlPart(13)
invokeTag('message','g',22,['error':(error)],-1)
printHtmlPart(14)
})
invokeTag('eachError','g',23,['bean':(slideInstance),'var':("error")],3)
printHtmlPart(15)
})
invokeTag('hasErrors','g',25,['bean':(slideInstance)],2)
printHtmlPart(8)
createTagBody(2, {->
printHtmlPart(4)
invokeTag('hiddenField','g',27,['name':("version"),'value':(slideInstance?.version)],-1)
printHtmlPart(16)
invokeTag('render','g',29,['template':("form")],-1)
printHtmlPart(17)
invokeTag('actionSubmit','g',32,['class':("save  btn btn-info"),'action':("update"),'value':(message(code: 'default.button.update.label', default: 'Update'))],-1)
printHtmlPart(18)
})
invokeTag('form','g',34,['url':([resource:slideInstance, action:'update']),'method':("PUT"),'enctype':("multipart/form-data")],2)
printHtmlPart(19)
})
invokeTag('captureBody','sitemesh',36,[:],1)
printHtmlPart(20)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1431040403081L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
