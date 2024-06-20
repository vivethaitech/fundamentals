class Teacher
{
public static void main(String[] args)
{
School teacher = new School();
teacher.conduct_exams();
teacher.publish_results(75);
System.out.println("school name : "+ School.school_name);
System.out.println("Teacher Salary is :"+teacher.getSalary());
}
}
