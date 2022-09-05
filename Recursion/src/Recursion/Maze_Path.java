package Recursion;

public class Maze_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m=3;
		int n=3;
		printpath(m-1,n-1,0,0,"");
	}
	
	public static void printpath(int er,int ec, int cc, int cr,String ans)
	{
		
		if(cc==ec && cr==er)
		{
			System.out.print(ans+" ");
			return;
		}
		
		if(cc>ec || cr>er)
		{
			return;
		}
		printpath(er,ec,cc+1,cr,ans+"H");
		printpath(er,ec,cc,cr+1,ans+"V");
		
	}

}
