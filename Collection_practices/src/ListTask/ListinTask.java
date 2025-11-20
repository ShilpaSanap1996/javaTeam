package ListTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListinTask {
	public static void main(String[] args) {
//		List<String> list = Arrays.asList("apple", "orange", "mango", "mango", "bannana", "apple", "mango");
//		int count = Collections.frequency(list, "mango");
//		System.out.println(count);
//
//		Map<String, Long> map = list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
//
//		System.out.println(map);
		
//		marge two list*/
		
		List<Integer> list1 = new ArrayList<>(Arrays.asList(10, 20, 30));
		List<Integer> list2 = new ArrayList<>(Arrays.asList(40, 50, 60,30));

		list1.addAll(list2); 
		System.out.println(list1);
		
		List<Integer> list= Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
		System.out.println(list);

	}

}
