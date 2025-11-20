package SetTask;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Settask {
	public static void main(String[] args) {
//		Set<String> set= new LinkedHashSet<>();
//		set.add("shilpa");
//		set.add("sanap");
//		set.add("Guddi");
//		set.add("pooja");
//		set.add("allinone");
//		set.add("sanap");
//		
//		System.out.println(set);
//		
//		/*Hashset can't allowd duplicate shilpa guddi pooja allinone sanap*/
//		/*treeset sort and maintain that order [Guddi, allinone, pooja, sanap, shilpa]*/
//		/*Linkedhashset [shilpa, sanap, Guddi, pooja, allinone]*/preserv order*/
		
		
		List<String> list = Arrays.asList("s","f","s","a","f","m","g");
		Set<String> set = new LinkedHashSet(list);
		
		System.out.println(set);
		
		
		
	}

}
