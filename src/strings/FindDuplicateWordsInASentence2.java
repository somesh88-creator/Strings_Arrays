package strings;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateWordsInASentence2 {

	public static void main(String[] args) {
		String s="This is this";
		String s1=s.toLowerCase();
		String[] words=s1.split(" ");
		HashMap<String,Integer> map=new HashMap<>();
		
		for(String word:words)
		{
			map.put(word, map.getOrDefault(word, 0)+1);
		}
		
		System.out.println("Duplicates are: ");
		for(Map.Entry<String, Integer> entry:map.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+"->"+entry.getValue());
			}
		}
	}

}
