package forloopsortlist;

import java.util.ArrayList;

public class Demo {
	
	public static void main(String[] args) {
	    ArrayList al = new ArrayList();
	    al.add("reena");
	    al.add("teena");
	    al.add("anu");
	    al.add("zahir");
	    al.add("sonu");
	    System.out.println("Unsorted Arraylist:");
	    System.out.println(al);
	    int count = al.size();
	    String temp;
	    Object[] name = al.toArray();
	    for (int i = 0; i < count; i++) {
	      for (int j = i + 1; j < count; j++) {
	        if (((String) name[i]).compareTo((String) name[j]) > 0) {
	          temp = (String) name[i];
	          name[i] = name[j];
	          name[j] = temp;
	        }
	      }
	    }
	    System.out.println("Sorted Arraylist:");
	    for (int a = 0; a < name.length; a++) {
	      System.out.println(name[a]);
	    }
	  }
	}


