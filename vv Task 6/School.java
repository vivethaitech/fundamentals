class School
{
static String school_name="St.Antony's Primary School";
int mark;
private int salary=30000;
void conduct_exams()
{
System.out.println("Teacher conducting the exams");
}
void publish_results(int mark)
{
System.out.println("Mark is " +mark);
}

public int getSalary()
{
return salary;
}
}

