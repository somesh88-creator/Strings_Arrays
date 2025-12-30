package strings;

import java.util.Arrays;

public class Reverse_Each_Word_in_a_Sentence {

	public static void main(String[] args) {
		String s="Java is fun";
		String[] words=s.split(" ");
		
		char ch1=' ';
		
		
		for(int i=0;i<words.length;i++)
		{
			
			for(int j=words[i].length()-1;j>=0;j--)
			{
				ch1=words[i].charAt(j);
				
				System.out.print(ch1);
			}
			
			System.out.print(" ");
		}
		

	}

}
