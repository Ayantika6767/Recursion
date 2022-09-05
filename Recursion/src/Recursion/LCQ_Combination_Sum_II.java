package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LCQ_Combination_Sum_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,1,2,7,6,1,5};
		int target = 8;
		Arrays.sort(arr);
		List<Integer> ll= new ArrayList<>();
		
		List <List<Integer>> ans= new ArrayList<>();
		print(arr,target,ll,0,ans);
		System.out.print(ans);

	}
	
	public static void print(int []coin, int amount,List<Integer> ll,int idx,List <List<Integer>> ans)
	{
		if(amount==0)
		{
			ans.add(new ArrayList<>(ll)) ;
			//System.out.print(ll);
			
		}
		for(int i=idx;i<coin.length;i++)
		{
			if(i!=idx && coin[i]==coin[i-1])
			{
				continue;
			}
			if(amount>=coin[i])
			{
				ll.add(coin[i]);
				print(coin,amount-coin[i],ll,i+1,ans);
				ll.remove(ll.size()-1);
			}
		}
	}

}
