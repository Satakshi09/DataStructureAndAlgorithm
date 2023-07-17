package com.nagarro.implementation;

import com.nagarro.constants.Constants;
import com.nagarro.model.Node;

public class Queue {
	private Node front, rear;

	public Queue() {
		this.front = this.rear = null;
	}

	/**
	 * Method to add an key to the queue.
	 * 
	 * @param key
	 */
	public void enqueue(int key) {

		// Create a new LL node
		Node temp = new Node(key);

		// If queue is empty, then new node is front and rear both
		if (this.rear == null) {
			this.front = this.rear = temp;
			System.out.println(Constants.ENQUEUE + key);
			return;
		}

		// Add the new node at the end of queue and change rear
		this.rear.setNext(temp);
		this.rear = temp;
		System.out.println(Constants.ENQUEUE + key);
	}

	/**
	 * Method to remove an key from queue.
	 */
	public void dequeue() {
		// If queue is empty, return NULL.
		if (this.front == null) {
			System.out.println(Constants.QUEUE_EMPTY);
			return;
		}

		// Store previous front and move front one node ahead
		Node temp = this.front;
		this.front = this.front.getNext();
		System.out.println(Constants.DEQUEUE + temp.getData());

		// If front becomes NULL, then change rear also as NULL
		if (this.front == null)
			this.rear = null;
	}

	/**
	 * prints top element of the queue
	 */
	public void peek() {
		if (front == null) {
			System.out.println(Constants.QUEUE_EMPTY);
		} else {
			System.out.println(Constants.TOP_ELEMENT + front.getData());
		}
	}

	/**
	 * check if elements is present or not in queue
	 * 
	 * @param element
	 */
	public void contains(int element) {
		if (front == null) {
			System.out.println(Constants.QUEUE_EMPTY);
			return;
		} else if (front.getNext() == null && front.getData() == element) {
			System.out.println(Constants.ELEMENT_PRESENT);
			return;
		} else {
			Node temp = front;
			while (temp != null) {
				if (temp.getData() == element) {
					System.out.println(Constants.ELEMENT_PRESENT);
					return;
				}
				temp = temp.getNext();
			}
			System.out.println(Constants.ELEMENT_NOT_PRESENT);
		}
	}

	/**
	 * Returns the size of queue
	 * 
	 * @return
	 */
	public int size() {
		int count = 0;
		if (front == null) {
			return count;
		} else {
			Node temp = front;
			while (temp != null) {
				count++;
				temp = temp.getNext();
			}
			return count;
		}
	}

	/**
	 * Prints the center element of queue
	 */
	public void printCenter() {
		Node slowPtr = front;
		Node fastPtr = front;

		if (slowPtr == null) {
			System.out.println(Constants.QUEUE_EMPTY);
			return;
		}
		while (fastPtr != null && fastPtr.getNext() != null) {
			fastPtr = fastPtr.getNext().getNext();
			slowPtr = slowPtr.getNext();
		}
		if (slowPtr != null)
			System.out.println("The center element is [" + slowPtr.getData() + "] \n");
	}

	/**
	 * Sort the queue
	 */
	public void sort() {
		boolean flag;
		Node temp;
		Node temp2 = null;

		/* Checking for empty list */
		if (front == null) {
			System.out.println(Constants.QUEUE_EMPTY);
			return;
		}
		do {
			flag = false;
			temp = front;
			while (temp.getNext() != temp2) {
				if (temp.getData() > temp.getNext().getData()) {
					int tempValue = temp.getData();
					temp.setData(temp.getNext().getData());
					temp.getNext().setData(tempValue);
					flag = true;
				}
				temp = temp.getNext();
			}
			temp2 = temp;
		} while (flag);
		System.out.println(Constants.SORT_SUCCESS);
	}

	/**
	 * Reverse the queue
	 */
	public void reverse() {
		/* Function to reverse the linked list */
		if (front == null) {
			System.out.println(Constants.QUEUE_EMPTY);
		} else if (front == rear) {
			int temporary = rear.getData();
			rear.setData(front.getData());
			front.setData(temporary);
			System.out.println(Constants.REVERSE_SUCCESS);
		} else {
			Node prev = null;
			Node current = front;
			Node next = null;
			rear = front;
			while (current != null) {
				next = current.getNext();
				current.setNext(prev);
				prev = current;
				current = next;
			}
			front = prev;
			System.out.println(Constants.REVERSE_SUCCESS);
		}
	}

	/**
	 * Print whole queue
	 */
	public void print() {
		if (front == null) {
			System.out.println(Constants.QUEUE_EMPTY);
			return;
		}
		Node temp = front;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
		System.out.println();
	}
}

