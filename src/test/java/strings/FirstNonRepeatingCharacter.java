package strings;

import java.util.Scanner;

public class FirstNonRepeatingCharacter {
	
	public static void main(String[] args) {
		
		System.out.println("Enter your String1");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		for(int i=0;i<s.length();i++)
		{
			if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i)))
			{
				System.out.println("First non repeating character is "+s.charAt(i));
				break;
			}
		}
	}

}
