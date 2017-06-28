package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortingMap {

		static void SortMap(){
		
			Map<String,String> sortmap = new HashMap<String,String>();
				sortmap.put("Atlanta", "Atlanta");
				sortmap.put("Florida", "Florida");
				sortmap.put("Chicago", "Chicago");
				sortmap.put("Boston", "Boston");
				
				for(Map.Entry<String,String> entry : sortmap.entrySet() ){
					System.out.println("Before Sorting: "+ entry.getKey());
				}
				System.out.println("***************");
				
				Map<String,String> treeMap=new TreeMap<String,String>(sortmap);
				for(Map.Entry<String,String> entry : treeMap.entrySet() ){
					System.out.println("After Sorting : "+ entry.getKey());
				}
								
		}
		public static void main(String[] args) {
			
	           SortingMap.SortMap();
		}

	}

