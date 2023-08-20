<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<script src="https://code.jquery.com/jquery-3.7.0.min.js"></script>
</head>
 <body>
 <br /><br />
        <form method="post" id="formLogin"  >
            <center>
            <table border="1" width="30%" cellpadding="3">
                <thead>
                    <tr>
                        <th colspan="2" style="background-color:blue;color:white;font-weight:bold;">Login</th>
                    </tr>
                </thead>
                <tbody>
                	<tr>
                		 <td colspan=2 style="color:red" >
                		 	<% if(request.getParameter("message") != null ) {
                		 	%>
                		 	
                		 		 <%=   request.getParameter("message") %>
                		 	<%
                		 	   }
                		 	  %>
                		 </td>
                		 
                		
                	</tr>
                    <tr>
                        <td>User ID</td>
                        <td><input type="texSt" name="username" id="username"  value="" /></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="password" id="password" value="" /></td>
                    </tr>
                    <tr>
                        <td colspan=2 ><button id="submit">Login</button></td>
                        
                        <script type="text/javascript">
                        	$("#submit").click( 
                        		function() { 
                        		 
                        		 if ( $("#username").val() == "" ) { 
                        			  alert ("please input User Id");
			
                        		 	} else if ( $("#password").val() == "" ) { 
                        			  alert ("please input Password");

                        		    } else {  
                        		    	 $('#formLogin').attr('action', "ValidateLogin");
                         			     
                     	                  
                            		    }
                        	    }
                        	) ;
                        </script>
                        
                    </tr>
                </tbody>
            </table>
            </center>
        </form><br><br>

    </body>
</html>