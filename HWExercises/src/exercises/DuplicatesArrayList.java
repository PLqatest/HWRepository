package exercises;

import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class DuplicatesArrayList {

	static void HashSet(){
		
		ArrayList <String> cities = new ArrayList();
		
		cities.add("Atlanta");
		cities.add("Boston");
		cities.add("Chicago");
		cities.add("Atlanta");
		cities.add("Florida");
		cities.add("Chicago");
		
		Set <String> s = new HashSet <>();
		System.out.println("Duplicates in this Array ");
			
		for(String name:cities)
		{
		    if (s.add(name)==false)
			System.out.println(name);
		}		
	}
		
		public static void main(String[] args) {
			
			DuplicatesArrayList.HashSet();		
		}

	}
