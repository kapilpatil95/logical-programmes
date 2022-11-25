package Hashmapiterate;

import java.util.HashMap;
import java.util.Iterator;

public class UsingKeySet {
	
	public static void main(String[] args) {
		
		HashMap< Integer, String>hm=new HashMap<>();
		
		hm.put(1, "c");
		hm.put(2, "c++");
		hm.put(3, "java");
		hm.put(5, "python");
		hm.put(6, "dotnet");
		
		Iterator<Integer> iterator = hm.keySet().iterator();
		
		while(iterator.hasNext()) {
			
			Integer next = iterator.next();
			System.out.println(next);
			
			
		}
	}

}
