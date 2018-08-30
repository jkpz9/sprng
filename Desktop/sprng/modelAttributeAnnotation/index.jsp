<form:form method="POST" action="/spring-mvc-java/addEmployee"
  modelAttribute="employee">
    <form:label path="name">Name</form:label>
    <form:input path="name" />
     
    <form:label path="id">Id</form:label>
    <form:input path="id" />
     
    <input type="submit" value="Submit" />
</form:form>