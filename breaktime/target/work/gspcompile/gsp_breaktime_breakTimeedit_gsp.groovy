import breaktime.BreakTime
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_breaktime_breakTimeedit_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/breakTime/edit.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'breakTime.label', default: 'BreakTime'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.edit.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(1)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
createTagBody(2, {->
printHtmlPart(3)
invokeTag('message','g',12,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(2)
})
invokeTag('link','g',13,['class':("list btn btn-info"),'action':("index")],2)
printHtmlPart(2)
createTagBody(2, {->
printHtmlPart(3)
invokeTag('message','g',15,['code':("default.new.label"),'args':([entityName])],-1)
printHtmlPart(2)
})
invokeTag('link','g',16,['class':("create btn btn-info"),'action':("create")],2)
printHtmlPart(4)
if(true && (flash.message)) {
printHtmlPart(5)
expressionOut.print(flash.message)
printHtmlPart(6)
}
printHtmlPart(3)
createTagBody(2, {->
printHtmlPart(7)
createTagBody(3, {->
printHtmlPart(8)
if(true && (error in org.springframework.validation.FieldError)) {
printHtmlPart(9)
expressionOut.print(error.field)
printHtmlPart(10)
}
printHtmlPart(11)
invokeTag('message','g',29,['error':(error)],-1)
printHtmlPart(12)
})
invokeTag('eachError','g',30,['bean':(breakTimeInstance),'var':("error")],3)
printHtmlPart(13)
})
invokeTag('hasErrors','g',32,['bean':(breakTimeInstance)],2)
printHtmlPart(3)
createTagBody(2, {->
printHtmlPart(14)
invokeTag('hiddenField','g',35,['name':("version"),'value':(breakTimeInstance?.version)],-1)
printHtmlPart(15)
invokeTag('render','g',37,['template':("form")],-1)
printHtmlPart(16)
invokeTag('actionSubmit','g',41,['class':("save btn btn-info"),'action':("update"),'value':(message(code: 'default.button.update.label', default: 'Update'))],-1)
printHtmlPart(17)
})
invokeTag('form','g',43,['url':([resource:breakTimeInstance, action:'update']),'method':("PUT")],2)
printHtmlPart(18)
})
invokeTag('captureBody','sitemesh',45,[:],1)
printHtmlPart(19)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1431038422009L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
