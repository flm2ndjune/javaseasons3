package strings;

import java.util.Scanner;

public class CountDigits {
	
	public static void main(String[] args) {
		
		System.out.println("Enter your String ");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		int digitCount=0;
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(Character.isDigit(ch))
			{
				digitCount++;
			}
		}
		
		System.out.println("No of digits "+digitCount);
		
	}

}
