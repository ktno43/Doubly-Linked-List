public class main {

	public static void main(String[] args) {
		// testDoublyLinkedList();
		testImmutableSinglyLinkedList();
	}

	public static void testImmutableSinglyLinkedList() {
		/*****************************
		 * TEST IMMUTABILITY
		 *****************************/
		System.out.println("Testing immutability. . .");
		ImmutableStack<Integer> a = new ImmutableStack<Integer>(new Integer[] { 1, 2, 3, 4, 5 });
		ImmutableStack<Integer> b;

		System.out.println("At index -1:  " + a.atIndex(-1));
		System.out.println("At index 30:  " + a.atIndex(30));
		b = a.removeAtIndex(-1);
		System.out.println("Remove at index -1:  " +b);
		b = a.removeAtIndex(30);
		System.out.println("Remove at index 30:  " + b);
		

		System.out.println();
		a.push(6);
		b = a.push(6);
		System.out.println("Pushed 6 onto the stack?");
		System.out.println("A is:  " + a.toString());
		System.out.println("B is:  " + b.toString());

		System.out.println();
		a.pop();
		b = a.pop();
		System.out.println("Popped something off the stack?");
		System.out.println("A is:  " + a.toString());
		System.out.println("B is:  " + b.toString());

		System.out.println();
		a.removeAtIndex(1);
		b = a.removeAtIndex(1);
		System.out.println("Removed at index 1 from the stack?");
		System.out.println("A is:  " + a.toString());
		System.out.println("B is:  " + b.toString());

		System.out.println();
		a.empty();
		b = a.empty();
		System.out.println("Emptied the stack?");
		System.out.println("A is:  " + a.toString());
		System.out.println("B is:  " + b.toString());
		System.out.println();
		System.out.println();

		/***************************************
		 * CREATE 2 STACK OBJECTS
		 ***************************************/
		System.out.println("Pushing elements onto the stack s1 & s2. . .");
		ImmutableStack<String> s = new ImmutableStack<String>(
				new String[] { "A1", "B2", "C3", "D4", "E5", "F6", "G7" });
		ImmutableStack<String> s2 = new ImmutableStack<String>(
				new String[] { "A1", "B2", "C3", "D4", "E5", "F6", "G7" });

		/*****************************
		 * ARE STACKS EMPTY?
		 *****************************/
		System.out.println("Is s empty?  " + s.isEmpty());
		System.out.println("Size of s:  " + s.size());

		System.out.println();

		System.out.println("Is q2 empty?  " + s2.isEmpty());
		System.out.println("Size of q2:  " + s2.size());

		System.out.println();

		/***************************************
		 * PUSHING ELEMENTS ONTO STACK OBJ. 1
		 ***************************************/
		System.out.println("Pushing elements onto s . . .");
		s = s.push("Apple");
		s = s.push("Banana");
		s = s.push("Carrot");
		s = s.push("Dumpling");
		s = s.push("Eggs");
		s = s.push("French Fry");
		s = s.push("Gamer");
		s = s.push("Heap");

		/***************************************
		 * TEST REMOVE AT INDEX
		 ***************************************/
		System.out.println();
		System.out.println("Linked list of s is:");
		System.out.println(s.toString());
		System.out.println("Removing element in s at position 5");
		s = s.removeAtIndex(5);

		/***************************************
		 * TEST REMOVE AT INDEX 0
		 ***************************************/
		System.out.println();
		System.out.println("Linked list of s is:");
		System.out.println(s.toString());
		System.out.println("Removing element in s at position 0");
		s = s.removeAtIndex(0);

		/***************************************
		 * DISPLAY STACK OBJ. 1
		 ***************************************/
		System.out.println();
		System.out.println("Linked list of s is:");
		System.out.println(s.toString());

		/***************************************
		 * POP ELEMENT IN STACK OBJ. 1
		 ***************************************/
		System.out.println();
		System.out.println("Just pop'd: " + s.peek() + " from s");
		s = s.pop();

		/***************************************
		 * TEST STACK OBJ. 1 FUNCTIONALITY
		 ***************************************/
		System.out.println();
		System.out.println("Linked list of s is:  " + s.toString());
		System.out.println("Size of s: " + s.size());
		System.out.println("What's the first element?  " + s.peek());
		System.out.println("What's at element 3?  " + s.atIndex(3));
		System.out.println("What's at element 9?  " + s.atIndex(9));

		/***************************************
		 * PUSHING ELEMENTS ONTO STACK OBJ. 2
		 ***************************************/
		System.out.println();
		System.out.println("Pushing elements onto s2 . . .");
		s2 = s2.push("Apple");
		s2 = s2.push("Banana");
		s2 = s2.push(new String("Carrot"));
		s2 = s2.push("Dumpling");
		s2 = s2.push("Eggs");
		s2 = s2.push("French Fry");
		s2 = s2.push("Gamer");
		s2 = s2.push("Heap");

		/***************************************
		 * TEST REMOVE AT INDEX
		 ***************************************/
		System.out.println();
		System.out.println("Linked list of s2 is:");
		System.out.println(s2.toString());
		System.out.println("Removing element in s2 at position 5");
		s2 = s2.removeAtIndex(5);

		/***************************************
		 * TEST REMOVE AT INDEX 0
		 ***************************************/
		System.out.println();
		System.out.println("Linked list of s2 is:");
		System.out.println(s2.toString());
		System.out.println("Removing element in s2 at position 0");
		s2 = s2.removeAtIndex(0);

		/***************************************
		 * DISPLAY STACK OBJECTS
		 ***************************************/
		System.out.println();
		System.out.println("Linked list of s2 is:");
		System.out.println(s2.toString());

		System.out.println();
		System.out.println("Linked list of s is:");
		System.out.println(s.toString());

		/***************************************
		 * IS S EQUAL TO S2 (SHOULD BE FALSE)
		 ***************************************/
		System.out.println();
		System.out.println("Is s == s2?  " + s.isEqual(s2));

		System.out.println();
		System.out.println();

		/***************************************
		 * TEST STACK OBJ. 2 FUNCTIONALITY
		 ***************************************/
		System.out.println("Linked list of s2 is:");
		System.out.println(s2.toString());
		System.out.println("Size of s2:  " + s2.size());
		System.out.println("What's the first element?  " + s2.peek());
		System.out.println("What's at element 6?  " + s2.atIndex(6));
		System.out.println("What's at element -2?  " + s2.atIndex(-2));

		/***************************************
		 * POP ELEMENT FROM STACK OBJ. 2
		 ***************************************/
		System.out.println();
		System.out.println("Just pop'd:  " + s2.peek() + " from s2");
		s2 = s2.pop();

		/***************************************
		 * DISPLAY STACK OBJECTS
		 ***************************************/
		System.out.println();
		System.out.println("Linked list of s2 is:");
		System.out.println(s2.toString());

		System.out.println();
		System.out.println("Linked list of s is:");
		System.out.println(s.toString());

		/***************************************
		 * IS S2 EQUAL TO S (SHOULD BE TRUE)
		 ***************************************/
		System.out.println();
		System.out.println("Is s2 == s? " + s2.isEqual(s));
		System.out.println();

		/***************************************
		 * EMPTY STACK OBJ. 1
		 ***************************************/
		s = s.empty();
		System.out.println("Just empty'd s!");

		/***************************************
		 * TEST STACK OBJ. 1 EMPTY FUNCTIONALITY (EMPTIED)
		 ***************************************/
		System.out.println("Is s empty?  " + s.isEmpty());
		System.out.println("What's the size of s?  " + s.size());
		System.out.println("s at index 0:  " + s.atIndex(0));
		System.out.println("s at index 1:  " + s.atIndex(1));
		System.out.println("s at index 2:  " + s.atIndex(2));

		/***************************************
		 * TEST STACK OBJ.2 EMPTY FUNCTIONALITY (NOT EMPTY)
		 ***************************************/
		System.out.println();
		System.out.println("Is s2 empty?  " + s2.isEmpty());
		System.out.println("What's the size of s2?  " + s2.size());
		System.out.println("s2 at index 0:  " + s2.atIndex(0));
		System.out.println("s2 at index 1:  " + s2.atIndex(1));
		System.out.println("s2 at index 2:  " + s2.atIndex(2));
		System.out.println("s2 at index 3:  " + s2.atIndex(3));
		System.out.println("s2 at index 4:  " + s2.atIndex(4));
		System.out.println("s2 at index 5:  " + s2.atIndex(5));
		System.out.println("s2 at index 6:  " + s2.atIndex(6));
		System.out.println("s2 at index 7:  " + s2.atIndex(7));
		System.out.println("s2 at index 8:  " + s2.atIndex(8));
		System.out.println("s2 at index 9:  " + s2.atIndex(9));
		System.out.println("s2 at index 10:  " + s2.atIndex(10));
		System.out.println("s2 at index 11:  " + s2.atIndex(11));
		System.out.println("s2 at index 12:  " + s2.atIndex(12));
		System.out.println("s2 at index 13:  " + s2.atIndex(13));
		System.out.println("s2 at index 14:  " + s2.atIndex(14));
		System.out.println("s2 at index -2:  " + s2.atIndex(-2));

		System.out.println();

		/***************************************
		 * EMPTY STACK OBJ. 2
		 ***************************************/
		s2 = s2.empty();

		/***************************************
		 * TEST STACK OBJ. 2 EMPTY FUNCTIONALITY (EMPTY)
		 ***************************************/
		System.out.println("Just empty'd s2!");
		System.out.println("Is s2 empty?  " + s2.isEmpty());
		System.out.println("What's the size of s2?  " + s2.size());
		System.out.println("s2 at index 0:  " + s2.atIndex(0));
		System.out.println("s2 at index 1:  " + s2.atIndex(1));
		System.out.println("s2 at index 2:  " + s2.atIndex(2));
		System.out.println();
		System.out.println();

		/****************************************************************************************************
		 * NO MAN'S LAND
		 ****************************************************************************************************/

		/*****************************
		 * TEST IMMUTABILITY
		 *****************************/
		System.out.println("Testing immutability. . .");
		ImmutableQueue<Integer> c = new ImmutableQueue<Integer>(new Integer[] { 1, 2, 3, 4, 5 });
		ImmutableQueue<Integer> d;

		System.out.println();
		c.enqueue(6);
		d = c.enqueue(6);
		System.out.println("Enqueue'd 6 onto the queue?");
		System.out.println("C is:  " + c.toString());
		System.out.println("D is:  " + d.toString());

		System.out.println();
		c.dequeue();
		d = c.dequeue();
		System.out.println("Dequeue'd something off the queue?");
		System.out.println("C is:  " + c.toString());
		System.out.println("D is:  " + d.toString());

		System.out.println();
		c.removeAtIndex(1);
		d = c.removeAtIndex(1);
		System.out.println("Removed at index 1 from the queue?");
		System.out.println("C is:  " + c.toString());
		System.out.println("D is:  " + d.toString());

		System.out.println();
		c.empty();
		d = c.empty();
		System.out.println("Emptied the queue?");
		System.out.println("C is:  " + c.toString());
		System.out.println("D is:  " + d.toString());
		System.out.println();
		System.out.println();

		/*****************************
		 * CREATE 2 QUEUE OBJECTS
		 *****************************/
		ImmutableQueue<String> q = new ImmutableQueue<String>();
		ImmutableQueue<String> q2 = new ImmutableQueue<String>();

		/*****************************
		 * ARE QUEUES EMPTY?
		 *****************************/
		System.out.println("Is q empty?  " + q.isEmpty());
		System.out.println("Size of q:  " + q.size());

		System.out.println();

		System.out.println("Is q2 empty?  " + q2.isEmpty());
		System.out.println("Size of q2:  " + q2.size());

		System.out.println();

		/***************************************
		 * ENQUEUEING ELEMENTS INTO QUEUE OBJ. 1
		 ***************************************/
		System.out.println("Enqueue'ing elements into q . . .");
		q = q.enqueue("Apple");
		q = q.enqueue("Banana");
		q = q.enqueue("Carrot");
		q = q.enqueue("Dumpling");
		q = q.enqueue("Eggs");
		q = q.enqueue(new String("French Fry"));
		q = q.enqueue("Gamer");
		q = q.enqueue("Heap");

		/***************************************
		 * TEST REMOVE AT INDEX
		 ***************************************/
		System.out.println();
		System.out.println("Linked list of q is:");
		System.out.println(q.toString());
		System.out.println("Removing element in q at position 7");
		q = q.removeAtIndex(7);

		/***************************************
		 * TEST REMOVE AT INDEX 0
		 ***************************************/
		System.out.println();
		System.out.println("Linked list of q is:");
		System.out.println(q.toString());
		System.out.println("Removing element in q at position 0");
		q = q.removeAtIndex(0);

		/***************************************
		 * DISPLAY QUEUE OBJ. 1
		 ***************************************/
		System.out.println();
		System.out.println("Linked list of q is:");
		System.out.println(q.toString());

		/***************************************
		 * DEQUEUE ELEMENT IN QUEUE OBJ. 1
		 ***************************************/
		System.out.println();
		System.out.println("Just dequeue'd: " + q.front() + " from q");
		q = q.dequeue();

		/***************************************
		 * TEST QUEUE OBJ. 1 FUNCTIONALITY
		 ***************************************/
		System.out.println();
		System.out.println("Linked list of q is:  " + q.toString());
		System.out.println("Size of q: " + q.size());
		System.out.println("What's the first element?  " + q.front());
		System.out.println("What's the last element?  " + q.back());
		System.out.println("What's at element 3?  " + q.atIndex(3));
		System.out.println("What's at element 9?  " + q2.atIndex(9));

		/***************************************
		 * ENQUEUEING ELEMENTS INTO OBJ. 2
		 ***************************************/
		System.out.println();
		System.out.println("Enqueue'ing elements onto q2 . . .");

		q2 = q2.enqueue("Apple");
		q2 = q2.enqueue("Banana");
		q2 = q2.enqueue("Carrot");
		q2 = q2.enqueue("Dumpling");
		q2 = q2.enqueue("Eggs");
		q2 = q2.enqueue("French Fry");
		q2 = q2.enqueue("Gamer");
		q2 = q2.enqueue("Heap");

		/***************************************
		 * TEST REMOVE AT INDEX
		 ***************************************/
		System.out.println();
		System.out.println("Linked list of q2 is:");
		System.out.println(q2.toString());
		System.out.println("Removing element in q2 at position 7");
		q2 = q2.removeAtIndex(7);

		/***************************************
		 * TEST REMOVE AT INDEX 0
		 ***************************************/
		System.out.println();
		System.out.println("Linked list of q2 is:");
		System.out.println(q2.toString());
		System.out.println("Removing element in q2 at position 0");
		q2 = q2.removeAtIndex(0);

		/***************************************
		 * DISPLAY QUEUE OBJECTS
		 ***************************************/
		System.out.println();
		System.out.println("Linked list of q2 is:");
		System.out.println(q2.toString());

		System.out.println();
		System.out.println("Linked list of q is:");
		System.out.println(q.toString());

		/***************************************
		 * IS Q EQUAL TO Q2 (SHOULD BE FALSE)
		 ***************************************/
		System.out.println();
		System.out.println("Is q == q2?  " + q.isEqual(q2));

		System.out.println();
		System.out.println();

		/***************************************
		 * TEST QUEUE OBJ. 2 FUNCTIONALITY
		 ***************************************/
		System.out.println("Linked list of q2 is:");
		System.out.println(q2.toString());

		System.out.println("Size of q2:  " + q2.size());
		System.out.println("What's the first element?  " + q2.front());
		System.out.println("What's the last element?  " + q2.back());
		System.out.println("What's at element 2?  " + q2.atIndex(2));
		System.out.println("What's at element -2?  " + q2.atIndex(-2));

		/***************************************
		 * DEQUEUE ELEMENT IN OBJ. 2
		 ***************************************/
		System.out.println();
		System.out.println("Just dequeue'd:  " + q2.front() + " from q2");
		q2 = q2.dequeue();

		/***************************************
		 * DISPLAY BOTH QUEUE OBJECTS
		 ***************************************/
		System.out.println();
		System.out.println("Linked list of q2 is:");
		System.out.println(q2.toString());

		System.out.println();
		System.out.println("Linked list of q is:");
		System.out.println(q.toString());

		/***************************************
		 * IS Q2 EQUAL TO Q (SHOULD BE TRUE)
		 ***************************************/
		System.out.println();
		System.out.println("Is q2 == q? " + q2.isEqual(q));
		System.out.println();

		/***************************************
		 * EMPTY QUEUE OBJ. 1
		 ***************************************/
		q = q.empty();
		System.out.println("Just empty'd q!");

		/***************************************
		 * TEST QUEUE OBJ. 1 EMPTY FUNCTIONALITY (EMPTY)
		 ***************************************/
		System.out.println("Is q empty?  " + q.isEmpty());
		System.out.println("What's the size of q?  " + q.size());
		System.out.println("q at index 0:  " + q.atIndex(0));
		System.out.println("q at index 1:  " + q.atIndex(1));
		System.out.println("q at index 2:  " + q.atIndex(2));

		/***************************************
		 * TEST QUEUE OBJ. 2 EMPTY FUNCTIONALITY (NOT EMPTY)
		 ***************************************/
		System.out.println();
		System.out.println("Is q2 empty?  " + q2.isEmpty());
		System.out.println("What's the size of q2?  " + q2.size());
		System.out.println("q2 at index 0:  " + q2.atIndex(0));
		System.out.println("q2 at index 1:  " + q2.atIndex(1));
		System.out.println("q2 at index 2:  " + q2.atIndex(2));
		System.out.println("q2 at index 3:  " + q2.atIndex(3));
		System.out.println("q2 at index 4:  " + q2.atIndex(4));
		System.out.println("q2 at index 5:  " + q2.atIndex(5));
		System.out.println("q2 at index 6:  " + q2.atIndex(6));
		System.out.println("q2 at index 7:  " + q2.atIndex(7));
		System.out.println("q2 at index 8:  " + q2.atIndex(8));
		System.out.println("q2 at index 9:  " + q2.atIndex(9));
		System.out.println("q2 at index 10:  " + q2.atIndex(10));
		System.out.println("q2 at index -2:  " + q2.atIndex(-2));

		System.out.println();

		/***************************************
		 * EMPTY QUEUE OBJ. 2
		 ***************************************/
		q2 = q2.empty();

		/***************************************
		 * TEST QUEUE OBJ. 2 FUNCTIONALITY (EMPTY)
		 ***************************************/
		System.out.println("Just empty'd q2!");
		System.out.println("Is q2 empty?  " + q2.isEmpty());
		System.out.println("What's the size of q2?  " + q2.size());
		System.out.println("q2 at index 0:  " + q2.atIndex(0));
		System.out.println("q2 at index 1:  " + q2.atIndex(1));
		System.out.println("q2 at index 2:  " + q2.atIndex(2));
	}

	/**************************************
	 * Test DoublyLinkedList Stack & Queue
	 **************************************/
	public static void testDoublyLinkedList() {
		/***************************************
		 * CREATE 2 STACK OBJECTS
		 ***************************************/
		System.out.println("Pushing elements onto the stack s1 & s2. . .");
		Stack<String> s = new Stack<String>(new String[] { "A1", "B2", "C3", "D4", "E5", "F6", "G7" });
		Stack<String> s2 = new Stack<String>(new String[] { "A1", "B2", "C3", "D4", "E5", "F6", "G7" });

		/*****************************
		 * ARE STACKS EMPTY?
		 *****************************/
		System.out.println("Is s empty?  " + s.isEmpty());
		System.out.println("Size of s:  " + s.size());

		System.out.println();

		System.out.println("Is q2 empty?  " + s2.isEmpty());
		System.out.println("Size of q2:  " + s2.size());

		System.out.println();

		/***************************************
		 * PUSHING ELEMENTS ONTO STACK OBJ. 1
		 ***************************************/
		System.out.println("Pushing elements onto s . . .");
		s.push("Apple");
		s.push("Banana");
		s.push("Carrot");
		s.push("Dumpling");
		s.push("Eggs");
		s.push("French Fry");
		s.push("Gamer");
		s.push("Heap");

		/***************************************
		 * TEST REMOVE AT INDEX
		 ***************************************/
		System.out.println();
		System.out.println("Linked list of s is:");
		System.out.println(s.toString());
		System.out.println("Removing element in s at position 5");
		s.removeAtIndex(5);

		/***************************************
		 * TEST REMOVE AT INDEX 0
		 ***************************************/
		System.out.println();
		System.out.println("Linked list of s is:");
		System.out.println(s.toString());
		System.out.println("Removing element in s at position 0");
		s.removeAtIndex(0);

		/***************************************
		 * DISPLAY STACK OBJ. 1
		 ***************************************/
		System.out.println();
		System.out.println("Linked list of s is:");
		System.out.println(s.toString());

		/***************************************
		 * POP ELEMENT IN STACK OBJ. 1
		 ***************************************/
		System.out.println();
		System.out.println("Just pop'd: " + s.pop() + " from s");

		/***************************************
		 * TEST STACK OBJ. 1 FUNCTIONALITY
		 ***************************************/
		System.out.println();
		System.out.println("Linked list of s is:");
		System.out.println(s.toString());
		System.out.println("Size of s: " + s.size());
		System.out.println("What's the first element?  " + s.peek());
		System.out.println("What's at element 3?  " + s.atIndex(3));
		System.out.println("What's at element 9?  " + s.atIndex(9));

		/***************************************
		 * PUSHING ELEMENTS ONTO STACK OBJ. 2
		 ***************************************/
		System.out.println();
		System.out.println("Pushing elements onto s2 . . .");
		s2.push("Apple");
		s2.push("Banana");
		s2.push(new String("Carrot"));
		s2.push("Dumpling");
		s2.push("Eggs");
		s2.push("French Fry");
		s2.push("Gamer");
		s2.push("Heap");

		/***************************************
		 * TEST REMOVE AT INDEX X
		 ***************************************/
		System.out.println();
		System.out.println("Linked list of s2 is:");
		System.out.println(s2.toString());
		System.out.println("Removing element in s2 at position 5");
		s2.removeAtIndex(5);

		/***************************************
		 * TEST REMOVE AT INDEX 0
		 ***************************************/
		System.out.println();
		System.out.println("Linked list of s2 is:");
		System.out.println(s2.toString());
		System.out.println("Removing element in s2 at position 0");
		s2.removeAtIndex(0);

		/***************************************
		 * DISPLAY STACK OBJECTS
		 ***************************************/
		System.out.println();
		System.out.println("Linked list of s2 is:");
		System.out.println(s2.toString());

		System.out.println();
		System.out.println("Linked list of s is:");
		System.out.println(s.toString());

		/***************************************
		 * IS S EQUAL TO S2 (SHOULD BE FALSE)
		 ***************************************/
		System.out.println();
		System.out.println("Is s == s2?  " + s.isEqual(s2));

		System.out.println();
		System.out.println();

		/***************************************
		 * TEST STACK OBJ. 2 FUNCTIONALITY
		 ***************************************/
		System.out.println("Linked list of s2 is:");
		System.out.println(s2.toString());
		System.out.println("Size of s2:  " + s2.size());
		System.out.println("What's the first element?  " + s2.peek());
		System.out.println("What's at element 6?  " + s2.atIndex(6));
		System.out.println("What's at element -2?  " + s2.atIndex(-2));

		/***************************************
		 * POP ELEMENT FROM STACK OBJ. 2
		 ***************************************/
		System.out.println();
		System.out.println("Just pop'd:  " + s2.pop() + " from s2");

		/***************************************
		 * DISPLAY STACK OBJECTS
		 ***************************************/
		System.out.println();
		System.out.println("Linked list of s2 is:");
		System.out.println(s2.toString());

		System.out.println();
		System.out.println("Linked list of s is:");
		System.out.println(s.toString());

		/***************************************
		 * IS S2 EQUAL TO S (SHOULD BE TRUE)
		 ***************************************/
		System.out.println();
		System.out.println("Is s2 == s? " + s2.isEqual(s));
		System.out.println();

		/***************************************
		 * EMPTY STACK OBJ. 1
		 ***************************************/
		s.empty();
		System.out.println("Just empty'd s!");

		/***************************************
		 * TEST STACK OBJ. 1 EMPTY FUNCTIONALITY (EMPTIED)
		 ***************************************/
		System.out.println("Is s empty?  " + s.isEmpty());
		System.out.println("What's the size of s?  " + s.size());
		System.out.println("s at index 0:  " + s.atIndex(0));
		System.out.println("s at index 1:  " + s.atIndex(1));
		System.out.println("s at index 2:  " + s.atIndex(2));

		/***************************************
		 * TEST STACK OBJ.2 EMPTY FUNCTIONALITY (NOT EMPTY)
		 ***************************************/
		System.out.println();
		System.out.println("Is s2 empty?  " + s2.isEmpty());
		System.out.println("What's the size of s2?  " + s2.size());
		System.out.println("s2 at index 0:  " + s2.atIndex(0));
		System.out.println("s2 at index 1:  " + s2.atIndex(1));
		System.out.println("s2 at index 2:  " + s2.atIndex(2));
		System.out.println("s2 at index 3:  " + s2.atIndex(3));
		System.out.println("s2 at index 4:  " + s2.atIndex(4));
		System.out.println("s2 at index 5:  " + s2.atIndex(5));
		System.out.println("s2 at index 6:  " + s2.atIndex(6));
		System.out.println("s2 at index 7:  " + s2.atIndex(7));
		System.out.println("s2 at index 8:  " + s2.atIndex(8));
		System.out.println("s2 at index 9:  " + s2.atIndex(9));
		System.out.println("s2 at index 10:  " + s2.atIndex(10));
		System.out.println("s2 at index 11:  " + s2.atIndex(11));
		System.out.println("s2 at index 12:  " + s2.atIndex(12));
		System.out.println("s2 at index 13:  " + s2.atIndex(13));
		System.out.println("s2 at index 14:  " + s2.atIndex(14));
		System.out.println("s2 at index -2:  " + s2.atIndex(-2));

		System.out.println();

		/***************************************
		 * EMPTY STACK OBJ. 2
		 ***************************************/
		s2.empty();

		/***************************************
		 * TEST STACK OBJ. 2 EMPTY FUNCTIONALITY (EMPTY)
		 ***************************************/
		System.out.println("Just empty'd s2!");
		System.out.println("Is s2 empty?  " + s2.isEmpty());
		System.out.println("What's the size of s2?  " + s2.size());
		System.out.println("s2 at index 0:  " + s2.atIndex(0));
		System.out.println("s2 at index 1:  " + s2.atIndex(1));
		System.out.println("s2 at index 2:  " + s2.atIndex(2));
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		/****************************************************************************************************
		 * NO MAN'S LAND
		 ****************************************************************************************************/

		/*****************************
		 * CREATE 2 QUEUE OBJECTS
		 *****************************/
		Queue<String> q = new Queue<String>();
		Queue<String> q2 = new Queue<String>();

		/*****************************
		 * ARE QUEUES EMPTY?
		 *****************************/
		System.out.println("Is q empty?  " + q.isEmpty());
		System.out.println("Size of q:  " + q.size());

		System.out.println();

		System.out.println("Is q2 empty?  " + q2.isEmpty());
		System.out.println("Size of q2:  " + q2.size());

		System.out.println();

		/***************************************
		 * ENQUEUEING ELEMENTS INTO QUEUE OBJ. 1
		 ***************************************/
		System.out.println("Enqueue'ing elements into q . . .");
		q.enqueue("Apple");
		q.enqueue("Banana");
		q.enqueue("Carrot");
		q.enqueue("Dumpling");
		q.enqueue("Eggs");
		q.enqueue(new String("French Fry"));
		q.enqueue("Gamer");
		q.enqueue("Heap");

		/***************************************
		 * TEST REMOVE AT INDEX X
		 ***************************************/
		System.out.println();
		System.out.println("Linked list of q is:");
		System.out.println(q.toString());
		System.out.println("Removing element in q at position 7");
		q.removeAtIndex(7);

		/***************************************
		 * TEST REMOVE AT INDEX 0
		 ***************************************/
		System.out.println();
		System.out.println("Linked list of q is:");
		System.out.println(q.toString());
		System.out.println("Removing element in q at position 0");
		q.removeAtIndex(0);

		/***************************************
		 * DISPLAY QUEUE OBJ. 1
		 ***************************************/
		System.out.println();
		System.out.println("Linked list of q is:");
		System.out.println(q.toString());

		/***************************************
		 * DEQUEUE ELEMENT IN QUEUE OBJ. 1
		 ***************************************/
		System.out.println();
		System.out.println("Just dequeue'd: " + q.dequeue() + " from q");

		/***************************************
		 * TEST QUEUE OBJ. 1 FUNCTIONALITY
		 ***************************************/
		System.out.println();
		System.out.println("Linked list of q is:  ");
		System.out.println(q.toString());
		System.out.println("Size of q: " + q.size());
		System.out.println("What's the first element?  " + q.front());
		System.out.println("What's the last element?  " + q.back());
		System.out.println("What's at element 3?  " + q.atIndex(3));
		System.out.println("What's at element 9?  " + q2.atIndex(9));

		/***************************************
		 * ENQUEUEING ELEMENTS INTO OBJ. 2
		 ***************************************/
		System.out.println();
		System.out.println("Enqueue'ing elements onto q2 . . .");

		q2.enqueue("Apple");
		q2.enqueue("Banana");
		q2.enqueue("Carrot");
		q2.enqueue("Dumpling");
		q2.enqueue("Eggs");
		q2.enqueue("French Fry");
		q2.enqueue("Gamer");
		q2.enqueue("Heap");

		/***************************************
		 * TEST REMOVE AT INDEX X
		 ***************************************/
		System.out.println();
		System.out.println("Linked list of q2 is:");
		System.out.println(q2.toString());
		System.out.println("Removing element in q2 at position 7");
		q2.removeAtIndex(7);

		/***************************************
		 * TEST REMOVE AT INDEX 0
		 ***************************************/
		System.out.println();
		System.out.println("Linked list of q2 is:");
		System.out.println(q2.toString());
		System.out.println("Removing element in q2 at position 0");
		q2.removeAtIndex(0);

		/***************************************
		 * DISPLAY QUEUE OBJECTS
		 ***************************************/
		System.out.println();
		System.out.println("Linked list of q2 is:");
		System.out.println(q2.toString());

		System.out.println();
		System.out.println("Linked list of q is:");
		System.out.println(q.toString());

		/***************************************
		 * IS Q EQUAL TO Q2 (SHOULD BE FALSE)
		 ***************************************/
		System.out.println();
		System.out.println("Is q == q2?  " + q.isEqual(q2));

		System.out.println();
		System.out.println();

		/***************************************
		 * TEST QUEUE OBJ. 2 FUNCTIONALITY
		 ***************************************/
		System.out.println("Linked list of q2 is:");
		System.out.println(q2.toString());

		System.out.println("Size of q2:  " + q2.size());
		System.out.println("What's the first element?  " + q2.front());
		System.out.println("What's the last element?  " + q2.back());
		System.out.println("What's at element 4?  " + q2.atIndex(4));
		System.out.println("What's at element -2?  " + q2.atIndex(-2));

		/***************************************
		 * DEQUEUE ELEMENT IN OBJ. 2
		 ***************************************/
		System.out.println();
		System.out.println("Just dequeue'd:  " + q2.dequeue() + " from q2");

		/***************************************
		 * DISPLAY BOTH QUEUE OBJECTS
		 ***************************************/
		System.out.println();
		System.out.println("Linked list of q2 is:");
		System.out.println(q2.toString());

		System.out.println();
		System.out.println("Linked list of q is:");
		System.out.println(q.toString());

		/***************************************
		 * IS Q2 EQUAL TO Q (SHOULD BE TRUE)
		 ***************************************/
		System.out.println();
		System.out.println("Is q2 == q? " + q2.isEqual(q));
		System.out.println();

		/***************************************
		 * EMPTY QUEUE OBJ. 1
		 ***************************************/
		q.empty();
		System.out.println("Just empty'd q!");

		/***************************************
		 * TEST QUEUE OBJ. 1 EMPTY FUNCTIONALITY (EMPTY)
		 ***************************************/
		System.out.println("Is q empty?  " + q.isEmpty());
		System.out.println("What's the size of q?  " + q.size());
		System.out.println("q at index 0:  " + q.atIndex(0));
		System.out.println("q at index 1:  " + q.atIndex(1));
		System.out.println("q at index 2:  " + q.atIndex(2));

		/***************************************
		 * TEST QUEUE OBJ. 2 EMPTY FUNCTIONALITY (NOT EMPTY)
		 ***************************************/
		System.out.println();
		System.out.println("Is q2 empty?  " + q2.isEmpty());
		System.out.println("What's the size of q2?  " + q2.size());
		System.out.println("q2 at index 0:  " + q2.atIndex(0));
		System.out.println("q2 at index 1:  " + q2.atIndex(1));
		System.out.println("q2 at index 2:  " + q2.atIndex(2));
		System.out.println("q2 at index 3:  " + q2.atIndex(3));
		System.out.println("q2 at index 4:  " + q2.atIndex(4));
		System.out.println("q2 at index 5:  " + q2.atIndex(5));
		System.out.println("q2 at index 6:  " + q2.atIndex(6));
		System.out.println("q2 at index 7:  " + q2.atIndex(7));
		System.out.println("q2 at index 8:  " + q2.atIndex(8));
		System.out.println("q2 at index 9:  " + q2.atIndex(9));
		System.out.println("q2 at index 10:  " + q2.atIndex(10));
		System.out.println("q2 at index -2:  " + q2.atIndex(-2));

		System.out.println();

		/***************************************
		 * EMPTY QUEUE OBJ. 2
		 ***************************************/
		q2.empty();

		/***************************************
		 * TEST QUEUE OBJ. 2 FUNCTIONALITY (EMPTY)
		 ***************************************/
		System.out.println("Just empty'd q2!");
		System.out.println("Is q2 empty?  " + q2.isEmpty());
		System.out.println("What's the size of q2?  " + q2.size());
		System.out.println("q2 at index 0:  " + q2.atIndex(0));
		System.out.println("q2 at index 1:  " + q2.atIndex(1));
		System.out.println("q2 at index 2:  " + q2.atIndex(2));
	}
}
