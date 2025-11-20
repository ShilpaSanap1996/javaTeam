package ListTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimpleTask {

	public static void main(String[] args) {

//		List<String> al = new ArrayList();
//		al.add("java");
//		al.add("python");
//		al.add("c++");
//		al.add("java");
//		al.add(".net");
//		System.out.println("before any operation that list:" + al);
//
//		al.add("c");// is not print in console bcoz after we will addd that in list
//		al.remove(3);
//		System.out.println(al.hashCode());
//		System.out.println("after that list:" + al);
//
//		for (String str : al) {
//
//			System.out.println(str);
//		}

		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(20);
		list.add(50);
		list.add(70);
		list.add(50);
//		list.add(null);
		list.add(5);
		list.add(30);

		Collections.sort(list);
		list.stream().sorted().forEach(System.out::println);//asending order
		System.out.println(list);

		Collections.sort(list, Collections.reverseOrder());
		list.stream().sorted((a,b)-> b - a).forEach(System.out::println);//desending order
		System.out.println(list	);
		
		System.out.println(	Collections.max(list));
		System.out.println(Collections.min(list));
		
		list.stream().distinct().forEach(System.out::println);
//		// Check if 50 is present
//		if (list.contains(50)) {
//			System.out.println("50 is present in the list");
//		} else {
//			System.out.println("50 is NOT present in the list");
//		}

	}

}
