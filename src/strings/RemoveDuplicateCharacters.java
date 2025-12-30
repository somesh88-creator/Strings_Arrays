package strings;

import java.util.HashSet;

public class RemoveDuplicateCharacters {

	
	public static void main(String[] args) {
		String s="Somesh";
		String s1=s.toLowerCase();
		
		//using ascii concept
		boolean[] counted=new boolean[256];
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			
			if(!counted[ch])
			{
				counted[ch]=true;
				sb.append(ch);
			}
		}
		System.out.println("After removing duplicates: "+sb);
		
		//using hashset concept
		/*HashSet<Character> seen=new HashSet<>();
		StringBuilder sb=new StringBuilder();
		for(char ch:s1.toCharArray())
		{
			if(!seen.contains(ch))
			{
				seen.add(ch);
				sb.append(ch);
			}
		}
		
		System.out.println("After removing duplicates: "+sb.toString());*/
		

	}

}
