package com.nagarro.implementation;

import com.nagarro.constants.Constants;
import com.nagarro.model.PriorityNode;

public class PriorityQueue {
		private PriorityNode front, rear;


		/**
		 * Insert data and priority of element
		 * 
		 * @param newData
		 * @param priority
		 */
		public void enqueuePriority(int newData, int priority) {
			PriorityNode newPriorityNode = new PriorityNode(newData, priority);
			if (front == null || priority < front.getPriority()) {
				newPriorityNode.setNext(front);
				front = newPriorityNode;
			} else {
				PriorityNode temp = front;
				while (temp.getNext() != null && temp.getNext().getPriority() < priority) {
					temp = temp.getNext();

				}
				newPriorityNode.setNext(temp.getNext());
				temp.setNext(newPriorityNode);
				System.out.println(Constants.INSERT_SUCCESS);
				return;
			}

		}

		/**
		 * Delete element of highest priority
		 */
		public void dequeuePriority() {
			if (front == null) {
				System.out.println(Constants.QUEUE_EMPTY);
				return;
			} else if (front == rear) {
				front = null;
				rear = null;
				System.out.println(Constants.DELETE_SUCCESS);
			} else {
				front = front.getNext();
				System.out.println(Constants.DELETE_SUCCESS);
			}
		}

		/**
		 * prints the top element of the queue
		 */
		public void peek() {
			if (front == null) {
				System.out.println(Constants.QUEUE_EMPTY);
			} else {
				System.out.println(Constants.TOP_ELEMENT + front.getData());
			}
		}

		/**
		 * check if element is present in the queue
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
				PriorityNode temp = front;
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
		 * Returns the size of priority queue
		 * 
		 * @return
		 */
		public int size() {
			int count = 0;
			if (front == null) {
				return count;
			} else {
				PriorityNode temp = front;
				while (temp != null) {
					count++;
					temp = temp.getNext();
				}
				return count;
			}
		}

		/**
		 * Prints the center of the priority Queue
		 */
		public void printCenter() {
			PriorityNode slowPtr = front;
			PriorityNode fastPtr = front;

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
		 * Sort the Priority Queue
		 */
		public void sort() {
			boolean flag;
			PriorityNode temp;
			PriorityNode temp2 = null;

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
		 * Reverse the Priority Queue
		 */
		public void reverse() {
			if (front == null) {
				System.out.println(Constants.QUEUE_EMPTY);
			} else if (front == rear) {
				int temporary = rear.getData();
				rear.setData(front.getData());
				front.setData(temporary);
				System.out.println(Constants.REVERSE_SUCCESS);
			} else {
				PriorityNode prev = null;
				PriorityNode current = front;
				PriorityNode next = null;
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
		 * Prints the whole priority queue
		 */
		public void print() {
			if (front == null) {
				System.out.println(Constants.QUEUE_EMPTY);
				return;
			}
			PriorityNode temp = front;
			while (temp != null) {
				System.out.print(temp.getData() + " ");
				temp = temp.getNext();
			}
			System.out.println();
		}
	}



