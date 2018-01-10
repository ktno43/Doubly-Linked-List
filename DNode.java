class DNode<T extends Comparable<T>> {
	/*************
	 * Fields
	 *************/
	private T data; // data for type T
	private DNode<T> nextNode; // reference to Next Node
	private DNode<T> prevNode; // reference to Previous Node

	/******************************************
	 * Constructor: Implementing a single node
	 ******************************************/
	public DNode(T inputData) {
		this(inputData, null, null); // data = input, next = null, prev = null
	}

	/*********************************************************************************
	 * Constructor: Constructor for implementing a node that comes after another node
	 *********************************************************************************/
	public DNode(T inputData, DNode<T> next, DNode<T> prev) {
		this.data = inputData; // data = input
		this.nextNode = next; // next = some node
		this.prevNode = prev; // prev = some node
	}

	/*******************
	 * Get node's value
	 *******************/
	public T getValue() {
		return this.data; // return data
	}

	/****************************
	 * Get next node in sequence
	 ***************************/
	public DNode<T> getNext() {
		return this.nextNode; // return next node
	}

	/********************************
	 * Get previous node in sequence
	 ********************************/
	public DNode<T> getPrev() {
		return this.prevNode; // return previous node
	}

	/**********************************
	 * Change the link to the next node
	 **********************************/
	public void changeNext(DNode<T> next) {
		this.nextNode = next; // change the next node
	}

	/***************************************
	 * Change the link to the previous node
	 ***************************************/
	public void changePrev(DNode<T> prev) {
		this.prevNode = prev; // change the previous node
	}

	/*************************************
	 * Checks the status of the next node
	 *************************************/
	public Boolean hasNext() {
		return (this.nextNode != null); // check to see if the current node has a next node
	}

	/*****************************************
	 * Checks the status of the previous node
	 *****************************************/
	public Boolean hasprev() {
		return (this.prevNode != null); // check to see if the current node has a previous node
	}

	/********************
	 * Insert after node
	 ********************/
	public void insertAfterNode(DNode<T> input) {
		input.changeNext(this.getNext()); // change input node's next reference
		input.changePrev(this); // change input node's previous reference
		this.getNext().changePrev(input); // change current node's previous reference
		this.changeNext(input);// change current node's next reference
	}

	/******************************
	 * Insert after a certain node
	 ******************************/
	public void insertAfterNode(T input) {
		this.changeNext(new DNode<T>(input, this.getNext(), this)); // add some node with input t after a certain node
	}

	/*********************
	 * Insert before node
	 *********************/
	public void insertbeforeNode(DNode<T> input) {
		input.changePrev(this.getPrev()); // change input node's previous reference
		input.changeNext(this); // change input node's next reference
		this.getPrev().changeNext(input); // change current node's next reference
		this.changePrev(input); // change current node's previous reference
	}

	/***********************
	 * Insert between nodes
	 ***********************/
	public void insertBetweenNodes(DNode<T> before, DNode<T> after) {
		this.changeNext(after); // change current node's next reference
		this.changePrev(before); // change current node's previous reference
		before.changeNext(this); // change previous node next reference
		after.changePrev(this); // change next node's previous reference
	}

	/**************
	 * Remove node
	 **************/
	public void removeSelf() {
		this.getNext().changePrev(this.getPrev()); // change current node's previous reference
		this.getPrev().changeNext(this.getNext()); // change previous node's next reference
	}
}
