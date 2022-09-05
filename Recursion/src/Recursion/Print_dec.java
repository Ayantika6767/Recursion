package Recursion;

public class Print_dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		printdec(n);
	}
	public static void printdec(int n)
	{
		
		if (n==0)
		return;
		
		System.out.println(n);//i print only this rest will be printed by recursion
		printdec(n-1);
		
	}
}
