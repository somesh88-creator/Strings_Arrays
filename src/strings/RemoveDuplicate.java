package strings;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String s="Somesh Chatterjee";
		String s1=s.toLowerCase();
		
		char ch=' ';
		boolean[] visited=new boolean[s1.length()];
		String s2="";
		
		for(int i=0;i<s1.length();i++)
		{
			ch=s1.charAt(i);
			if(!visited[i])
			{
				visited[i]=true;
				s2=s2+ch;
				for(int j=i+1;j<s1.length();j++)
				{
					if(ch==s1.charAt(j))
					{
						visited[j]=true;
						//break;
					}
				}
				
			}
			
		}
		
		System.out.println(s2);
	}

}
