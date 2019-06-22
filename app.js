var mysql       = require('mysql');
var express     = require("express");
var bodyParser = require("body-parser");


var app = express();




app.use(bodyParser.json());
app.use(bodyParser.urlencoded({extended:false}));


    app.post("/login",(req,res)=>
    {
    
        console.log(JSON.stringify(req.body));
    
        var connection = mysql.createConnection({
            host     : 'localhost',
            user     : 'root',
            password : '',
            database : 'mn'


          });
          connection.connect();
          console.log(JSON.stringify(req.body));

          var sqlQ = `select *from managers where 
          Email= '${req.body.email}' and password=${req.body.password};`
    
          connection.query(sqlQ, function (error, results, fields) {
            if (results.length==1){
               res.json({  "id": results[0].id, "States":"Good" });

            }else{
                res.json({  "id": "access denied","States":"Bad" });

            }
           
          });
          
        
          connection.end();
    });
    

    
    app.post("/Request",(req,res)=>
    {
    
        console.log(JSON.stringify(req.body));
    
        var connection = mysql.createConnection({
            host     : 'localhost',
            user     : 'root',
            password : '',
            database : 'mn'


          });
          connection.connect();
          console.log(JSON.stringify(req.body));


          var sqlQ = `INSERT INTO request ( name,email,body,Managers_id,done) 
          VALUES ('${req.body.name}','${req.body.email}', '${req.body.body}','${req.body.Managers_id}',1);`;
    
          connection.query(sqlQ, function (error, results, fields) {
            if (error){
                var loginin={msg:'Eroor'}
                    res.send(loginin);
              
            }else{
                var loginin={msg:"Reqouest send "}
                res.send(loginin);
            }
           
          });
           
        
          connection.end();
    });




    app.post("/MyRequest",(req,res)=>
    {
    
        console.log(JSON.stringify(req.body));
    
        var connection = mysql.createConnection({
            host     : 'localhost',
            user     : 'root',
            password : '',
            database : 'mn'


          });
          connection.connect();
          console.log(JSON.stringify(req.body));


          var sqlQ = `SELECT * FROM request WHERE Managers_id=${req.body.id}`;
          console.log(sqlQ);

    
          connection.query(sqlQ, function (error, results, fields) {
            if (error){
                var loginin={msg:'Eroor'}
                    res.send(loginin);
              
            }else{
                res.send(results);
            }
           
          });
           
        
          connection.end();
    });




    app.post("/Managers",(req,res)=>
    {
    
        console.log(JSON.stringify(req.body));
    
        var connection = mysql.createConnection({
            host     : 'localhost',
            user     : 'root',
            password : '',
            database : 'mn'


          });
          connection.connect();
          console.log(JSON.stringify(req.body));


          var sqlQ = `SELECT * FROM managers`;
          connection.query(sqlQ, function (error, results, fields) {
            if (error){
                var loginin={msg:'Eroor'}
                    res.send(loginin);
              
            }else{
                res.send(results);
            }
           
          });
           
        
          connection.end();
    });










app.listen(8080,()=>
{

    console.log("port 8080");

});