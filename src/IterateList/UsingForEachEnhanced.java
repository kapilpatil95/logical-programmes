package IterateList;

import java.util.ArrayList;

public class UsingForEachEnhanced {
	
	public static void main(String[] args) {
		
	ArrayList<String>list=new ArrayList<>();
		
		list.add("kapil");
		list.add("viki");
		list.add("sama");
		list.add("gana");
		
		for(String lists:list) {
			
			System.out.println(lists);
			
		}
		
	}

}
