package strings;

public class CharacterCount {

	public static void main(String[] args) {
		String s="Somesh Chatterjee";
		String s1=s.toLowerCase();
		//char[] ch=new char[s.length()];
		
		boolean[] counted=new boolean[s1.length()];
		System.out.println("counts: ");
		for(int i=0;i<s1.length();i++)
		{
			char c=s1.charAt(i);
			if(c==' ')
			{
				continue;
			}
			int count=1;
			if(!counted[i])
			{
				for(int j=i+1;j<s1.length();j++)
				{
					
					
					
					if(s1.charAt(j)==c)
					{
						
						count++;
						counted[j]=true;
					}
				}				
				counted[i]=true;
				System.out.println("for "+c+" is: "+count);
				
			}
				
			
			
		}

	}

}
