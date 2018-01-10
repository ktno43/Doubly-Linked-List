import java.util.Iterator;

public class Queue<T extends Comparable<T>> implements myQueue<T> {
	/*************
	 * Fields
	 *************/
	private DoublyLinkedList<T> queueLinkedList; // doubly linked list instance

	/**************************************
	 * Constructor: Initialize empty queue
	 **************************************/
	public Queue() {
		queueLinkedList = new DoublyLinkedList<T>(); // initialize empty linked list
	}

	/**********************************************
	 * Constructor: Initialize a queue from T data
	 **********************************************/
	public Queue(T[] objectArray) {
		queueLinkedList = new DoublyLinkedList<T>(objectArray); // initialize linked list from T[]
	}

	/*************************
	 * Get size of the queue
	 *************************/
	@Override
	public int size() {
		return queueLinkedList.getSize(); // get the size of the queue
	}

	/*************************************
	 * Check to see if the queue is empty
	 *************************************/
	@Override
	public boolean isEmpty() {
		return queueLinkedList.isEmpty(); // check to see if the queue is empty
	}

	/***********************************************************************************
	 * Return element of type T that was the first element in the queue w/o removing it
	 ***********************************************************************************/
	@Override
	public T front() {
		if (isEmpty()) { // if it's empty return null since there's no elements
			return null;
		}

		return queueLinkedList.getFirstElement(); // get first element in the queue
	}

	/**********************************************************************************
	 * Return element of type T that was the last element in the queue w/o removing it
	 **********************************************************************************/
	@Override
	public T back() { // if it's empty return null since there's no elements
		if (isEmpty()) {
			return null;
		}

		return queueLinkedList.getLastElement(); // get last element in the queue
	}

	/**********************************************************************
	 * Return the element of type T that was at index "x" w/o removing it
	 **********************************************************************/
	@Override
	public T atIndex(int x) {
		if (x < 0 || x > this.queueLinkedList.getSize()) { // make sure the index is within range
			return null;
		}

		return this.queueLinkedList.getAtIndex(x); // get element at x position in queue
	}

	/*************************************************
	 * Add element of type T to the end of the queue
	 *************************************************/
	@Override
	public void enqueue(T element) {
		queueLinkedList.addToEndOfList(element); // add an element to the end of the queue (FIFO)
	}

	/*******************************************************************************************
	 * Remove element from the front of the queue, returning what element of type T was removed
	 *******************************************************************************************/
	@Override
	public T dequeue() {
		if (isEmpty()) {
			return null; // nothing to dequeue
			// should probably throw an exception?
		}

		else {
			T temp = queueLinkedList.getFirstElement(); // temp value holding what was removed from the queue
			queueLinkedList.deleteFromFrontOfList(); // delete first element in the queue (FIFO)

			return temp; // return the first element's value that was removed from the queue
		}
	}

	/**********************************
	 * Remove an element at position x
	 **********************************/
	public T removeAtIndex(int x) {
		T temp = queueLinkedList.getAtIndex(x);

		if (x < 0 || x > this.queueLinkedList.getSize()) { // tried to delete something out of range
			return null;
		}

		if (x == 0) {
			this.queueLinkedList.deleteFromFrontOfList(); // if it's 0, delete the first element of the list
			return temp;
		}

		queueLinkedList.deleteAtIndex(x); // delete at given index

		return temp;
	}

	/************************************************
	 * Checks to see if the queue's values are equal
	 ************************************************/
	public boolean isEqual(Queue<T> otherQueue) {
		return queueLinkedList.isEqual(otherQueue.queueLinkedList); // check to see if the queues are equal
	}

	/*****************************
	 * Queue Linked List toString
	 *****************************/
	public String toString() {
		return queueLinkedList.toString(); // queue list to string representation
	}

	/********************************
	 * Implements iterable interface
	 ********************************/
	public Iterator<T> iterator() {
		return queueLinkedList.iterator(); // make an iterator for the queue
	}

	/******************
	 * Empty the queue
	 ******************/
	@Override
	public void empty() {
		queueLinkedList = new DoublyLinkedList<T>(); // empty the current list by making a new list
	}
}
