package strings;

public class ReverseString2 {

	public static void main(String[] args) {
		String s="wow";
		char ch=' ';
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			ch=s.charAt(i);
			rev=rev+ch;
		}
		System.out.println(rev);
		
		String[] words=s.split(" ");
		System.out.println();
		for(int i=0;i<words.length;i++)
		{
			for(int j=words[i].length()-1;j>=0;j--)
			{
				System.out.print(words[i].charAt(j));
			}
			System.out.print(" ");
		}
		
		if(s.equalsIgnoreCase(rev))
		{
			System.out.println("palindrome");			
			
		}
		else
		{
			System.out.println("not palindrome");
		}

	}

}
