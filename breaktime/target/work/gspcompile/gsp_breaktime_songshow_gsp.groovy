import breaktime.Song
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_breaktime_songshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/song/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'song.label', default: 'Song'))],-1)
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
printHtmlPart(2)
createTagBody(2, {->
invokeTag('message','g',11,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',11,['class':("list btn btn-info"),'action':("index")],2)
printHtmlPart(2)
createTagBody(2, {->
invokeTag('message','g',12,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',12,['class':("create btn btn-info"),'action':("create")],2)
printHtmlPart(4)
if(true && (flash.message)) {
printHtmlPart(5)
expressionOut.print(flash.message)
printHtmlPart(6)
}
printHtmlPart(7)
if(true && (songInstance?.name)) {
printHtmlPart(8)
invokeTag('message','g',21,['code':("song.name.label"),'default':("Name")],-1)
printHtmlPart(9)
invokeTag('fieldValue','g',23,['bean':(songInstance),'field':("name")],-1)
printHtmlPart(10)
}
printHtmlPart(11)
if(true && (songInstance?.description)) {
printHtmlPart(12)
invokeTag('message','g',30,['code':("song.description.label"),'default':("Description")],-1)
printHtmlPart(13)
invokeTag('fieldValue','g',32,['bean':(songInstance),'field':("description")],-1)
printHtmlPart(10)
}
printHtmlPart(11)
if(true && (songInstance?.url)) {
printHtmlPart(14)
invokeTag('message','g',39,['code':("song.url.label"),'default':("Url")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',41,['bean':(songInstance),'field':("url")],-1)
printHtmlPart(10)
}
printHtmlPart(11)
if(true && (songInstance?.status)) {
printHtmlPart(16)
invokeTag('message','g',48,['code':("song.status.label"),'default':("Status")],-1)
printHtmlPart(17)
invokeTag('formatBoolean','g',50,['boolean':(songInstance?.status)],-1)
printHtmlPart(10)
}
printHtmlPart(18)
createTagBody(2, {->
printHtmlPart(19)
createTagBody(3, {->
invokeTag('message','g',58,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',58,['class':("edit"),'action':("edit"),'resource':(songInstance)],3)
printHtmlPart(20)
invokeTag('actionSubmit','g',59,['class':("delete btn btn-info"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(21)
})
invokeTag('form','g',61,['url':([resource:songInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(22)
})
invokeTag('captureBody','sitemesh',63,[:],1)
printHtmlPart(23)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1431039829378L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
