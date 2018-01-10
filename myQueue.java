public interface myQueue<T> {
	/**************************************************************
	 * Enqueue/push (T): Add an element to the end of the sequence
	 * 
	 * @param element
	 *            the element to be added to the Queue
	 **************************************************************/
	void enqueue(T element);

	/***********************************************************************
	 * Dequeue/pop: Remove an element from the start of the sequence
	 * 
	 * @return removes and returns the element at the start of the sequence
	 ***********************************************************************/
	public T dequeue();

	/***************************************************************************
	 * Front/Peek: Return the first element of the sequence without removing it
	 * 
	 * @return returns the first element in the sequence
	 ***************************************************************************/
	public T front();

	/***************************************************
	 * Back: Return what the tail is pointing to
	 * 
	 * @return returns the last element in the sequence
	 ***************************************************/
	public T back();

	/**********************************************************
	 * atIndex(x): Return the element at the given index (x)
	 * 
	 * @param x
	 *            the index of the element within the sequence
	 * @return returns the element at the given index
	 **********************************************************/
	public T atIndex(int x);

	/*************************************
	 * Size: Return the size of the Queue
	 * 
	 * @return size of the queue
	 *************************************/
	public int size();

	/*******************************************************
	 * isEmpty: Boolean, returns true if the Queue is empty
	 * 
	 * @return false if empty, true if populated
	 *******************************************************/
	public boolean isEmpty();

	/*************************
	 * Empty: Empty the Queue
	 *************************/
	public void empty();

}
