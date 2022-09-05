package Recursion;

public class Print_inc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		printinc(n);
	}
	public static void printinc(int n)
	{
		
		if (n==0)
		return;
		
		printinc(n-1);
		System.out.println(n);//i print only this rest will be printed by recursion
		
		
	}
}
