import java.util.*;
class RecursiveFact
{
	public static int fact(int n)
	{
		if(n<=0)
		{
			return 1;
		}
		else
		{
			return n*fact(n-1);
		}
	}
	public static void main(String args[])
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number: ");
		n=s.nextInt();
		int result=fact(n);					
		System.out.println(+result);
	}
}
