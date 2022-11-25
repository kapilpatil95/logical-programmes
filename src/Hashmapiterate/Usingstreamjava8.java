package Hashmapiterate;

import java.util.HashMap;

public class Usingstreamjava8 {
	
public static void main(String[] args) {
	
	HashMap< Integer, String>hm=new HashMap<>();
	
	hm.put(1, "c");
	hm.put(2, "c++");
	hm.put(3, "java");
	hm.put(5, "python");
	hm.put(6, "dotnet");
	
	hm.entrySet().stream().forEach(System.out::println);
	System.out.println();
}

}
