package strings;

public class StringComparison {

	public static void main(String[] args) {
		String str1="Somesh";
		String str2="Somesh";
		boolean com1=str1.equals(str2);
		System.out.println(com1);
		/*if(str1==str2)
		{
			System.out.println("== working");
		}*/
		
		String str3=new String("Somesh");
		String str4=new String("Somesh");
		
		System.out.println(str3==str4); //== is for reference comparison
		System.out.println(str3.equalsIgnoreCase(str4));//content comparison
		
		
		

	}

}
