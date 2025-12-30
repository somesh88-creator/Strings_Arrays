package strings;

public class Check_if_Two_Strings_Are_Rotations_of_Each_Other {
	
	static boolean isRotate(String str1,String str2)
	{
		if(str1.length()!=str2.length())
		{
			return false;
		}
		
		String s3=str1+str1;
		if(s3.contains(str2)) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		String s1="abcd";
		String s2="bcda";
		
		System.out.println(isRotate(s1,s2));
		

	}

}
