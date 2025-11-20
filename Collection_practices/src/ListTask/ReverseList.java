package ListTask;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseList {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,5,9,6,2,3,5,7,8);
		Collections.reverse(list);
		System.out.println(list);
	}

}
