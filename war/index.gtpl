<html>
<head>
  <title>QRCode Linkulator</title>
  <link rel="shortcut icon" href="/images/favicon.ico" type="image/x-icon">
  <link rel="icon" href="/images/favicon.ico" type="image/x-icon">
  <meta name="layout" content="main">
  <style type="text/css" media="screen">
  img {
    border: none;
  }

  h2 {
    color: #48802c;
    margin-top: 10px;
    margin-bottom: 15px;
    font-size: 1.2em;
  }

  #pageBody {
    margin-top: 10%;
    text-align: center;
  }

  a:link, a:visited, a:hover {
    color: #666;
    font-weight: bold;
    text-decoration: none;
  }

  #logo h1 {
    font-size: xx-large;
    color: #48802c;
  }

  #more {
    text-align: left;
    padding-left: 35%;
    width: 40%;
  }

  #sig {
    position: absolute;
    font-size:small;
    right:1em;
    bottom:1em;
  }

  </style>
</head><body>
<div id="pageBody">
  <div id="logo">
    <h1>
      <img src="/images/linkulator.png"
              alt="Linkulator" align="middle" border="0">
      QRCode Linkulator</h1>
  </div>
  <div id="linkulator">
    <form action="/300" method="get" name="linkulate"
            on404="alert('not found!')" id="linkulate">
      URL:&nbsp;<input name="url" size="50" type="text">&nbsp;<input
            name="go" value="Linkulate!" id="go" type="submit">
    </form>
  </div>
</div>
<br>
<br>
<div id="more">
  <ol>
    <li>
      <a href="/install.html">install</a> the
      <a href="javascript:(function(){f='http://qrcodelinkulator.appspot.com/300?url='+encodeURIComponent(window.location.href)+'&amp;';a=function(){if(!window.open(f+'bookmarklet=1','linkulator','location=yes,links=no,scrollbars=no,toolbar=no,width=350,height=350'))location.href=f+'jump=yes'};if(/Firefox/.test(navigator.userAgent)){setTimeout(a,0)}else{a()}})()">linkulate</a>
      bookmarklet <a href="/install.html">here</a>!
    </li>
    <li>
    Get a compatible barcode scanner for your <a href="http://zxing.googlecode.com/files/BarcodeScanner3.21.apk">Android</a>, <a href="http://phobos.apple.com/WebObjects/MZStore.woa/wa/viewSoftware?id=292197557&mt=8">iPhone</a> or other <a href="/scanners.html">phone</a>!
    </li>
    <li> Start Linkulating! </li>
  </ol>
  <br>
  Need a demonstration? See the <a href="http://www.youtube.com/watch?v=5ex8sPrVeLQ">demonstration video</a>. 
  <br>
</div>
        <span id="sig">
          Shawn Hartsock <a href="http://hartsock.blogspot.com">http://hartsock.blogspot.com</a>
          || Notes for <a href="/develop.html">developers</a> 
        </span>
</body>
</html>
