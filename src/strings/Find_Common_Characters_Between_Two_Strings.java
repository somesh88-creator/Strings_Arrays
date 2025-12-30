package strings;

public class Find_Common_Characters_Between_Two_Strings {

	public static void main(String[] args) {
		String s1="Somesh";
		String s2="Romesh Chat";
		
		char ch1=' ';
		char ch2=' ';
		boolean[] visited=new boolean[256];
		System.out.println("common characters are: ");
		for(int i=0;i<s1.length();i++)
		{
			ch1=s1.charAt(i);
			
			for(int j=0;j<s2.length();j++)
			{
				ch2=s2.charAt(j);
				if(ch1==ch2)
				{
					System.out.print(ch1);
				}
			}
			System.out.print(" ");
		}

	}

}
