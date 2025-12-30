package strings;

public class LargestWord {

	public static void main(String[] args) {
		String s="It is the latgest city";
		String[] words=s.split(" ");
		int max=0;
		String largest="";
		
		for(String word:words)
		{
			if(word.length()>max)
			{
				max=word.length();
				largest=word;
			}
		}
		
		System.out.println("largest word: "+largest);

	}

}
