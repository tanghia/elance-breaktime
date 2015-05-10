import breaktime.Song
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_breaktime_songedit_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/song/edit.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('set','g',6,['var':("entityName"),'value':(message(code: 'song.label', default: 'Song'))],-1)
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
printHtmlPart(1)
createTagBody(2, {->
invokeTag('message','g',10,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',10,['class':("list btn btn-info"),'action':("index")],2)
printHtmlPart(1)
createTagBody(2, {->
invokeTag('message','g',11,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',11,['class':("create btn btn-info"),'action':("create")],2)
printHtmlPart(3)
if(true && (flash.message)) {
printHtmlPart(4)
expressionOut.print(flash.message)
printHtmlPart(5)
}
printHtmlPart(6)
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
invokeTag('message','g',19,['error':(error)],-1)
printHtmlPart(12)
})
invokeTag('eachError','g',20,['bean':(songInstance),'var':("error")],3)
printHtmlPart(13)
})
invokeTag('hasErrors','g',22,['bean':(songInstance)],2)
printHtmlPart(6)
createTagBody(2, {->
printHtmlPart(14)
invokeTag('hiddenField','g',24,['name':("version"),'value':(songInstance?.version)],-1)
printHtmlPart(15)
invokeTag('render','g',26,['template':("form")],-1)
printHtmlPart(16)
invokeTag('actionSubmit','g',29,['class':("save btn btn-info"),'action':("update"),'value':(message(code: 'default.button.update.label', default: 'Update'))],-1)
printHtmlPart(17)
})
invokeTag('form','g',31,['url':([resource:songInstance, action:'update']),'method':("PUT")],2)
printHtmlPart(18)
})
invokeTag('captureBody','sitemesh',33,[:],1)
printHtmlPart(19)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1431039890432L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
