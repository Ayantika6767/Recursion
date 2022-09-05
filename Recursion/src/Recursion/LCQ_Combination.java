package Recursion;

import java.util.ArrayList;
import java.util.List;

public class LCQ_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean board[]=new boolean[4];
		int nof_queen=2;
		List<Integer> ll= new ArrayList<>();
		
		List <List<Integer>> ans= new ArrayList<>();
		
		Queen(board,nof_queen,0,0,ll,ans);
		System.out.println(ans);

	}
	
	public static void Queen(boolean[] board,int tq,int qpsf,int idx,List<Integer> ll , List <List<Integer>> ans)
	{
		if(tq==qpsf)
		{
			//System.out.println(ll);
			ans.add(new ArrayList<Integer>(ll));
			return;
		}
		
		for(int i=1;i<board.length;i++)
		{
			if(board[i]==false)
			{
				board[i]=true;
				ll.add(i+1);
				Queen(board,tq,qpsf+1, i+1,ll,ans);
				ll.remove(ll.size()-1);
				board[i]=false;
				
			}
		}
	}

}
