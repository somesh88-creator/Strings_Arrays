package strings;

import java.util.Arrays;

public class Anagram {
	
	static boolean isAnagram(String s1,String s2)
	{
		if(s1.length()!=s2.length())
		{
			return false;
		}
		
		else
		{
			char[] c1=s1.toLowerCase().toCharArray();
			char[] c2=s2.toLowerCase().toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			return Arrays.equals(c1, c2);
		}
	}

	public static void main(String[] args) {
		//Anagram- 2 strings having same characters in any order
		String str1="listen2";
		String str2="silent";
		
		//Anagram an=new Anagram();
		
		if(isAnagram(str1,str2))
		{
			System.out.println("Anagram");
		}
		
		else
		{
			System.out.println("not Anagram");
		}

	}

}
