function fn() {

  var config = {
	baseUrl: 'http://localhost:9000'
  }
  karate.configure('proxy',  { uri: 'http://localhost:9000'});
  return config;
}