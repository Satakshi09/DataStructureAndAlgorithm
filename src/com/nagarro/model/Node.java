package com.nagarro.model;

public class Node {
	private int data;
	private Node next;

	// Constructor to create a new node
	public Node(int d) {
		data = d;
		next = null;
	}

	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}

	/**
	 * data the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}

	/**
	 * @return the next
	 */
	public Node getNext() {
		return next;
	}

	/**
	 * next the next to set
	 */
	public void setNext(Node next) {
		this.next = next;
	}
	
}

