package Recursion;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="abca";
		print(str,"");
	}

	public static void print(String ques,String ans)
	{
		
		if(ques.length()==0)
		{
			System.out.println(ans);
			return;
		}
		
		for(int i=0;i<ques.length();i++)
		{
				char ch=ques.charAt(i);
				String remaining=ques.substring(0, i)+ques.substring(i+1);
				
				print(remaining,ans+ch);
				
			
		}
	}
}
