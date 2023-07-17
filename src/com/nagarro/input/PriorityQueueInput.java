package com.nagarro.input;

import java.util.Scanner;

import com.nagarro.constants.Constants;
import com.nagarro.implementation.PriorityQueue;
import com.nagarro.input.exception.IntegerTypeInput;

public class PriorityQueueInput {
	PriorityQueue pQueue = new PriorityQueue();
	IntegerTypeInput input = new IntegerTypeInput();
	Scanner sc = new Scanner(System.in);
	char ch = 'y';
	int choice = -1;
	int priority = -1;
	boolean inputValid;
	int data;
	int position;

	public void showMenu() {
		do {
			System.out.println(Constants.ENQUEUE_OPTION);
			System.out.println(Constants.DEQUEUE_OPTION);
			System.out.println(Constants.PEEK_OPTION);
			System.out.println(Constants.CONTAINS_OPTION);
			System.out.println(Constants.CENTER_OPTION);
			System.out.println(Constants.SORT_OPTION);
			System.out.println(Constants.REVERSE_OPTION);
			System.out.println(Constants.SIZE_OPTION);
			System.out.println(Constants.ITERATOR_OPTION);
			System.out.println(Constants.PRINT_OPTION);
			System.out.print(Constants.SELECT_OPTION);
			inputValid = false;
			choice = input.integerTypeIntput();
			switch (choice) {
			case 1:
				System.out.print(Constants.PUSH);
				data = input.integerTypeIntput();
				System.out.print(Constants.PRIORITY);
				priority = input.integerTypeIntput();
				pQueue.enqueuePriority(data, priority);
				break;
			case 2:
				pQueue.dequeuePriority();
				break;
			case 3:
				pQueue.peek();
				break;
			case 4:
				System.out.print(Constants.CONTAINS);
				data = input.integerTypeIntput();
				pQueue.contains(data);
				break;
			case 5:
				pQueue.printCenter();
				break;
			case 6:
				pQueue.sort();
				break;
			case 7:
				pQueue.reverse();
				break;
			case 8:
				System.out.println(Constants.SIZE + pQueue.size());
				break;
			case 9:
				pQueue.print();
				break;
			case 10:
				pQueue.print();
				break;
			}
			System.out.print(Constants.CONTINUE_STATEMENT);
			inputValid = false;
			while (!inputValid) {
				ch = sc.next().toLowerCase().charAt(0);
				if (ch == 'y' || ch == 'n')
					inputValid = true;
				else {
					inputValid = false;
					System.out.println(Constants.INVALID_CHAR);
					System.out.print(Constants.CONTINUE_STATEMENT);
				}
			}
		} while (ch == 'y');
	}
}



	