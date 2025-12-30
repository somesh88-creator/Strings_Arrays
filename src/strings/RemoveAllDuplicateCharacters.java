package strings;

public class RemoveAllDuplicateCharacters {

	public static void main(String[] args) {
		//String s="Somesh is a good boy";
		//meh i a gd by
		//String s="Mississippi";
		//m
		//String s="abac";
		//bc
		//String s="teeter";
		//r
		String s="aabbccdde";
		//e
		//String s="a a a";
		String s2=s.toLowerCase();
		boolean[] visited=new boolean[s2.length()];
		char ch=' ';
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s2.length();i++)
		{
			ch=s2.charAt(i);
			int count=0;
			if(ch==' ')
			{
				sb.append(ch);
			}
			
			if(!visited[i])
			{
				for(int j=0;j<s2.length();j++)
				{
					if(ch==s2.charAt(j) && j!=i)
					{
						visited[j]=true;
						count++;
						break;
					}
				}
				if(count==0)
				{
					visited[i]=true;
					sb.append(ch);
				}
			}
			
		}
		System.out.println(sb);

	}

}
