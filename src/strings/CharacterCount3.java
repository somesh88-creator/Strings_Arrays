package strings;

public class CharacterCount3 {

	public static void main(String[] args) {
		String s="Somesh Chatterjee";
		String s1=s.toLowerCase();
		boolean[] visited=new boolean[s.length()];
		char ch=' ';
		
		for(int i=0;i<s1.length();i++)
		{
			ch=s1.charAt(i);
			if(ch==' ')
			{
				continue;
			}
			
			if(!visited[i])
			{
				int count=1;
				for(int j=i+1;j<s1.length();j++)
				{
					if(ch==s1.charAt(j))
					{
						visited[j]=true;
						count++;
					}
				}
				visited[i]=true;
				System.out.println("count of "+ch+" is: "+count);
			}
		}

	}

}
