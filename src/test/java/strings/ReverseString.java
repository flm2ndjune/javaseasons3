package strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		System.out.println("Enter your String ");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		//method1
		
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		System.out.println();
		
		//method 2 
		
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		System.out.println("Reversed String "+rev);

	}

}
