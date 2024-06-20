class Theatre
{
String movieName;
int movieTime;
public static void main(String[] args)
{
Theatre movie1 = new Theatre();
Theatre movie2 = new Theatre();
movie1.movieName = "Jailer";
movie1.movieTime = 630;
movie2.movieName = "Leo";
movie2.movieTime = 7;
movie1.watch_movie();
movie2.watch_movie();
}

public void watch_movie()
{
 System.out.println("watching "+movieName);
 System.out.println("Show time is "+movieTime);
}
}
