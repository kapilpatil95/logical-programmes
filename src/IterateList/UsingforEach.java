package IterateList;

import java.util.ArrayList;

public class UsingforEach {
	
	public static void main(String[] args) {
		
		ArrayList<String>list=new ArrayList<>();
		
		list.add("kapil");
		list.add("viki");
		list.add("sama");
		list.add("gana");
		
		//using for loop
		
		for(int i=0;i<list.size();i++) {
			
			System.out.println(list.get(i));
			
			
		}
		}
		
	}


