package Recursion;

public class Coin_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
				int[] coin= {2,3,5,6};
				int amount=10;
				print(coin,amount,"",0);
			}

			public static void print(int []coin, int amount,String ans,int idx)
			{
				if(amount==0)
				{
					System.out.println(ans);
				}
				for(int i=idx;i<coin.length;i++)
				{
					if(amount>=coin[i])
					{
						print(coin,amount-coin[i],ans+coin[i],i);
					}
				}
			}
		}

	
