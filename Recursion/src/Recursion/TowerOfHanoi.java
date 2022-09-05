package Recursion;

public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=3;
		printSteps(n," source"," helper"," destination");
	}

	public static void printSteps(int n, String s, String h, String d)
	{
		if(n==0)
		{
			return;
		}
		
		printSteps(n-1,s,d,h);
		System.out.println("Move "+n+"th disk from"+s+" to"+d);
		printSteps(n-1,h,s,d);
	}
}
