package strings;

import java.util.Scanner;

public class CountVowels {
	
	public static void main(String[] args) {
		
		System.out.println("Enter your String ");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		int vowelCount=0;
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
					ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
			{
				System.out.println(ch);
				vowelCount++;
			}
		}
		
		System.out.println("No of vowels "+vowelCount);
		
	}

}
