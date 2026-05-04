<%@ page import="java.lang.*"%>
<!DOCTYPE>
<html lang="en">
<head><title>Bank App</title></head>

<body>
<form method="POST">
Enter amount:<input type="text" name="amt">

<select name="op">
<option value="deposit">Deposit</option> 
<option value="withdraw">Withdraw</option> 
</select>

<input type="submit" value="calculate">

</form>

<hr>

<%
App bank=(App) Application.getAttribute("bank");
if(bank==null){
bank=new App();
Application.setAttribute("bank",bank);
}


if(request.getParameter("amt")!=null){
int amount=Integer.parseInt(request.getParameter("amt"));
String res="";
String op=request.getParameter("op");
if(op.equals("deposit"){
res=bank.deposit(amount);
}
else{
res=bank.withdraw(amount);
}
}
%>

<h3>Balance:<%=res%></h3>

</body>
</html>
