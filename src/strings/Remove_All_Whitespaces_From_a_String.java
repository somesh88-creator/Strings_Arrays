package strings;

public class Remove_All_Whitespaces_From_a_String {

	public static void main(String[] args) {
		String s="Somesh Chatterjee";
		String[] s1=s.split(" ");
		String s2=String.join("", s1);
		System.out.println(s2);
		
		System.out.println(s.replace(" ", ""));
				

	}

}
