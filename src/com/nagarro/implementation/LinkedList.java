package com.nagarro.implementation;

import com.nagarro.constants.Constants;
import com.nagarro.model.Node;

public class LinkedList {
	private Node head;

	/**
	 * @param newData This function is in LinkedList class. Inserts a new Node at
	 *                front of the list.
	 */
	public void insert(int newData) {
		Node newNode = new Node(newData);
		newNode.setNext(head);
		head = newNode;
		System.out.println(Constants.INSERT_SUCCESS);
	}

	/**
	 * insert element at a particular position
	 * 
	 * @param position
	 * @param data
	 */
	public void insertAtPosition(int position, int data) {
		Node temp = head;
		if (position < 1) {
			System.out.println(Constants.INVALID_POSITION);
			return;
		}
		// if position is 1 then new node is
		// set infornt of head node
		// head node is changing.
		if (position == 1) {
			Node newNode = new Node(data);
			newNode.setNext(head);
			head = newNode;
		} else if (position <= size() + 1) {
			while (position-- != 0) {
				if (position == 1) {
					// adding Node at required position
					Node newNode = new Node(data);

					// Making the new Node to point to
					// the old Node at the same position
					newNode.setNext(temp.getNext());

					// Replacing current with new Node
					// to the old Node to point to the new Node
					temp.setNext(newNode);
					System.out.println(Constants.INSERT_SUCCESS);
					break;
				}
				temp = temp.getNext();
			}
		} else
			System.out.println(Constants.OUT_OF_RANGE);
	}

	/**
	 * Given a key, deletes the first occurrence of key in linked list
	 * 
	 * @param key
	 */
	public void deleteNode(int key) {
		// Store head node
		Node temp = head;
		Node prev = null;

		if (head == null) {
			System.out.println(Constants.LIST_EMPTY);
			return;
		}
		// If head node itself holds the key to be deleted
		if (head != null && head.getData() == key) {
			head = temp.getNext(); // Changed head
			System.out.println(Constants.DELETE_SUCCESS);
			return;
		}

		// Search for the key to be deleted, keep track of
		// the previous node as we need to change temp.next
		while (temp != null && temp.getData() != key) {
			prev = temp;
			temp = temp.getNext();
		}

		// If key was not present in linked list
		if (temp == null) {
			System.out.println(Constants.NO_ELEMENT);
			return;
		}

		// Unlink the node from linked list
		if (prev != null) {
			prev.setNext(temp.getNext());
			System.out.println(Constants.DELETE_SUCCESS);
		}
	}

	/**
	 * Delete from a particular position
	 * 
	 * @param position
	 */
	public void deleteAtPosition(int position) {
		Node temp = head;
		Node prev = null;
		if (head == null) {
			System.out.println(Constants.LIST_EMPTY);
			return;
		}
		if (position < 1)
			System.out.println(Constants.INVALID_POSITION);

		// if position is 1 then
		// head node is changing to head->next.
		if (position == 1) {
			head = head.getNext();
			System.out.println(Constants.DELETE_SUCCESS);
		} else {
			while (position-- != 0) {
				if (position == 1) {
					// Making the next of prev Node point to
					// the next of temp node
					if (prev != null)
						prev.setNext(temp.getNext());
					break;
				}
				temp = temp.getNext();
				prev = temp;
				System.out.println(Constants.DELETE_SUCCESS);
				return;
			}
			if (position != 1)
				System.out.println(Constants.OUT_OF_RANGE);
		}
	}

	/**
	 * Function to print center of linked list
	 */
	public void printCenter() {
		Node slowPtr = head;
		Node fastPtr = head;

		if (head == null) {
			System.out.println(Constants.LIST_EMPTY);
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
	 * Sort the linked list
	 */
	public void sort() {
		boolean flag;
		Node temp;
		Node temp2 = null;

		/* Checking for empty list */
		if (head == null) {
			System.out.println(Constants.LIST_EMPTY);
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
	 * Reverse a linked list
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
			System.out.println(Constants.LIST_EMPTY);
	}

	/**
	 * returns the size of linked list
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
	 * Print all element of linked list
	 */
	public void print() {
		if (head == null) {
			System.out.println(Constants.LIST_EMPTY);
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
