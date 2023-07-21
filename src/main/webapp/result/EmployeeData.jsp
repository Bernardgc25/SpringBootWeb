<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "f"%>
<html>
   <head>
      <title>Spring MVC Form Handling</title>
   </head>

   <body>
      <h2>Student Information</h2>
     <f:form action="insertUser" method="post" modelAttribute="edata">
     <table>
     <tr>
     <td>
     <f:label path="fname">First Name</f:label>
     </td>
     <td>
     <f:input path="fname"/>
     </td>
     </tr>
     <tr>
     <td>
     <f:label path="lname">Last Name</f:label>
     </td>
     <td>
     <f:input path="lname"/>
     </td>
     </tr>
     <tr>
     <td>
     <f:label path="salary">Salary</f:label>
     </td>
     <td>
     <f:input path="salary"/>
     </td>
     </tr>
     <tr>
     	<Td></Td>
     	<td><input type="submit" value="Login"/></td>
     </tr>
     	   </table>
     </f:form>