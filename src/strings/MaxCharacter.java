package strings;

public class MaxCharacter {

	public static void main(String[] args) {
		String s="ssooowwpppppp";
		int max=0;
		char ch=' ';
		char ch2=' ';
		boolean[] visited=new boolean[s.length()];
		
		for(int i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			if(!visited[i])
			{
				int count=1;
				for(int j=i+1;j<s.length();j++)
				{
					if(ch==s.charAt(j))
					{
						visited[j]=true;
						count++;
					}
				}
				if(count>max)
				{
					max=count;
					ch2=ch;
				}
			}
		}
		System.out.println("max character count: "+max+" and the character is: "+ch2);

	}

}
