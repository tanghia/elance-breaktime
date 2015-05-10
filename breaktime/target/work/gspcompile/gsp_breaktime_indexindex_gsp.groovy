import breaktime.User
import breaktime.Slide
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_breaktime_indexindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/index/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',7,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(0)
})
invokeTag('captureHead','sitemesh',8,[:],1)
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(2)
for( i in ((0..< slideInstanceCount)) ) {
printHtmlPart(3)
if(true && (i==0)) {
printHtmlPart(4)
expressionOut.print(i)
printHtmlPart(5)
}
else {
printHtmlPart(4)
expressionOut.print(i)
printHtmlPart(6)
}
printHtmlPart(3)
}
printHtmlPart(7)
loop:{
int i = 0
for( slide in (slideInstanceList) ) {
printHtmlPart(8)
if(true && (i==0)) {
printHtmlPart(9)
expressionOut.print(slide.image?.encodeBase64())
printHtmlPart(10)
expressionOut.print(slide.title)
printHtmlPart(11)
expressionOut.print(slide.title)
printHtmlPart(12)
expressionOut.print(slide.content)
printHtmlPart(13)
}
else {
printHtmlPart(14)
expressionOut.print(slide.image?.encodeBase64())
printHtmlPart(10)
expressionOut.print(slide.title)
printHtmlPart(11)
expressionOut.print(slide.title)
printHtmlPart(12)
expressionOut.print(slide.content)
printHtmlPart(13)
}
printHtmlPart(3)
i++
}
}
printHtmlPart(15)
loop:{
int i = 0
for( user in (userInstanceList) ) {
printHtmlPart(16)
if(true && (user.photo)) {
printHtmlPart(17)
expressionOut.print(user.photo?.encodeBase64())
printHtmlPart(18)
}
else {
printHtmlPart(19)
expressionOut.print(resource(dir: 'images', file: 'User_Circle.png'))
printHtmlPart(20)
}
printHtmlPart(21)
expressionOut.print(user.fullName)
printHtmlPart(22)
expressionOut.print(user.days.size())
printHtmlPart(23)
i++
}
}
printHtmlPart(24)
})
invokeTag('captureBody','sitemesh',112,[:],1)
printHtmlPart(25)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1431086999210L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
