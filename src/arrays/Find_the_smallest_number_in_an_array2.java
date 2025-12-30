package arrays;

public class Find_the_smallest_number_in_an_array2 {

	public static void main(String[] args) {
		int[] arr= {1,2,44,5,67,33,4,55,6};
		
		int min=Integer.MAX_VALUE;
		int sec_min=Integer.MAX_VALUE;
		for(int i:arr)
		{
			if(i<min)
			{
				sec_min=min;
				min=i;
			}
			
			else if(i<sec_min && i!=min)
			{
				sec_min=i;
			}
		}
		System.out.println(sec_min);

	}

}
