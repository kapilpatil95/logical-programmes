package Hashmapiterate;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashmapUsingentryset {
	public static void main(String[] args) {
		

	
	HashMap< Integer, String>hm=new HashMap<>();
	
	hm.put(1, "c");
	hm.put(2, "c++");
	hm.put(3, "java");
	hm.put(5, "python");
	hm.put(6, "dotnet");
	
	Iterator<Entry<Integer,String>>iterator=hm.entrySet().iterator();
	
	while(iterator.hasNext()) {
		
		Entry<Integer,String>next=iterator.next();
		
		System.out.println(next.getKey());
		System.out.println(next.getValue());
		
		//System.out.println(next);
		
	}
	
	}	

}
