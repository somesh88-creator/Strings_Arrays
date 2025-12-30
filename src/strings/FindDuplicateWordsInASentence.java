package strings;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateWordsInASentence {

	public static void main(String[] args) {
		String s="This is a test sentence where the word test appears more than once in this sentence";
		s.toLowerCase();
		HashMap<String,Integer> map=new HashMap<>();
		String[] words=s.split(" ");
		for(String word:words)
		{
			map.put(word, map.getOrDefault(word,0)+1);
		}
		
		System.out.println("Duplicate words: ");
		
		
		for(Map.Entry<String,Integer> entry:map.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+"->"+entry.getValue());
			}
		}
	}

}
