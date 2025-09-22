package map;

import java.util.HashMap;

public class HashMapDemo1 {

	public static void main(String[] args) {
	
		HashMap<Integer, String> hMap=new HashMap<Integer, String>();
		
		hMap.put(100, "Ravi");
		hMap.put(101, "Gopi");
		hMap.put(102, "Santosh");
		hMap.put(103, "Chandu");
		
		System.out.println("Ravi".hashCode());
		
		System.out.println(hMap);

	}

}
