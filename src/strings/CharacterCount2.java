package strings;

public class CharacterCount2 {

	public static void main(String[] args) {
		String s="Welcome to Java";
		String s1=s.toLowerCase();
		boolean[] counted=new boolean[s1.length()];
		
		for(int i=0;i<s1.length();i++)
		{
			int count=1;
			char ch=s1.charAt(i);
			if(ch==' ')
			{
				continue;
			}
			if(!counted[i])
			{
				for(int j=i+1;j<s1.length();j++)
				{
					if(ch==s1.charAt(j))
					{
						count++;
						counted[j]=true;
					}
				}
				counted[i]=true;
				System.out.println("count for "+ch+" is: "+count);
			}
		}
	}

}
