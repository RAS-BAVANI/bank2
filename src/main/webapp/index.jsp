<%@ page import="com.bank.bank.App"%>
<!DOCTYPE html>
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



<%
App bank=(App) session.getAttribute("bank");
if(bank==null){
bank=new App();
session.setAttribute("bank",bank);
}

String res="";
int balance=0;
if(request.getParameter("amt")!=null){
int amount=Integer.parseInt(request.getParameter("amt"));

String op=request.getParameter("op");
if(op.equals("deposit")){
balance=bank.deposit(amount);
}
else{
balance=bank.withdraw(amount);
}
}

res=String.valueOf(balance);
%>

<h3>Balance:<%=res%></h3>

</body>
</html>
