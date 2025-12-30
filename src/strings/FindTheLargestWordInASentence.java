package strings;

public class FindTheLargestWordInASentence {

	public static void main(String[] args) {
		String s="Welcome to Java ababababababababababa";
		String[] s1=s.split(" ");
		String s2=" ";
		
		for(String word:s1)
		{
			if(word.length()>s2.length())
			{
				s2=word;
			}
		}
		
		System.out.println("Largest word is: "+s2);
		

	}

}
