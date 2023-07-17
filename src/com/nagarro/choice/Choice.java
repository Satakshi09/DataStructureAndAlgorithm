package com.nagarro.choice;

import com.nagarro.constants.Constants;
import com.nagarro.input.HashTableInput;
import com.nagarro.input.LinkedListInput;
import com.nagarro.input.PriorityQueueInput;
import com.nagarro.input.QueueInput;
import com.nagarro.input.StackInput;
import com.nagarro.input.exception.IntegerTypeInput;

public class Choice {
	public static void options() {
		IntegerTypeInput value = new IntegerTypeInput();
		boolean isRight = true;

		System.out.println(Constants.CHOICE);
		System.out.println(Constants.OPTION_LINKEDLIST);
		System.out.println(Constants.OPTION_STACK);
		System.out.println(Constants.OPTION_QUEUE);
		System.out.println(Constants.OPTION_PRIORITY_QUEUE);
		System.out.println(Constants.OPTION_HASHTABLE);
		System.out.println(Constants.EXIT);
		while (isRight) {

			switch (value.integerTypeIntput()) {
			case 1:
				LinkedListInput linkedList = new LinkedListInput();
				linkedList.showMenu();
				isRight = false;
				break;
			case 2:
				StackInput stack=new StackInput();
				stack.showMenu();
				isRight = false;
				break;
			case 3:
				QueueInput queue=new QueueInput();
				queue.showMenu();
				isRight = false;
				break;
			case 4:
				PriorityQueueInput priorityQueue=new PriorityQueueInput();
				priorityQueue.showMenu();
				isRight = false;
				break;
			case 5:
				HashTableInput hashTable=new HashTableInput();
				hashTable.showMenu();
				isRight = false;
				break;
			case 6:
				System.exit(0);
			}

		}

	}




}

