import java.util.Iterator;

class DoublyLinkedList<T extends Comparable<T>> implements Iterable<T> {
	/*************
	 * Fields
	 *************/
	private DNode<T> head; // head node
	private DNode<T> tail; // tail node
	private int size; // size of list

	/*******************************
	 * Initialize empty linked list
	 *******************************/
	public DoublyLinkedList() {
		this.tail = new DNode<T>(null, null, null); // tail node: data = null, next = null, prev = null
		this.head = new DNode<T>(null, this.tail, null); // head node: data = null, next = tail, prev = null
		this.tail.changePrev(this.head); // change tail node's previous reference

		this.size = 0; // empty list so size is 0
	}

	/********************************************
	 * Initialize linked list from a single node
	 ********************************************/
	public DoublyLinkedList(DNode<T> someNode) {
		this.tail = new DNode<T>(null, null, someNode); // tail node: data = null, next = null, prev = some node
		this.head = new DNode<T>(null, someNode, null); // head node: data = null, next = some node, prev = null
		someNode.changeNext(this.tail); // change some node's previous reference
		someNode.changePrev(this.head); // change some node's next reference

		this.size = 1; // size is 1, since you only added 1 node
	}

	/***************************************
	 * Initialize linked list from an array
	 ***************************************/
	public DoublyLinkedList(T[] objectArray) {
		this.tail = new DNode<T>(null, null, null); // tail node: data = null, next = null, prev = null
		this.head = new DNode<T>(null, this.tail, null); // head node: data = null, next = tail, prev = null
		this.tail.changePrev(this.head); // change tail node's previous reference
		DNode<T> temp = this.head; // temp node or starting position

		for (T e : objectArray) { // for every object in the array create a new node with the varying references
			// Anonymous function
			new DNode<T>(e, temp.getNext(), temp).insertBetweenNodes(temp, temp.getNext()); // insert a node with varying references
			temp = temp.getNext(); // get the node's reference previously created on the other line
			this.size += 1; // increase the size every time you loop through
		}
	}

	/***********************************
	 * Gets the size of the linked list
	 ***********************************/
	public int getSize() {
		return this.size; // get the size of the list
	}

	/******************************************
	 * Get first element in the list (not head)
	 ******************************************/
	public T getFirstElement() {
		return this.head.getNext().getValue(); // get the node's value right after head
	}

	/*****************************************
	 * Get last element in the list (not tail)
	 *****************************************/
	public T getLastElement() {
		return this.tail.getPrev().getValue(); // get the previous node's value from tail
	}

	/*************************
	 * Get a node at index "x"
	 *************************/
	public T getAtIndex(int x) {
		Iterator<T> myIterator = this.iterator(); // list iterator

		for (int i = 0; i < this.size; i += 1) {
			T myValue = myIterator.next();

			if (i == x) { // if the current index matches return value at that index
				return myValue;
			}
		}

		return null; // no value found
	}

	/****************************************
	 * Checks to see if linked list is empty
	 ****************************************/
	public boolean isEmpty() {
		return this.size == 0; // checks to see if the list is empty
	}

	/************************************************
	 * Insert a node to the front of the linked list
	 ************************************************/
	public void addToFrontOfList(T element) {
		this.head.insertAfterNode(new DNode<T>(element, this.head.getNext(), this.head)); // add a new node to the front of the list: data = element, next = head's next, prev = head
		this.size += 1; // increase the size by 1
	}

	/*************************************
	 * Insert a node after a certain node
	 *************************************/
	public void insertAfterNode(DNode<T> current, T input) {
		current.insertAfterNode(input); // insert a new node: data = input, next = current's next, prev = current
		this.size += 1;// increase size by 1
	}

	/**********************************************
	 * Insert a node to the end of the linked list
	 **********************************************/
	public void addToEndOfList(T element) {
		this.tail.insertbeforeNode(new DNode<T>(element, this.tail, this.tail.getPrev())); // add a new node to the end of the list: data = element, next = tail, prev = tail's prev
		this.size += 1; // increase size by 1
	}

	/**************************************************
	 * Delete a node from the front of the linked list
	 **************************************************/
	public void deleteFromFrontOfList() {
		this.head.getNext().removeSelf(); // remove the next node following the head
		this.size -= 1; // decrease size by 1
	}

	/*************************************************
	 * Delete a node from the end of the linked list
	 *************************************************/
	public void deleteFromEndOfList() {
		this.tail.getPrev().removeSelf(); // remove the previous node before the tail
		this.size -= 1; // decrease size by 1
	}

	/*******************************
	 * Delete a node at a index "x"
	 *******************************/
	public void deleteAtIndex(int x) {
		DNode<T> currentIndex = this.head.getNext(); // starting position

		for (int i = 0; i < this.size; i += 1) {
			if (i == x) { // if the current index matches remove node at that index
				currentIndex.removeSelf(); // node matches, remove that node
				this.size -= 1; // decrease size by 1
			}

			currentIndex = currentIndex.getNext(); // get the next node in the reference
		}
	}

	/************************************************
	 * Checks to see if the queue's values are equal
	 ************************************************/
	public boolean isEqual(DoublyLinkedList<T> otherList) {
		Iterator<T> thisIterator = this.iterator(); // create an iterator for this immutable list
		Iterator<T> otherIterator = otherList.iterator(); // create an iterator for the other immutable list

		if (this.getSize() != otherList.getSize()) // if the sizes aren't equal, the lists aren't equal
			return false;

		for (int i = 0; i < this.getSize(); i += 1) { // loop for the size of the list
			T t1 = thisIterator.next(); // assign the current node's value and set the current position of the node to the next
			T t2 = otherIterator.next(); // assign the current node's value and set the current position of the node to the next

			if (t1.compareTo(t2) != 0) // find the first mismatch, if there is, they're not equal
				return false;
		}

		return true; // everything was equal if it gets to here
	}

	/************************************
	 * Implements the Iterable interface
	 ************************************/
	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>() {
			DNode<T> currentIndex = head.getNext(); // starting position is the first element following the head

			@Override
			public boolean hasNext() {
				return currentIndex.hasNext(); // check to see if it has a next reference using the node's hasNext method
			}

			@Override
			public T next() {
				T data = currentIndex.getValue(); // get current node's value

				if (hasNext()) { // if it has a next reference
					currentIndex = currentIndex.getNext(); // change current node to the next node

					return data; // return the current node's value
				}

				return data; // there's no next reference so, the current node's value
			}
		};
	}

	/************************
	 * Node's Value toString
	 ************************/
	@Override
	public String toString() {
		String result = ""; // empty string
		Iterator<T> myIterator = this.iterator(); // create an iterator for this list

		for (int i = 0; i < this.getSize(); i += 1) { // loop through the whole list
			T myValue = myIterator.next(); // get the next node if there is one

			result += myValue; // add the value to the string
			result += " -> ";
		}

		result += "End of list"; // end of the list

		return result; // return the string
	}
}
