package strings;

public class FindTheFirstNonRepeatingCharacter2 {

	public static void main(String[] args) {
		String s="abbaac";
		String s1=s.toLowerCase();
		boolean[] visited=new boolean[256];
		char ch=' ';
		
		for(int i=0;i<s1.length();i++)
		{
			ch=s1.charAt(i);
			int count=1;
			if(!visited[ch])
			{
				for(int j=i+1;j<s1.length();j++)
				{
					if(ch==s1.charAt(j))
					{
						count++;
						visited[ch]=true;
						break;
					}
				}
				if(count>1)
				{
					continue;
				}
				else
				{
					visited[ch]=true;
					System.out.println("1st non-repeating characher: "+ch);
					break;
				}
				
				
			}
		}

	}

}
