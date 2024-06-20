public class Calculator
{
public static void main(String[] args)
{
Calculator calc = new Calculator();
calc.add();
calc.subtract();
calc.multiply();
calc.divide();

}
public void add()
{
System.out.println("The Addition of 30 and 10 is "+(30+10));
}
public void subtract()
{
System.out.println("The subraction of 30 and 10 is "+(30-10));
}
public void multiply()
{
System.out.println("The multiplication of 30 and 10 is "+(30*10));
}
public void divide()
{
System.out.println("The divition of 30 and 10 is "+(30/10));
}
}


