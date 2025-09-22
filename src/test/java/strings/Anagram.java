package strings;

import java.util.Scanner;

public class Anagram {
	
	public static void main(String[] args) {
		
		System.out.println("Enter your String1");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		
		System.out.println("Enter your String2");
		String s2=sc.nextLine();
		
		if(s1.length()==s2.length())
		{
			checkAnagram(s1.toLowerCase(),s2.toLowerCase());
		}
		
		
		
	}

	private static void checkAnagram(String str1, String str2) {
		
		String s1=sort(str1);
		String s2=sort(str2);
		
		if(s1.equals(s2))
		{
			System.out.println("Strings are anagram");
		}
		else
		{
			System.out.println("Strings are not anagram");
		}
		
	}

	private static String sort(String str1) {
		
		char[] arr=str1.toCharArray();
		
		for(int i=0;i<arr.length-1;i++)
		{
			
			for(int j=0;j<arr.length-1;j++)
			{
				//a    b 
				if(arr[j]>arr[j+1])
				{
					char temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
			
		}
		
		return new String(arr);
		
		
	}

}
