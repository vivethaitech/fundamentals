public class EB_Reading
{ 
public static void main(String[] args)
{
EB_Reading assessor = new EB_Reading();
int consumed_units = assessor.reading();
int payment = assessor.calculate(consumed_units);
System.out.println("The payment for "+consumed_units+ " consumed units is : " +payment);
}
public int reading()
{
return 250;
}

public int calculate(int consumedUnits)
{
 int ratePerUnit = 10;
 return consumedUnits * ratePerUnit;
}
}
