var http =  require('http');
http.createServer(function (req,res)
{
  res.write("hello world");
  res.end();
}).listen(8080);
//simple code snippet to create the srver enviornment using Node.js.
