package Recursion;

public class Queen_Placed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean board[]=new boolean[4];
		int nof_queen=2;
		
		Queen(board,nof_queen,0,"");

	}
	public static void Queen(boolean[] board,int tq,int qpsf,String ans )
	{
		if(tq==qpsf)
		{
			System.out.println(ans);
			return;
		}
		
		for(int i=0;i<board.length;i++)
		{
			if(board[i]==false)
			{
				board[i]=true;
				Queen(board,tq,qpsf+1, ans+"b"+i+"q"+qpsf+" ");
				
			}
		}
	}

}
