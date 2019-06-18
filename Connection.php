<?php
$servername='localhost';
$username="root";
$password="";
$db="mgrUsers";
$con=new mysqli($servername,$username,$password,$db);
if($con->connect_error){
	
	$er=["massage"=>"connect error"];
	echo die(json_encode($er));
	
} else{
	echo("Pass");
}





?>