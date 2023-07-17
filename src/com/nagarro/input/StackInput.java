package com.nagarro.input;

import java.util.Scanner;

import com.nagarro.constants.Constants;
import com.nagarro.implementation.Stack;
import com.nagarro.input.exception.IntegerTypeInput;

public class StackInput {
	Stack list = new Stack();
	IntegerTypeInput input = new IntegerTypeInput();
	Scanner sc = new Scanner(System.in);
	char ch = 'y';
	int choice = -1;
	boolean inputValid;
	int data;
	int position;

	public void showMenu() {
		do {
			System.out.println(Constants.PUSH_OPTION);
			System.out.println(Constants.POP_OPTION);
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
				list.push(data);
				break;
			case 2:
				list.pop();
				break;
			case 3:
				list.peek();
				break;
			case 4:
				System.out.print(Constants.CONTAINS);
				data = input.integerTypeIntput();
				list.contains(data);
				break;
			case 5:
				list.printCenter();
				break;
			case 6:
				list.sort();
				break;
			case 7:
				list.reverse();
				break;
			case 8:
				System.out.println(Constants.SIZE + list.size());
				break;
			case 9:
				list.print();
				break;
			case 10:
				list.print();
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
