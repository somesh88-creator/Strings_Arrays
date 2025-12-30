package strings;

public class Reverse_the_Order_of_Words_in_a_Sentence {

	public static void main(String[] args) {
		String s="Somesh the great";
		String[] words=s.split(" ");
		
		for(int i=words.length-1;i>=0;i--)
		{
			System.out.print(words[i]);
			System.out.print(" ");
		}
	}

}
