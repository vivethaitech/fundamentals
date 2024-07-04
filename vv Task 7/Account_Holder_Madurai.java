package bank.madurai;
 import bank.chennai.SBI;
class Account_Holder_madurai
{
public static void main(String[] args)
{
SBI statebank = new SBI();
statebank.empId="200";
statebank.empName="bujji";
System.out.println("Brance name : " +SBI.branch_name);
System.out.println("name: " + statebank.empName);
System.out.println("ID: " + statebank.empId);
statebank.get_loan(5000);
statebank.create_account();
}
}
