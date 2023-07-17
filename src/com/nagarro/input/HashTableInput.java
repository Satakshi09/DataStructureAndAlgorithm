package com.nagarro.input;

import java.util.Scanner;

import com.nagarro.constants.Constants;
import com.nagarro.implementation.HashTable;
import com.nagarro.input.exception.IntegerTypeInput;

public class HashTableInput {
	HashTable hash = new HashTable();
	IntegerTypeInput input = new IntegerTypeInput();
	Scanner sc = new Scanner(System.in);
	char ch = 'y';
	int choice = -1;
	boolean inputValid;
	int data;
	int key;

	public void showMenu() {
		do {
			System.out.println(Constants.INSERT_OPTION_HASH);
			System.out.println(Constants.DELETE_OPTION_HASH);
			System.out.println(Constants.CONTAINS_OPTION_HASH);
			System.out.println(Constants.VALUE_BY_KEY_OPTION_HASH);
			System.out.println(Constants.SIZE_OPTION_HASH);
			System.out.println(Constants.ITERATOR_OPTION_HASH);
			System.out.println(Constants.PRINT_OPTION_HASH);
			System.out.print(Constants.SELECT_OPTION);
			inputValid = false;
			choice = input.integerTypeIntput();
			switch (choice) {
			case 1:
				System.out.print(Constants.NUMBER_TO_INSERT);
				data = input.integerTypeIntput();
				System.out.print(Constants.KEY_INSERT);
				key = input.integerTypeIntput();
				hash.insert(data, key);
				break;
			case 2:
				System.out.println(Constants.KEY_TO_DELETE);
				key = input.integerTypeIntput();
				hash.delete(key);
				break;
			case 3:
				System.out.println(Constants.CONTAINS_VALUE);
				data = input.integerTypeIntput();
				hash.contains(data);
				break;
			case 4:
				System.out.println(Constants.KEY_INSERT);
				key = input.integerTypeIntput();
				hash.getValueByKey(key);
				break;
			case 5:
				System.out.println(Constants.SIZE + hash.size());
				break;
			case 6:
				hash.print();
				break;
			case 7:
				hash.print();
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

