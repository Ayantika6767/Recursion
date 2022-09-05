package Recursion;

public class Coin_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] coin= {2,3,5,6};
		int amount=10;
		print(coin,amount,"");
	}

	public static void print(int []coin, int amount,String ans)
	{
		if(amount==0)
		{
			System.out.println(ans);
		}
		for(int i=0;i<coin.length;i++)
		{
			if(amount>=coin[i])
			{
				print(coin,amount-coin[i],ans+coin[i]);
			}
		}
	}
}
