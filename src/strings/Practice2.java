package strings;

public class Practice2 {

	public static void main(String[] args) {
		String s="Welcome to Java";
		char ch=' ';
		//Reverse string
		/*for(int i=s.length()-1;i>=0;i--)
		{
			ch=s.charAt(i);
			System.out.print(ch);
		}*/
		
		//Reverse only the letters in the words in the string
		/*String[] words=s.split(" ");
		for(int i=0;i<words.length;i++)
		{
			for(int j=words[i].length()-1;j>=0;j--)
			{
				ch=words[i].charAt(j);
				System.out.print(ch);
			}
			System.out.print(" ");
		}*/
		
		//Total no of characters
		//System.out.println(s.replace(" ", "").length());
		
		//Total no of times each character in a string occurs
		/*boolean[] visited=new boolean[s.length()];
		System.out.println("no of times ");
		for(int i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			int count=1;
			if(ch==' ')
			{
				continue;
			}
			if(!visited[i])
			{
				for(int j=i+1;j<s.length();j++)
				{
					if(ch==s.charAt(j))
					{
						visited[j]=true;
						count++;
					}
				}
				visited[i]=true;
				System.out.print(ch+" occurs is: "+count);
				System.out.println("");
			}
		}*/
		
		//1st non repeating character
		/*boolean found=false;
		for(int i=0;i<s.length();i++)
		{
			char c=' ';
			c=s.charAt(i);
			boolean un=true;
			for(int j=0;j<s.length();j++)
			{
				if(j!=i && c==s.toUpperCase().charAt(j) || c==s.toLowerCase().charAt(j))
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
			System.out.println("1st non-repeating character: "+ch);
		}*/
		
		//Remove duplicate characters
		StringBuilder sb=new StringBuilder();
		String s2=s.toLowerCase();
		boolean[] visited=new boolean[256];
		for(int i=0;i<s.length();i++)
		{
			ch=s2.charAt(i);
			if(ch==' ')
			{
				sb.append(ch);
			}
			int count=0;
			if(!visited[ch])
			{
				/*for(int j=i+1;j<s.length();j++)
				{
					if(ch==s.charAt(j) && ch!=' ')
					{
						visited[j]=true;
					}
					else
					{
						visited[i]=true;
						sb.append(ch);
					}
				}
				//visited[i]=true;
				//sb.append(ch);*/
				
				for(int j=i+1;j<s2.length();j++)
				{
					if(ch==s2.charAt(j))
					{
						count++;
						break;
					}
				}
				if(count==0)
				{
					sb.append(ch);
				}
				
				visited[ch]=true;
				
			}
		}
		System.out.println(sb);

	}

}
