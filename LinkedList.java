package com.sachin.datastructures.list;

public class LinkedList {
	Node head;
	
	public void append(int data) {
		if(head == null){
			head = new Node(data);
			return;
		}
		Node current = head;
		while(current.next != null){
			current = current.next;
		}
		current.next = new Node(data);
	}
	
	public void prepend(int data) {
		Node newHead = new Node(data);
		newHead.next = head;
		head = newHead;
	}
	
	public void deleteWithValue(int data) {
		if(head == null) return;
		
		if(head.data == data){
			head = head.next;
			return;
		}
		Node current = head;
		while(current.next != null){
			if(current.next.data == data){
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
	}
	
	public void deleteFirst() {
		if(head == null) return;
		
		head = head.next;
	}
	
	public void deleteLast() {
		if(head == null) return;
		
		if(head.next == null){
			head = null;
			return;
		}
		Node current = head;
		while(current.next.next != null){
			current = current.next;
		}
		current.next = null;
	}
	
	public boolean hasCycle() {
		if(head == null) return false;
		
		Node fast = head.next;
		Node slow = head;
		while(fast != null && fast.next != null && slow != null){
			if(fast == slow){
				return true;
			}
			fast = fast.next.next;
			slow = slow.next;
		}
		return false;
	}
}
