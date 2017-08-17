import java.util.Scanner;
public class reverse

{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		StringBuffer sb=new StringBuffer(s);
		s=sb.reverse().toString();
		System.out.println(s);
	}

}