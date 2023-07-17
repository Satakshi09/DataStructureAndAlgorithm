## DataStructureAndAlgorithm

This repository contains Java implementations of various data structures using object-oriented principles. The implemented data structures include Linked List, Stack, Queue, Priority Queue, and Hash Table. Each data structure provides a set of functionalities to support common operations such as insertion, deletion, retrieval, sorting, reversing, size calculation, iteration, and traversal.


# Getting Started

To use these data structures in your Java project, follow these steps:

1. Clone the repository to your local machine or download the source code.
2. Open the project in your preferred Java development environment
   (e.g.,  IntelliJ, Eclipse).
3. Navigate to the desired data structure class (e.g., LinkedList.java, 
   Stack.java).
4. Instantiate an object of the respective data structure class in your 
   code.
5. Utilize the provided methods to perform the required operations on the 
   data structure.


# Data Structures Overview

### Linked List
- void insert(element): Inserts an element at the end of the linked list.
- void insertAtPosition(element, position): Inserts an element at a  
  specified position in the linked list.
- void delete(element): Deletes the first occurrence of the specified   
  element from the linked list.
- void deleteAtPosition(position): Deletes the element at the specified 
  position in the linked list.
- element center(): Returns the element in the center of the linked list.
- void sort(): Sorts the linked list in ascending order.
- void reverse(): Reverses the order of elements in the linked list.
- int size(): Returns the number of elements in the linked list.
- Iterator iterator(): Returns an iterator to iterate over the linked list.
- void traverse(): Prints the elements of the linked list.

### Stack
- void push(element): Pushes an element onto the top of the stack.
- element pop(): Removes and returns the element at the top of the stack.
- element peek(): Returns the element at the top of the stack without 
  removing it.
- boolean contains(element): Checks if the stack contains the specified
  element.
- int size(): Returns the number of elements in the stack.
- element center(): Returns the element in the center of the stack.
- void sort(): Sorts the stack in ascending order.
- void reverse(): Reverses the order of elements in the stack.
- Iterator iterator(): Returns an iterator to iterate over the stack.
- void traverse(): Prints the elements of the stack.


### Queue
- void enqueue(element): Enqueues an element at the rear of the queue.
- element dequeue(): Removes and returns the element at the front of the 
  queue.
- element peek(): Returns the element at the front of the queue without 
  removing it.
- boolean contains(element): Checks if the queue contains the specified 
  element.
- int size(): Returns the number of elements in the queue.
- element center(): Returns the element in the center of the queue.
- void sort(): Sorts the queue in ascending order.
- void reverse(): Reverses the order of elements in the queue.
- Iterator iterator(): Returns an iterator to iterate over the queue.
- void traverse(): Prints the elements of the queue.

### Priority Queue
- void enqueue(element): Enqueues an element into the priority queue based 
  on its priority.
- element dequeue(): Removes and returns the element with the highest 
  priority from the priority queue.
- element peek(): Returns the element with the highest priority from the 
  priority queue without removing it.
- boolean contains(element): Checks if the priority queue contains the 
  specified element.
- int size(): Returns the number of elements in the priority queue.
- void reverse(): Reverses the order of elements in the priority queue.
- element center(): Returns the element in the center of the priority
  queue.
- Iterator iterator(): Returns an iterator to iterate over the priority 
  queue.
- void traverse(): Prints the elements of the priority queue.
 

### Hash Table
- void insert(key, value): Inserts a key-value pair into the hash table.
- void delete(key): Deletes the key-value pair with the specified key from 
  the hash table.
- boolean contains(key): Checks if the hash table contains a key-value
  pair w ith the specified key.
- value getValue(key): Returns the value associated with the specified key
  in the hash table.
- int size(): Returns the number of key-value pairs in the hash table.

- Iterator iterator(): Returns an iterator to iterate over the hash table.
- void traverse(): Prints the key-value pairs of the hash table.
