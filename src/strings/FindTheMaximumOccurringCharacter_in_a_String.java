package strings;

import java.util.Arrays;

public class FindTheMaximumOccurringCharacter_in_a_String {

	public static void main(String[] args) {
		String s="Wooooow";
		String s1=s.toLowerCase();
		boolean[] visited=new boolean[s1.length()];
		char ch=' ';
		char maxchar=' ';
		//char[] mch=new char[s1.length()];
		
		int max=0 ;
		for(int i=0;i<s1.length();i++)
		{
			
			
			int count=1;
			ch=s1.charAt(i);
			if(!visited[i])
			{
				for(int j=i+1;j<s1.length();j++)
				{
					if(ch==s1.charAt(j))
					{
						visited[j]=true;
						count++;
					}
					
					
				}
				visited[i]=true;
				
				if(count>max)
				{
					max=count;
					maxchar=ch;
				}
			}
		}
		
		System.out.println("character with max count: "+maxchar+" with count: "+max);

	}

}
