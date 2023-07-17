package com.nagarro.implementation;

import com.nagarro.constants.Constants;
import com.nagarro.model.HashTableNode;

public class HashTable {
	private HashTableNode[] hashTable = new HashTableNode[Constants.HASH_SIZE];

	/**
	 * Default constructor
	 */
	public HashTable() {

	}

	/**
	 * Insert/Update element in hashTable according to key
	 * 
	 * @param data
	 * @param key
	 */
	public void insert(int data, int key) {
		for (int i = 0; i < hashTable.length; i++) {
			if (hashTable[i].getKey() == key) {
				hashTable[i].setData(data);
				System.out.println(Constants.UPDATE_SUCCESS);
				return;
			}
		}

		HashTableNode[] temp = new HashTableNode[hashTable.length + 1];
		for (int i = 0; i < hashTable.length; i++) {
			temp[i] = new HashTableNode();
			temp[i] = hashTable[i];
		}
		temp[hashTable.length] = new HashTableNode();
		temp[hashTable.length].setData(data);
		temp[hashTable.length].setKey(key);
		hashTable = temp;

		System.out.println(Constants.INSERT_SUCCESS);
	}

	/**
	 * Delete element in hashTable according to key
	 * 
	 * @param key
	 */
	public void delete(int key) {
		if (hashTable.length > 0) {
			for (int i = 0; i < hashTable.length; i++) {
				if (hashTable[i].getKey() == key) {
					HashTableNode[] temp = new HashTableNode[hashTable.length - 1];
					for (int j = i; j < hashTable.length - 1; j++) {
						hashTable[j] = hashTable[j + 1];
					}
					for (int j = 0; j < hashTable.length - 1; j++) {
						temp[j] = hashTable[j];
					}
					hashTable = temp;
					System.out.println(Constants.DELETE_SUCCESS);
					return;
				}
			}
			System.out.println(Constants.NO_ELEMENT);
		} else {
			System.out.println(Constants.EMPTY_HASH_TABLE);
		}
	}

	/**
	 * Checks if value is present in hashTable
	 * 
	 * @param data
	 */
	public void contains(int data) {
		for (int i = 0; i < hashTable.length; i++) {
			if (hashTable[i].getData() == data) {
				System.out.println(Constants.ELEMENT_PRESENT);
				return;
			}
		}
		System.out.println(Constants.ELEMENT_NOT_PRESENT);
	}

	/**
	 * Prints value of the corresponding key if present
	 * 
	 * @param key
	 */
	public void getValueByKey(int key) {
		for (int i = 0; i < hashTable.length; i++) {
			if (hashTable[i].getKey() == key) {
				System.out.println(Constants.VALUE + hashTable[i].getData());
				return;
			}
		}
		System.out.println(Constants.ELEMENT_NOT_PRESENT);
	}

	/**
	 * returns the size of the hashTable
	 * 
	 * @return
	 */
	public int size() {
		return hashTable.length;
	}

	/**
	 * traverse and print the values of hashTable
	 */
	public void print() {
		if (hashTable.length > 0) {
			for (int i = 0; i < hashTable.length; i++) {
				System.out.print(hashTable[i].getData() + " ");
			}
			System.out.println();
		} else {
			System.out.println(Constants.EMPTY_HASH_TABLE);
		}
	}
}

