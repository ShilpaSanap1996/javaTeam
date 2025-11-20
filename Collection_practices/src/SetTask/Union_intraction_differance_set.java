package SetTask;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Union_intraction_differance_set {
	public static void main(String[] args) {
		Set<Integer> A = new HashSet<>(Arrays.asList(1, 2, 3, 4));
		Set<Integer> B = new HashSet<>(Arrays.asList(3, 4, 5, 6));
		
			//union//{1,2,3,4,5,6}
//		Set<Integer> union= new HashSet(A);
//		union.addAll(B);
//		System.out.println(union);
		
		//intrsection//{3,4}
//		Set<Integer> intersection= new HashSet(A);
//		intersection.retainAll(B);
//		System.out.println(intersection);
//		
		//differance set//
		Set<Integer> differenceAB = new HashSet<>(A);
		differenceAB.removeAll(B);//[1,2]
		System.out.println("A - B: " + differenceAB);
		
		Set<Integer> differenceBA = new HashSet<>(B);
		differenceBA.removeAll(A);//[5,6]
		System.out.println("B - A: " + differenceBA);
	}

}
