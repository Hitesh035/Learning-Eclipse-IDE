package com.data_structure;

import java.util.*;

public class HashSetDemoImplementation {
	private Node[] nodeArray = new Node[10];
	private int count = 0;

	public boolean add(int n) {

		int hashCode = n % this.nodeArray.length;

		if (nodeArray[hashCode] == null) {
			nodeArray[hashCode] = new Node(n, null);
			count++;
			return true;
		} else if (nodeArray[hashCode] != null && nodeArray[hashCode].get() != n) {
			Node curr = nodeArray[hashCode];
			while (curr.next != null && curr.next.get() != n) {
				curr = curr.next;
			}

			if (curr.next == null && curr.get() != n) {
				curr.next = new Node(n, null);
				count++;
				return true;
			}
			return false;
		}
		return false;
	}

	public boolean addAll(int... n) {
		boolean flag = false;
		for (int i = 0; i < n.length; i++) {
			int hashCode = n[i] % this.nodeArray.length;

			if (nodeArray[hashCode] == null) {
				nodeArray[hashCode] = new Node(n[i], null);
				count++;
				flag =true;
				break;
			} else if (nodeArray[hashCode] != null && nodeArray[hashCode].get() != n[i]) {
				Node curr = nodeArray[hashCode];
				while (curr.next != null && curr.next.get() != n[i]) {
					curr = curr.next;
				}

				if (curr.next == null && curr.get() != n[i]) {
					curr.next = new Node(n[i], null);
					count++;
					flag =true;
					
				}

			}

		}
		return flag;
	}

	public int size() {
		return count;
	}

	public boolean contains(int n) {
		if (this.size() != 0 && this.nodeArray[n % this.nodeArray.length] != null) {
			int hashCode = n % this.nodeArray.length;
			Node curr = this.nodeArray[hashCode];
			while (curr.next != null && curr.get() != n) {
				curr = curr.next;
			}

			if (curr.get() == n) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		HashSetDemoImplementation set1 = new HashSetDemoImplementation();
		HashSetDemoImplementation set2 = new HashSetDemoImplementation();

		System.out.println(set1.add(0));
		System.out.println(set1.add(0));
		System.out.println(set1.add(10));
		System.out.println(set1.add(11));
		System.out.println(set1.add(12));
		System.out.println(set1.add(13));
		System.out.println(set1.add(10));
		System.out.println(set1.size());
		System.out.println(set2.size());
		System.out.println(set2.contains(3));
		System.out.println(set1.contains(110));
		System.out.println(set1.addAll(10,11,19));
		System.out.println(set1.contains(19));

		HashSet<Integer> set3 = new HashSet<>();

		Collection<Integer> c1 = new ArrayList<>();
		c1.add(1);
		c1.add(1);
		c1.add(1);

		set3.add(1);
		System.out.println(set3.addAll(c1));

		for (Integer i : set3) {
			System.out.println(i);
		}

	}

}
