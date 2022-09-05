package Recursion;
import java.util.*;
public class LCQ_Combination_Sum {

	
public static void main(String[] args) {
				// TODO Auto-generated method stub
				
							int[] coin= {2,3,6,7};
								int amount=7;
								
								List<Integer> ll= new ArrayList<>();
								
								List <List<Integer>> ans= new ArrayList<>();
								print(coin,amount,ll,0,ans);
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
									if(amount>=coin[i])
									{
										ll.add(coin[i]);
										print(coin,amount-coin[i],ll,i,ans);
										ll.remove(ll.size()-1);
									}
								}
							}
						}

					


