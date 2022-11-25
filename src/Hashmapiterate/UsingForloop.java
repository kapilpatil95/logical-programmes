package Hashmapiterate;

import java.util.HashMap;
import java.util.Map;

public class UsingForloop {
	
	public static void main(String[] args) {
		
		HashMap< Integer, String>hm=new HashMap<>();
		
		hm.put(1, "c");
		hm.put(2, "c++");
		hm.put(3, "java");
		hm.put(5, "python");
		hm.put(6, "dotnet");
		
		for(Map.Entry<Integer, String>entry:hm.entrySet()) {
			
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
		}
	}

}
