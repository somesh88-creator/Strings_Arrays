package strings;

public class FstNonRepeatingChar {

	public static void main(String[] args) {
		String s="Somesh Chatterjee";
		String s1=s.toLowerCase();
		char ch=' ';
		boolean[] visited=new boolean[s.length()];
		
		for(int i=0;i<s1.length();i++)
		{
			ch=s1.charAt(i);
			
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
				if(count==1)
				{
					break;
				}
			}
		}
		System.out.println("1st non repeating char: "+ch);
	}

}
