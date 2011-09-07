import com.appspot.qrcodelinkulator.QRCodeRenderer
/**
 * @author Shawn Hartsock <hartsock@acm.org>
 */
// start by handling request parameters. Allow
// for polymorphic uses of this servlet by handling
// parameter mapping this way. If any parameter
// other than 'size' is defined we use that as our
// data parameter.
Map params = request.getParameterMap()
def size = params.size[0].toString().toInteger().intValue()
def data = params['url']?.getAt(0)
if(!data) { data = params['data']?.getAt(0) }
if(!data) { data = params['text']?.getAt(0) }
if(!data) { data = params['u']?.getAt(0) }
if(!data) {
  data = request.getQueryString().replaceFirst("size=$size\\W?","")
}
if(!data) { data = request.getHeader('REFERER') }
//response.setContentType("text/plain")
//println """size: $size"""
//println "data: $data"
if(size && data) {
  response.setContentType("image/png")
  new QRCodeRenderer().renderPng(data,size,sout)
}
else {
  response.sendRedirect('http://qrcodelinkulator.appspot.com/images/linkulator.png') 
}
