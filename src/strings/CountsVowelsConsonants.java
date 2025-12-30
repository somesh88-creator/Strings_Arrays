package strings;

public class CountsVowelsConsonants {

	public static void main(String[] args) {
		String s="Somesh123";
		
		String s1=s.toLowerCase(); 
		
		int v=0;
		int c=0;
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s1.charAt(i);
			
			if(ch>='a' && ch<='z')
			{
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				{
					v++;
				}
				else
				{
					c++;
				}
			}
			
		}
		System.out.println("total vowels: "+v);
		System.out.println("total consonants: "+c);

	}

}
