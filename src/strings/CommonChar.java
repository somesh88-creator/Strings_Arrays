package strings;

public class CommonChar {

	public static void main(String[] args) {
		String s1="sam";
		String s2="somu";
		
		char ch1=' ';
		char ch2=' ';
		
		for(int i=0;i<s1.length();i++)
		{
			ch1=s1.charAt(i);
			for(int j=0;j<s2.length();j++)
			{
				ch2=s2.charAt(j);
				if(ch1==ch2)
				{
					System.out.println("common character is: "+ch1);
				}
			}
		}

	}

}
