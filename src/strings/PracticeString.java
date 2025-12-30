package strings;

import java.util.Arrays;

public class PracticeString {

	public static void main(String[] args) {
		/*String s="somesh chatterjee";
		String s1=s.toLowerCase();
		char ch=' ';
		boolean[] visited=new boolean[s.length()];
		String s2=" ";*/
		
		/*for(int i=s.length()-1;i>=0;i--)
		{
			ch=s.charAt(i);
			System.out.print(ch);
		}*/
		
		/*String[] words=s.split(" ");
		for(int i=0;i<words.length;i++)
		{
			for(int j=words[i].length()-1;j>=0;j--)
			{
				ch=words[i].charAt(j);
				System.out.print(ch);
			}
			System.out.print(" ");
		}*/
		
		/*StringBuilder sb=new StringBuilder(s);
		//System.out.println(sb.reverse());
		if(sb.reverse().toString().equalsIgnoreCase(s))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}*/
		
		
		//character count check
		/*for(int i=0;i<s.length();i++)
		{
			ch=s1.charAt(i);
			if(ch==' ')
			{
				continue;
			}
			
			if(!visited[i])
			{
				int count=1;
				for(int j=i+1;j<s.length();j++)
				{
					if(ch==s1.charAt(j))
					{
						visited[j]=true;
						count++;
					}
				}
				visited[i]=true;
				System.out.println("count of "+ch+" is "+count);
			}
		}*/
		
		//remove duplicate
		/*for(int i=0;i<s1.length();i++)
		{
			ch=s1.charAt(i);
			if(ch==' ')
			{
				continue;
			}
			
			if(!visited[i])
			{
				int count=1;
				for(int j=i+1;j<s1.length();j++)
				{
					if(ch==s1.charAt(j))
					{
						visited[j]=true;
						count++;
					}
				}
				visited[i]=true;
				if(count==1)
				{
					s2=s2+ch;
				}
			}
		}
		System.out.println("string without duplicate: "+s2);*/
		
		//count no of characters
		/*for(int i=0;i<s1.length();i++)
		{
			ch=s1.charAt(i);
			if(ch==' ')
			{
				continue;
			}
			
			if(!visited[i])
			{
				int count=1;
				for(int j=i+1;j<s1.length();j++)
				{
					if(ch==s1.charAt(j))
					{
						visited[j]=true;
						count++;
					}
				}
				visited[i]=true;
				System.out.println("count of "+ch+" is: "+count);
			}
		}*/
		
		//count vowels and consonants
		/*int vcount=0;
		int ccount=0;
		for(int i=0;i<s1.length();i++)
		{
			ch=s1.charAt(i);
			if(ch==' ')
			{
				continue;
			}
			else if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				vcount++;
			}
			else
			{
				ccount++;
			}
		}
		System.out.println("tot vowels: "+vcount);
		System.out.println("tot consonants: "+ccount);*/
		
		//count of only max characters
		/*int max=0;
		char chm=' ';
		for(int i=0;i<s1.length();i++)
		{
			ch=s1.charAt(i);
			if(ch==' ')
			{
				continue;
			}
			
			if(!visited[i])
			{
				int count=1;
				
				for(int j=i+1;j<s1.length();j++)
				{
					if(ch==s1.charAt(j))
					{
						visited[j]=true;
						count++;
					}
				}
				if(count>max)
				{
					max=count;
					chm=ch;
				}
				visited[i]=true;
				//System.out.println("count of "+ch+" is: "+count);
			}
		}
		System.out.println("character with max count is: "+chm+" and the max count of it is: "+max);*/
		
		//remove white spaces
		/*String[] words=s1.split(" ");
		System.out.println(words[0]+words[1]);*/
		
		//palindrome num
		/*int a=44;
		int b=a;
		int rev=0;
		int d=0;
		while(a!=0)
		{
			d=a%10;
			rev=rev*10+d;
			a=a/10;
		}
		if(rev==b)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}*/
		
		//fibonaci
		/*int f=0;
		int s=1;
		int num;
		System.out.print(f+" ");
		System.out.print(s+" ");
		for(int i=0;i<6;i++)
		{
			num=f+s;
			System.out.print(num+" ");
			f=s;
			s=num;
		}*/
		
		//largest num
		/*int[] arr= {1,2,44,5,666};
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			
		}
		System.out.println(max);*/
		
		//2nd largest
		/*int[] arr= {1,2,44,5,666};
		int max=arr[0];
		int sec=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				sec=max;
				max=arr[i];
			}
			else if(arr[i]>sec && arr[i]!=max)
			{
				sec=arr[i];
			}
		}
		System.out.println("Largest num is: "+max+" and 2nd largest number is: "+sec);*/
		
		//smallest num
		/*int[] arr= {1,2,44,5,666};
		int min=arr[4];
		int sec=arr[4];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				sec=min;
				min=arr[i];
			}
			else if(arr[i]<sec && arr[i]!=min)
			{
				sec=arr[i];
			}
		}
		System.out.println("smallest num: "+min+" and sec smallest num: "+sec);*/
		
		//rev array
		/*int[] arr= {1,2,44,5,666};
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}*/
		
		//sort
		/*int[] arr= {1,2,44,5,666};
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				arr[i]=arr[i]+arr[i+1];
				arr[i+1]=arr[i]-arr[i+1];
				arr[i]=arr[i]-arr[i+1];
			}
		}
		System.out.println(Arrays.toString(arr));*/
		
		//remove duplicates
		/*int[] arr= {1,1,2,2,2,3,4,5,6,4};
		boolean[] visited=new boolean[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			if(!visited[i])
			{
				int count=1;
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						visited[j]=true;
						count++;
					}
				}
				visited[i]=true;
				//System.out.print(arr[i]+" ");
				//System.out.println(" ");
				if(count==1)
				{
					System.out.print(arr[i]+" ");
				}
				
			}
		}*/
		
		//check sorting
		/*int[] arr= {1,2,3,4,5,6};
		boolean sorted=false;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]<arr[i+1])
			{
				sorted=true;
			}
			else
			{
				sorted=false;
			}
		}
		if(sorted==true)
		{
			System.out.println("sorted");
		}
		else
		{
			System.out.println("not sorted");
		}*/
		
		//missing num in array
		/*int[] arr= {1,2,4,5};
		int n=arr.length+1;
		int actual=n*(n+1)/2;
		int exp=0;
		for(int i=0;i<arr.length;i++)
		{
			exp=exp+arr[i];
		}
		int mis=actual-exp;
		System.out.println(mis);*/

	}

}
