import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class SampleHeaps {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Collections.addAll(list, 1,7,6,8,9);
		System.out.println(list.get(0));
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		System.out.println(list.get(1));
	}
}