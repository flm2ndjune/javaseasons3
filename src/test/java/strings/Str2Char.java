package strings;

public class Str2Char {

	public static void main(String[] args) {
		
		char c='z';
		int j=c;
		
		System.out.println(j);
		
		String s="Hello world";
		
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
	
		}
		
		char[] ch=s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}

	}

}
