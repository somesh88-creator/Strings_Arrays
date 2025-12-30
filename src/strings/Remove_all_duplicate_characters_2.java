package strings;

public class Remove_all_duplicate_characters_2 {

	public static void main(String[] args) {
		String s="bookkeeper";
		//om gra
		
		String s1=s.toLowerCase();
		StringBuilder sb=new StringBuilder();
		boolean[] visited=new boolean[s1.length()];
		char ch=' ';
		
		for(int i=0;i<s1.length();i++)
		{
			ch=s1.charAt(i);
			int count=0;
			if(ch==' ')
			{
				sb.append(ch);
			}
			
			if(!visited[i])
			{
				for(int j=0;j<s1.length();j++)
				{
					if(j!=i && ch==s1.charAt(j))
					{
						visited[j]=true;
						count++;
						break;
					}
				}
				if(count==0)
				{
					sb.append(ch);
				}
			}
		}
		System.out.println(sb);

	}

}
