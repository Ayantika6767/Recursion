package Recursion;

public class LCQ_Generate_Parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=3;
		Parenthesis(n,0,0,"");
		//List<String> list = new ArrayList<>();
		
		//Parenthesis_leet(n,0,0,"",list );
		//System.out.println(list);
	}

	public static void Parenthesis(int n, int op,int c, String ans)
	{
		if(op==n && c==n)
		{
			System.out.println(ans);
			return;
			
		}
		
		if(op<n)
		{
			Parenthesis(n,op+1,c,ans+"(" ); 
		}
		
		if(c<op)
		{
		Parenthesis(n,op,c+1,ans+")");
		}
	}
		
		
	/*	public static void Parenthesis_leet(int n, int op,int c, String ans,List<String> list)
		{
			if(op==n && c==n)
			{
				//System.out.println(ans);
				list.add(ans);
				return;
				
			}
			
			if(op<n)
			{
				Parenthesis_leet(n,op+1,c,ans+"(",  list); 
			}
			
			if(c<op)
			{
			Parenthesis_leet(n,op,c+1,ans+")", list);
			}
			
	}*/
	
}
