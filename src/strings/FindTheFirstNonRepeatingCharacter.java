package strings;

import java.util.Scanner;

public class FindTheFirstNonRepeatingCharacter {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=scan.nextLine();
		
		//String s="Somesh Chatterjee";
		//String s1=s.toLowerCase();
		char ch=' ';
		boolean found=false;
		//boolean[] isUnique=new boolean[s1.length()];
		
		for(int i=0;i<s1.length();i++)
		{
			Character c=' ';
			c=s1.charAt(i);
			boolean un=true;
			
			for(int j=0;j<s1.length();j++)
			{
				if(j!=i && c.equals(s1.toLowerCase().charAt(j)) || c.equals(s1.toUpperCase().charAt(j)))
				{
					
					un=false;
					break;
				}
			}
			if(un==true)
			{
				ch=c;
				found=true;
				break;
			}			
			
		}
		
		if(found==true)
		{
			/*if(ch==s1.charAt(0) )
			{
				System.out.println("1st non-repeating character is: "+Character.toUpperCase(ch));
			}
			else
			{
				System.out.println("1st non-repeating character is: "+ch);
			}*/
			
			System.out.println("1st non-repeating character is: "+ch);
		}
		
		
	}

}
