import java.util.Scanner;
public class LabExer1B
{
	public static void main(String []args)
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a integer");
		int x=in.nextInt();
		ShowNumberPlus10(x);
		ShowNumberPlus100(x);
		ShowNumberPlus1000(x);
	}
	public static void ShowNumberPlus10(int x)
	{
		int a= 10 + x;
		System.out.println( x + "plus 10 is" +a);
	}
	public static void ShowNumberPlus100(int x)
	{
		int b= 100 + x;
		System.out.println( x + "plus 100 is" +b);
	}
		public static void ShowNumberPlus1000(int x)
	{
		int c= 1000 + x;
		System.out.println( x + "plus 1000 is" +c);
	}
	

}