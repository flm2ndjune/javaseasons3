package strings;

import java.util.Scanner;

public class AnagramWithoutSorting {
	
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
		
		int count1=0;
		for(int i=0;i<str1.length();i++)
		{
			
			if(str2.contains(Character.toString(str1.charAt(i))))
			{
				count1++;
			}
		}
		
		int count2=0;
		for(int i=0;i<str2.length();i++)
		{
			
			if(str1.contains(Character.toString(str2.charAt(i))))
			{
				count2++;
			}
		}
		if(count1==count2)
		{
			System.out.println("Strings are anagram");
		}
		else
		{
		System.out.println("Strings are not anagram");
		}
	}

	

}
