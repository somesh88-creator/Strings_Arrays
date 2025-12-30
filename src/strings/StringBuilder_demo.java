package strings;

public class StringBuilder_demo {

	public static void main(String[] args) {
		String s="Somesh";
		StringBuilder sb=new StringBuilder(s);
		sb.append(" Chatterjee");//append
		System.out.println(sb.toString());
		System.out.println(sb);
		
		sb.insert(6, "great"); //insert
		System.out.println(sb);
		
		sb.replace(0, 5, "Kamesh");
		System.out.println(sb);
		

	}

}
