package HasMapInternallyWorks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortBasedOnKeyUsingComparator {

	public static void main(String[] args) { 
				Map<String, Integer> map = new HashMap<String, Integer>();
				
				map.put("banana", 2);
				map.put("apple", 4);
				map.put("custurd", 3);
				
				// Create a comparator for sorting Map.Entry objects by key in natural order of key
				Comparator<Entry<String,Integer>>comparator = Entry.comparingByKey();
				List<Entry<String,Integer>>list = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
				list.sort(comparator);
				
				for(Entry<String, Integer>entry: list) {
				 System.out.println(entry.getKey()+" "+ entry.getValue());

				}
	}
}
