package strings;

public class VowelAndCons {

	public static void main(String[] args) {
		String s="Somesh Chatterjee";
		String s1=s.toLowerCase();
		char ch=' ';
		int vc=0;
		int cc=0;
		
		for(int i=0;i<s1.length();i++)
		{
			ch=s1.charAt(i);
			if(ch==' ')
			{
				continue;
			}
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				vc++;
				System.out.println(ch+" is vowel");
			}
			else
			{
				cc++;
				System.out.println(ch+" is consonant");
			}
		}
		System.out.println("tot vowels: "+vc);
		System.out.println("tot consonants: "+cc);
		

	}

}
