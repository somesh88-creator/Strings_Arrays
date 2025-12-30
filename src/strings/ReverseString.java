package strings;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		//practice
		/*String str1="Welcome to Java";
		
		String[] str2=str1.split(" ");
		System.out.println(Arrays.toString(str2));
		String str3=String.join("",str2);
		System.out.println(str3);
		
		String str4=str1.substring(3,7);
		System.out.println(str4);
		
		char ch=str1.charAt(7);
		System.out.println("the character is:"+ch+"result");
		
		System.out.println(str1.concat(" Somesh"));
		
		boolean v=str1.contains("Somesh");
		System.out.println(v);
		
		boolean eq=str1.substring(8,10).equalsIgnoreCase("to");
		System.out.println(eq);
		
		String str5=str1.replace("Java", "Somesh");
		System.out.println(str5);*/
		
		
		
		//Reverse entire string traditionally
		String str1="Somesh Chatterjee";
		for(int i=str1.length()-1;i>=0;i--)
		{
			System.out.print(str1.charAt(i));
			
			//String str2=
		}
		
		System.out.println("");
		String str2="";
		for(int i=str1.length()-1;i>=0;i--)
		{
			
			str2=str2+str1.charAt(i);
			//String str2=
		}
		System.out.println(str2);
		//Reverse the substrings only traditionally
		String[] str3=str1.split(" ");
		String str4=str3[0];
		String str5=str3[1];
		String str6="";
		String str7="";
		for(int i=str4.length()-1;i>=0;i--)
		{
			str6=str6+str4.charAt(i);
		}
		for(int i=str5.length()-1;i>=0;i--)
		{
			str7=str7+str5.charAt(i);
		}
		String str8=str6.concat(" "+str7);
		System.out.println(str8);
		
		
		//Reversing using conversion of string to character array
		/*String str1="Somesh Chatterjee";
		char[] ch=str1.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}*/
		
		
		//Reversing using Built-in class StringBuilder
		/*String str="Somesh Chatterjee";
		StringBuilder sb=new StringBuilder(str);
		String str2=sb.reverse().toString();
		System.out.println(str2);*/
		
		String s="Somesh Chatterjee";
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		System.out.println();
		String[] s2=s.split(" ");
		for(int i=s2[0].length()-1;i>=0;i--)
		{
			System.out.print(s2[0].charAt(i));
			
		}
		System.out.print(" ");
		for(int i=s2[1].length()-1;i>=0;i--)
		{
			System.out.print(s2[1].charAt(i));
		}
		
		System.out.println(" ");
		char[] c=s.toCharArray();
		for(int i=c.length-1;i>=0;i--)
		{
			
			System.out.print(c[i]);
		}
	}

}
