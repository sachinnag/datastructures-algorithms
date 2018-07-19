package org.dsa.linkedlist;

import org.dsa.linkedlist.GenericLinkedList;

public class GenericLinkedListDemo {

	public static void main(String[] args) {
		GenericLinkedList<String> list1 = new GenericLinkedList<String>();
		list1.append("Bob");
		list1.append("Alice");
		
		GenericLinkedList<Integer> list2 = new GenericLinkedList<Integer>();
		list2.append(5);
		list2.append(3);
	}
}
