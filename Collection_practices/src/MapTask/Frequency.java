package MapTask;

import java.util.HashMap;

public class Frequency {
	public static void main(String[] args) {
		 int arr[] = {10,20,30,10,20,30,5};
		 
		 HashMap<Integer,Integer> map=new HashMap<>();
		 for(int num : arr) {
			 if(map.containsKey(num)) {
				 map.put(num, map.get(num)+1);
			 }else {
				 map.put(num, 1);
			 }
		 }
		System.out.println("frequency of each element:");
		for(int key:map.keySet()) {
					System.out.println(key+" -> "+map.get(key));
					}		
	}

}
