package strings;

import java.util.Scanner;

public class Palindrome2 {
	
	public static void main(String[] args) {
		
		System.out.println("Enter your String ");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1=s.toLowerCase();
		
		String rev="";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		
		System.out.println("Reversed String "+rev);
		
		if(s1.equals(rev))
		{
			System.out.println(s+" is a palindrome ");
		}
		else
		{
			System.out.println(s+" is not a palindrome ");
		}
	}

}
