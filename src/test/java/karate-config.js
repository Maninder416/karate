function fn() {

  var config = {
	baseUrl: 'http://localhost:9000'
  }
  karate.configure('driverTarget', { docker: 'ptrthomas/karate-chrome', secComp: 'src/test/java/chrome.json', vncPort: 5900 });
  return config;
}