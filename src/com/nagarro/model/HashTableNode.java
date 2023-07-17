package com.nagarro.model;


public class HashTableNode {
	private int key;
	private int data;

	public HashTableNode() {
	}

	public HashTableNode(int key, int data) {
		this.key = key;
		this.data = data;
	}

	/**
	 * @return the key
	 */
	public int getKey() {
		return key;
	}

	/**
	 *  @param key the key to set
	 */
	public void setKey(int key) {
		this.key = key;
	}

	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}

}
