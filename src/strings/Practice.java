package strings;

import java.util.Arrays;

public class Practice {

	public static void main(String[] args) {
		//Count Occurrence of Each Character
		String s="   Welcome to Javaaaa and ttooo sssooommeesshh   ";
		//String s1=s.toLowerCase();
		
		/*boolean[] visited=new boolean[s1.length()];
		
		for(int i=0;i<s1.length();i++)
		{
			int counted=1;
			char ch=s1.charAt(i);
			if(ch==' ')
			{
				continue;
			}
			if(!visited[i])
			{
				for(int j=i+1;j<s1.length();j++)
				{
					if(ch==s1.charAt(j))
					{
						visited[j]=true;
						counted++;
					}
				}
				visited[i]=true;
				System.out.println("count of "+ch+" is: "+counted);
				
			}
			
			
		}*/
		
		//FindTheFirstNonRepeatingCharacter
		/*char ch=' ';
		boolean found=false;
		//boolean[] isUnique=new boolean[s1.length()];
		
		for(int i=0;i<s1.length();i++)
		{
			char c=s1.charAt(i);
			boolean un=true;
			
			for(int j=0;j<s1.length();j++)
			{
				if(j!=i && c==s1.charAt(j))
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
			System.out.println("1st non-repeating character is: "+ch);
		}*/
		
		//Rrverse entire string
		/*for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}*/
		
		//Reverse just each word in the string
		/*String[] words=s.split(" ");
		char ch=' ';
		for(int i=0;i<words.length;i++)
		{
			for(int j=words[i].length()-1;j>=0;j--)
			{
				ch=words[i].charAt(j);
				System.out.print(ch);
			}
			System.out.print(" ");
		}*/
		
		//character count 1
		/*String[] s1=s.split(" ");
		char ch=' ';
		int count=0;
		for(int i=0;i<s1.length;i++)
		{
			for(int j=0;j<s1[i].length();j++)
			{
				ch=s1[i].charAt(j);
				count++;
			}
		}
		System.out.println("total characters: "+count);
		
		//character count 2
		
		System.out.println("total characters: "+s.replace(" ", "").length());
		
		//no of times a character appears in a string using ascii code concept
		String s2=s.toLowerCase();
		boolean[] visited=new boolean[256];
		System.out.println("no of times ");
		for(int i=0;i<s2.length();i++)
		{
			int counted=1;
			char ch2=s2.charAt(i);
			if(ch2==' ')
			{
				continue;
			}
			if(!visited[ch2])
			{
				for(int j=i+1;j<s2.length();j++)
				{
					if(ch2==s2.charAt(j))
					{
						
						counted++;
					}
				}
				visited[ch2]=true;
				System.out.println(ch2+" occurs is: "+counted);
			}
			
		}*/
		
		/*System.out.println(s.charAt(6));
		System.out.println(Arrays.toString(s.split(" ")));
		System.out.println(s.replace("Welcome", "Welcome 2"));
		System.out.println(s.trim());
		System.out.println(s.concat("python"));
		System.out.println(String.join(",",s, "python 2"));
		System.out.println(s.substring(4,9));
		String s1="somesh";
		System.out.println(s.concat(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.equalsIgnoreCase(s));*/
		
		//Reverse string
		/*char ch=' ';
		for(int i=s.length()-1;i>=0;i--)
		{
			ch=s.charAt(i);
			System.out.print(ch);
		}*/
		
		//Reverse only individual words in the string
		/*System.out.println(" ");
		String[] words=s.trim().split(" ");
		char ch2=' ';
		for(int i=0;i<words.length;i++)
		{
			for(int j=words[i].length()-1;j>=0;j--)
			{
				ch2=words[i].charAt(j);
				System.out.print(ch2);
				
			}
			System.out.print(" ");
		}*/
		
		//total no of characters excluding spaces
		//System.out.println("tot no of characters: "+s.replace(" ", "").length());
		
		//total no of times each character occurs in the string using index of the character
		/*String s1="Hello World";
		String s2=s1.toLowerCase();
		boolean[] visited=new boolean[s2.length()];
		System.out.println("no of times ");
		for(int i=0;i<s2.length();i++)
		{
			char ch=s2.charAt(i);
			if(ch==' ')
			{
				continue;
			}
			int counted=1;
			if(!visited[i])
			{
				for(int j=i+1;j<s2.length();j++)
				{
					if(ch==s2.charAt(j))
					{
						counted++;
						visited[j]=true;
					}
				}
				visited[i]=true;
				System.out.println(ch+" occurs is: "+counted);
			}
		}*/
		
		//total no of times each character occurs in the string using ascii code concept
		/*String s1="Hello World";
		String s2=s1.toLowerCase();
		boolean[] visited=new boolean[256];
		System.out.println("no of times ");
		for(int i=0;i<s2.length();i++)
		{
			char ch=s2.charAt(i);
			int counted=1;
			if(ch==' ')
			{
				continue;
			}
			
			if(!visited[ch])
			{
				for(int j=i+1;j<s2.length();j++)
				{
					if(ch==s2.charAt(j))
					{
						counted++;
					}
				}
				visited[ch]=true;
				System.out.println(ch+" occurs is: "+counted);
			}
		}*/
		
		//1st non repeating character
		/*String s1="Hello World";
		String s2=s1.toLowerCase();
		boolean[] visited=new boolean[s2.length()];
		System.out.println("1st non repeating character is: ");
		for(int i=0;i<s2.length();i++)
		{
			char ch=s2.charAt(i);
			int counted=1;
			if(ch==' ')
			{
				continue;
			}
			if(!visited[i])
			{
				for(int j=i+1;j<s2.length();j++)
				{
					if(ch==s2.charAt(j))
					{
						counted++;
						visited[j]=true;
					}
				}
				visited[i]=true;
				if(counted==1)
				{
					System.out.println(ch);
					break;
				}
			}
		}*/
		
		
		
		
		
	}

}
