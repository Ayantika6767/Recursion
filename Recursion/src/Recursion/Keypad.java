package Recursion;

public class Keypad {

	static String[] key= {"","abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="12";
		keypad(str,"");
	}

	public static void keypad(String ques, String ans)//if my question was 12
	{
		if(ques.length()==0)
		{
			System.out.println(ans);
			return;
		}
		char ch=ques.charAt(0);// '1' gives me value 49
		
		String pressString = key[ch-48];
		
		for(int i=0;i<pressString.length();i++)
		{
			keypad(ques.substring(1), ans+pressString.charAt(i));
			
			
		}
		
	}
}
