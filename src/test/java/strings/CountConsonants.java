package strings;

import java.util.Scanner;

public class CountConsonants {

	public static void main(String[] args) {
		System.out.println("Enter your String ");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		int consonantsCount=0;
		
		for(int i=0;i<s.length();i++)
		{
			int ch=s.charAt(i);
			if(Character.isAlphabetic(ch))
			{
			if(!(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
					ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'
					))
			{
				consonantsCount++;
			}
			}
		}
		
		System.out.println("No of Consonants "+consonantsCount);
		
	

	}

}
