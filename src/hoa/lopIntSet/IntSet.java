package hoa.lopIntSet;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class IntSet {
	private int arr[];

	public IntSet(int[] arr) {
		// TODO Auto-generated constructor stub
		this.arr = arr;
	}

	public IntSet union(IntSet o) {
		// TODO Auto-generated method stub
		Set<Integer> u = new HashSet<Integer>();
		Set<Integer> a = Arrays.stream(arr).boxed().collect(Collectors.toSet());
		Set<Integer> b = Arrays.stream(o.arr).boxed().collect(Collectors.toSet());
		u.addAll(a);
		u.addAll(b);
		int[] ints = u.stream().mapToInt(Integer::intValue).toArray();
		return new IntSet(ints);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
			if (i != arr.length - 1)
				sb.append(" ");
		}
		return sb.toString();
	}

}
