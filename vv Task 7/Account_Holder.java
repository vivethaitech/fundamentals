package bank.chennai;

class Account_Holder
{
public static void main(String[] args)
{
SBI sbi = new SBI();
sbi.empId="100";
sbi.empName="Dora";
System.out.println("Branch name: " + SBI.branch_name);
System.out.println("name: " + sbi.empName);
System.out.println("ID: " + sbi.empId);
sbi.create_account();
sbi.get_loan(10000);

}
}
