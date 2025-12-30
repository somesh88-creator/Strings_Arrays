package strings;

public class Check_If_a_String_Has_Only_Alphabets {

	static boolean isAlphabet(String str)
	{
		char ch=' ';
		
		for(int i=0;i<str.length();i++)
			{
				ch=str.charAt(i);
				if(ch<'a' || ch>'z')
					{
						return false;
					}
			
			}
		return true;
	}
	
	public static void main(String[] args) {
		String s="somesh";
		System.out.println("The string has only alphabets: "+isAlphabet(s));

	}

}
