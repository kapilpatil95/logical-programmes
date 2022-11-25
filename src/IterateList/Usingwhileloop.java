package IterateList;

import java.util.ArrayList;
import java.util.Iterator;

public class Usingwhileloop {
	
	public static void main(String[] args) {
		
	ArrayList<String>list=new ArrayList<>();
		
		list.add("kapil");
		list.add("viki");
		list.add("sama");
		list.add("gana");
		
		
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			
			String next = iterator.next();
			System.out.println(next);
			
		}
	}

}
