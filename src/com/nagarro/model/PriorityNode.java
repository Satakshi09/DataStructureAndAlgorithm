package com.nagarro.model;

public class PriorityNode {

	private int data;
	// Lower values indicate higher priority
	private int priority;
	private PriorityNode next;
	
	// Constructor to create a new node
	public PriorityNode(int data,int priority) {
			this.data = data;
			this.priority=priority;
			next = null;
		}

	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}

	/**
	 * @return the priority
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * @param priority the priority to set
	 */
	public void setPriority(int priority) {
		this.priority = priority;
	}

	/**
	 * @return the next
	 */
	public PriorityNode getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(PriorityNode next) {
		this.next = next;
	}
	
}
