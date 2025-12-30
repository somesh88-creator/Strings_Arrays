package arrays;

public class FirstNonRepeatingElement {

	public static void main(String[] args) {
		int[] arr= {1,1,1,2,3,3,3,4};
		
		boolean[] visited=new boolean[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			
			if(!visited[i])
			{
				int count=1;
				for(int j=0;j<arr.length;j++)
				{
					if(arr[j]==arr[i] &i!=j)
					{
						visited[j]=true;
						count++;
						
					}
					
					
				}
				visited[i]=true;
				if(count==1)
				{
					System.out.println(arr[i]);
					break;
				}
			}
		
				
		}

	}

}
