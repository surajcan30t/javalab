import java.util.Scanner;
interface device
{
	void disp();
	
}
interface price
{
	void disp2();
}

class printer implements device, price
{
	String name;
	int mrp;
	int cost;
	printer(String n, int m, int c)
	{
		name = n;
		mrp = m;
		cost = c;
	}
        public void disp()
	{
		System.out.println("Choosen model: "+name);
	}
        public void disp2()
	{
		System.out.println("Price of the laptop is : "+mrp);
	}
        void disp3(){
		System.out.println("Total cost with gst will be : "+cost);
        }
}
class j2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter model name");
		String name = sc.next();
		System.out.println("Enter mrp");
		int mrp = sc.nextInt();
		System.out.println("Enter cost after gst");
		int cost = sc.nextInt();
		printer p = new printer(name,mrp,cost);
		System.out.println();
		System.out.println();
		p.disp();
		p.disp2();
		p.disp3();
	}

}
