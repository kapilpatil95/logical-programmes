package IterateList;

import java.util.ArrayList;

public class UsingStreamjava8 {
	
	public static void main(String[] args) {
		
ArrayList<String>list=new ArrayList<>();
		
		list.add("kapil");
		list.add("viki");
		list.add("sama");
		list.add("gana");
		
		list.stream().forEach(System.out::println);
	}

}
