package strings;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		
		System.out.println("Enter your String ");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		System.out.println("Reversed String "+rev);
		
		if(s.equalsIgnoreCase(rev))
		{
			System.out.println(s+" is a palindrome ");
		}
		else
		{
			System.out.println(s+" is not a palindrome ");
		}
	}

}
