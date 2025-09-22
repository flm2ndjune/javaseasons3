package strings;

public class ManiupulationMethods {
	
	public static void main(String[] args) {
		
		String str1="zer0es slender 0vals, which d0 n0t have much girth in the middle";
		
		System.out.println(str1.indexOf('o')); //-1
		
		String str2=str1.replace('0', 'o');
				
			
		System.out.println(str2.indexOf('o')); //-1 ?
		
		System.out.println(str2);
		
		System.out.println(str2.substring(15));
		
		System.out.println(str2.substring(15, 20));
		
		System.out.println(str2.charAt(15));
		
		//System.out.println();
		
		char[] ch=str2.toCharArray();
		
		/*
		 * for(char temp:ch) { System.out.println(temp); }
		 */
		
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(i+"  "+ch[i]);
		}
		
	}

}
