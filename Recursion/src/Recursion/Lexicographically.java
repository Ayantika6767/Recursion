package Recursion;

public class Lexicographically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=1000;
		printcount(0,n);
	}

	public static void printcount(int start,int end)
	{
		if(start>end)
		{
			return;
		}
		System.out.println(start);
		
		int i=0;
		
		if(start==0)
		{
			i=1;
		}
		for(;i<=9;i++)
		{
			printcount(start*10+i,end);
		}
	}
}
