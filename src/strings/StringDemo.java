package strings;

import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) {
		String str=new String("Welcome");
		String str2="Welcome to Java";
		System.out.println(str);
		System.out.println(str2);
		
		//concat
		String str3=str.concat(" "+str2+" "+str);
		System.out.println(str3);
		
		//substring
		System.out.println(str2.substring(1,5));
		
		//check substring presence by contains()
		System.out.println(str3.contains(str2));
		
		//index of a letter
		System.out.println(str3.indexOf("Java"));
		
		//split the string
		String[] str4=str2.split(" ");
		//System.out.println(Arrays.toString(str4));
		System.out.println(str4[1]);
		System.out.println(str4[0]+""+str4[1]+""+str4[2]);
		
		//replace
		String str5=str3.replace("Welcome", "Hello");
		System.out.println(str5);
		
		int[] arr=new int[] {1,2,3,4,5};
		int arr2[]= {11,22,33,44,55};
		//arr= {1,2,4,5,6};
		System.out.println(arr);
		System.out.println(Arrays.toString(arr2));
		
		//equals
		System.out.println(str3.substring(0,7).equals("Welcome"));
		System.out.println(str3.substring(0,7).equalsIgnoreCase("welcome"));
	}

}
