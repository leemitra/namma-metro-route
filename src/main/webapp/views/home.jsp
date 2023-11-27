<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<html>
  <head>
  	<title>Person Information</title>
  	<meta charset="UTF-8">	
        <link rel="stylesheet" type="text/css" href="/resources/css/jquery.dataTables.min.css">
        <link rel="stylesheet" href="/resources/css/bootstrap.min.css">
  <!--script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script -->
	<script type="text/javascript" language="javascript" src="/resources/js/jquery-3.3.1.js"></script>
	<script type="text/javascript" language="javascript" src="/resources/js/jquery.dataTables.min.js"></script>
    <script>
      $(document).ready(function(){
    	 var baseurl = "http://localhost:8080/persons";
    	 var xmlhttp = new XMLHttpRequest();
    	 xmlhttp.open("GET",baseurl+"/all",true);
    	 xmlhttp.onreadystatechange = function(){
    		 if(xmlhttp.readyState==4 && xmlhttp.status ==200){
    			 var persons = JSON.parse(xmlhttp.responseText);
    			 $("#example").DataTable({
    				data:persons,
    				"columns":[
    					{"data":"id"},
    					{"data":"foodName"},
    					{"data":"category"},
    					{"data":"price"}
                                       
    				] ,
                            "aoColumnDefs": [
                               {
                                    "aTargets": [4],
                                    "mData": "id",
                                    "mRender": function (data, type, full) {
                                        return '<button href="#"' + 'id="'+ data + '">Select</button>';
                                    }
                                }
                             ]
    			 });
    		 }
    	 };
    	 xmlhttp.send();
      });
    </script>  
  </head>
  <body>
  <div class="container-fluid">
  <div class="row content">
      <div class="col-sm-2 sidenav"></div>
      
       <div class="col-sm-8">
    <table id="example" class="display" style="width:100%">
    <thead>
	    <tr>
	      <th>Id</th>
	      <th>First Name</th>
	      <th>Last Name</th>
	      <th>Age</th>
	      <th>Select</th>
	    </tr>
    </thead>
    </table>
       </div>
      
       <div class="col-sm-2 sidenav"></div>
  </div>
  </div>    
  </body>
</html>
