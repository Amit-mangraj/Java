package HasMapInternallyWorks;

import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
	public void countFreq(int arr[],int m) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		
		int maxfreq = 0;
		for(int value:map.values()) {
			if(value>maxfreq) {
				maxfreq = value;
				
			}
		}
		
		int result[] = new int[arr.length];
		int j=0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			//System.out.println(entry.getKey() + " " + entry.getValue());
			if(entry.getValue()>=m && entry.getValue()==maxfreq) {
				result[j++]=entry.getKey();
			}
		}
		
		for(int k=0;k<m;k++) {
			System.out.println(result[k]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {1,1,1,2,2,3 };
		CountFrequency cf = new CountFrequency();
		cf.countFreq(arr,2);
	}

}
