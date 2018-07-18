package org.dsa.linkedlist;

public class GenericLinkedList<T> {
	GenericNode<T> head;
	
	public void append(T data) {
		if(head == null){
			head = new GenericNode<T>(data);
			return;
		}
		
		GenericNode<T> current = head;
		while(current.next != null){
			current = current.next;
		}
		
		current.next = new GenericNode<T>(data);
	}
}
