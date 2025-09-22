package strings;

import java.util.Scanner;

public class CountChar {

	public static void main(String[] args) {
		
		System.out.println("Enter your String ");
		Scanner sc=new Scanner(System.in);
		//String s=sc.next();
		String s=sc.nextLine();
		
		char[] ch=s.toCharArray();
		
		int count=0;
		
		for(int i=0;i<ch.length;i++)
		{
			count++;
		}
		
		System.out.println("No of characters "+count);

	}

}
