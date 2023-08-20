<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.test.java.model.StudentInfo"%>
<%@page import="com.test.java.model.Department"%>
<%@page import="com.test.java.model.Student"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Welcome Page </title>
</head>
<body>
	<br />

			<div >
				Welcome <%= request.getAttribute("username") %>
			</div>
			<div>
			<br />
					<table border="1" cellpadding="2"  >
								<tr style="background-color:blue;color:white; font-size:16px;" >
									<td>Department
									</td>
									<td>Student ID
									</td>
									<td>Marks
									</td>
									<td>Pass %
									</td>
								</tr>
						<!--  Looping Data Here -->
						<%  
						    StudentInfo studentInfoObj = (StudentInfo) request.getAttribute("studentInfoObj");
							ArrayList<Department> departmentList = ( ArrayList<Department> ) studentInfoObj.getDeptList();
							int totalDept = departmentList.size();
							
							
						%>
									
							<!-- Looping Department  -->
								<%  for(int x = 0 ; x < totalDept ; x++ ) {
									Department deptObj = (Department) departmentList.get(x);
									ArrayList<Student> studentList = (ArrayList<Student>) deptObj.getStudents();
								%>	
										
										
												<%   
													
													for(int y = 0 ; y < studentList.size() ; y++ ) {
													 Student studentObj = (Student) studentList.get(y);
												%>	
										 <tr>		
											 <td ><%= deptObj.getDeptName() %></td>			
											 <td  onClick="alert('<%= studentObj.getStudentName() %>' )" > 
											     <a href="" style="text-decoration-line: underline;">
											     	<%= studentObj.getStudentID() %>
											     </a>
											 </td>
											 <td><%= studentObj.getMarks() %></td>
											 <td><%= (double) deptObj.getPassPercentage() %></td>						
										 </tr>	 
												<% 	 
												    }
												%>
										
										
										
								<%	
								    }
								%>
						
					</table>
			</div>
	
</body>
</html>