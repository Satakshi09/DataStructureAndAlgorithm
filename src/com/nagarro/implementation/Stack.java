package com.nagarro.implementation;

import com.nagarro.constants.Constants;
import com.nagarro.model.Node;

public class Stack {
	private Node head;

	/**
	 * Push element in stack
	 * 
	 * @param data
	 */
	public void push(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			head = newNode;
			newNode.setNext(temp);
		}
		System.out.println(Constants.PUSHED_MESSAGE + data);
	}

	/**
	 * Pop the top element from stack
	 */
	public void pop() {
		int popped = Integer.MIN_VALUE;
		if (head == null) {
			System.out.println(Constants.EMPTY_STACK);
			return;
		} else {
			popped = head.getData();
			head = head.getNext();
			System.out.println(Constants.POPPED_MESSAGE + popped);
		}
	}

	/**
	 * Prints the top element from stack
	 */
	public void peek() {
		if (head == null) {
			System.out.println(Constants.EMPTY_STACK);
		} else {
			System.out.println(Constants.TOP_ELEMENT + head.getData());
		}
	}

	/**
	 * Checks if element is present in stack
	 * 
	 * @param element
	 */
	public void contains(int element) {
		if (head == null) {
			System.out.println(Constants.EMPTY_STACK);
			return;
		} else if (head.getNext() == null && head.getData() == element) {
			System.out.println(Constants.ELEMENT_PRESENT);
			return;
		} else {
			Node temp = head;
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
	 * returns the size of stack
	 * 
	 * @return
	 */
	public int size() {
		int count = 0;
		if (head == null)
			return 0;
		else if (head.getNext() == null)
			return 1;
		else {
			Node temp = head;
			while (temp != null) {
				count++;
				temp = temp.getNext();
			}
		}
		return count;
	}

	/**
	 * Function to print center of Stack
	 */
	public void printCenter() {
		Node slowPtr = head;
		Node fastPtr = head;

		if (head == null) {
			System.out.println(Constants.EMPTY_STACK);
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
	 * Sort the stack
	 */
	public void sort() {
		boolean flag;
		Node temp;
		Node temp2 = null;

		/* Checking for empty list */
		if (head == null) {
			System.out.println(Constants.EMPTY_STACK);
			return;
		}
		do {
			flag = false;
			temp = head;
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
	 * reverse the stack
	 */
	public void reverse() {
		Node prev = null;
		Node current = head;
		Node next = null;
		while (current != null) {
			next = current.getNext();
			current.setNext(prev);
			prev = current;
			current = next;
		}
		head = prev;
		if (head != null)
			System.out.println(Constants.REVERSE_SUCCESS);
		else
			System.out.println(Constants.EMPTY_STACK);
	}

	/**
	 * Prints whole stack
	 */
	public void print() {
		if (head == null) {
			System.out.println(Constants.EMPTY_STACK);
			return;
		}
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
		System.out.println();
	}
}

