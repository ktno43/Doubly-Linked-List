import java.util.Iterator;

public class Stack<T extends Comparable<T>> implements myStack<T> {
	/*************
	 * Fields
	 *************/
	private DoublyLinkedList<T> stackLinkedList; // doubly linked list instance

	/**************************************
	 * Constructor: Initialize empty stack
	 **************************************/
	public Stack() {
		stackLinkedList = new DoublyLinkedList<T>(); // initialize empty linked list
	}

	/**********************************************
	 * Constructor: Initialize a stack from T data
	 **********************************************/
	public Stack(T[] objectArray) {
		stackLinkedList = new DoublyLinkedList<T>(objectArray); // initialize linked list from T[]
	}

	/*************************
	 * Get size of the stack
	 *************************/
	@Override
	public int size() {
		return stackLinkedList.getSize(); // get the size of the stack
	}

	/*************************************
	 * Check to see if the stack is empty
	 *************************************/
	@Override
	public boolean isEmpty() {
		return stackLinkedList.isEmpty(); // check to see if the stack is empty
	}

	/***********************************************************************************
	 * Return element of type T that was the first element in the stack w/o removing it
	 ***********************************************************************************/
	@Override
	public T peek() {
		return stackLinkedList.getFirstElement(); // get first element in the stack (what's on top)
	}

	/**********************************************************************
	 * Return the element of type T that was at index "x" w/o removing it
	 **********************************************************************/
	@Override
	public T atIndex(int x) {
		if (x < 0 || x > this.stackLinkedList.getSize()) { // didn't delete anything because it's out of range
			return null;
		}

		return this.stackLinkedList.getAtIndex(x); // get the element at x position in the stack
	}

	/**************************************************
	 * Add element of type T to the front of the stack
	 **************************************************/
	@Override
	public void push(T element) {
		stackLinkedList.addToFrontOfList(element); // add an elment to the top of the stack (FILO)
	}

	/*******************************************************************************************
	 * Remove element from the front of the stack, returning what element of type T was removed
	 *******************************************************************************************/
	@Override
	public T pop() {
		if (isEmpty()) {
			return null; // nothing to pop
			// should probably throw an exception?
		}

		else { // something to pop
			T temp = stackLinkedList.getFirstElement(); // value of the top most element of the stack
			stackLinkedList.deleteFromFrontOfList(); // delete the element on top of the stack

			return temp; // return the value that was removed from the top of the stack
		}
	}

	/**********************************
	 * Remove an element at position x
	 **********************************/
	public T removeAtIndex(int x) {
		T temp = stackLinkedList.getAtIndex(x);

		if (x < 0 || x > this.stackLinkedList.getSize()) { // tried to delete something out of range
			return null;
		}

		if (x == 0) {
			this.stackLinkedList.deleteFromFrontOfList(); // if it's 0, delete the first element of the list
			return temp;
		}

		stackLinkedList.deleteAtIndex(x); // delete at given index

		return temp;
	}

	/************************************************
	 * Checks to see if the stack's values are equal
	 ************************************************/
	public boolean isEqual(Stack<T> otherStack) {
		return stackLinkedList.isEqual(otherStack.stackLinkedList); // check to see if the stacks are equal
	}

	/********************************
	 * Implements iterable interface
	 ********************************/
	public Iterator<T> iterator() {
		return stackLinkedList.iterator(); // create an iterator for the stack
	}

	/*****************************
	 * Stack Linked List toString
	 *****************************/
	public String toString() {
		return stackLinkedList.toString(); // stack list to string representation
	}

	/******************
	 * Empty the stack
	 ******************/
	@Override
	public void empty() {
		stackLinkedList = new DoublyLinkedList<T>(); // empty the current list by making a new list
	}
}
