package example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collection {
	List aList = new ArrayList();
	Set aSet = new HashSet();

	public static void main(String[] argv) {
		Collection collection = new Collection();
		collection.test();
		collection.print();
	}

	private void test() {
		int value = 1;
		addValue(value);
		addValue(value);
		value++;
		addValue(value);
		value++;
		addValue(value);
	}

	private void addValue(int value) {
		aList.add(value);
		aSet.add(value);
	}

	private void print() {
		for (Object obj : aList) {
			System.out.print(obj + " ");
		}
		System.out.println();
		for (Object obj : aSet) {
			System.out.print(obj + " ");
		}
	}
}
