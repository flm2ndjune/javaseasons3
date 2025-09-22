package strings;

public class PositionMethods {
	
	public static void main(String[] args) {
		
		String str="Frontlines Edu Tech - Building E Trust & Careers";
		
		System.out.println(str.length());
		
		System.out.println(str.indexOf("Edu"));
		
		System.out.println(str.indexOf("E"));
		
		System.out.println(str.indexOf(69)); //69 is ASCII value of E
		
		//second occurance of E 
		
		System.out.println(str.substring(str.indexOf(69)+1).indexOf(69)+(str.indexOf(69)+1));
		
		//last occuraanc of T
		
		System.out.println(str.lastIndexOf('T'));
		
	}

}
