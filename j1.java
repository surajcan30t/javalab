import java.util.Scanner;
abstract class stud
{
	String s;
	void show()
	{}
}
class details extends stud
{
	String s;
	void show(String a)
	{
		System.out.println("First student name is "+a);
	}
}

class j1
{
	public static void main(String args[])
	{
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student name");
		s = sc.next();
		details d1 = new details();
         d1.show(s);

	}
}
