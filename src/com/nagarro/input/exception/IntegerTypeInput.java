package com.nagarro.input.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.nagarro.constants.Constants;

public class IntegerTypeInput {
	boolean inputValid;
	Scanner sc=new Scanner(System.in);
	public int integerTypeIntput() {
		inputValid=false;
		int num=0;
		while(!inputValid) {
			try {
				num=sc.nextInt();
				inputValid=true;
			}
			catch(InputMismatchException e) {
				System.out.print(Constants.INVALID_ENTRY);
				sc.nextLine();
				inputValid=false;
			}
		}
		return num;
	}
}
