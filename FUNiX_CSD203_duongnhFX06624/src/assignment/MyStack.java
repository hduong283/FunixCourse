package assignment;

import java.util.EmptyStackException;

public class MyStack<E> {
	Node<E> head;

	public MyStack() {// khoi tao mot stack
		head = null;
	}

	public boolean isEmpty() {
		return (head == null);
	}
	public void push(E x)
    { 
		head = new Node<E>(x,head);
    }
	public E  pop() {
		if(isEmpty()) throw new EmptyStackException();
		E x = head.info;
		head = head.next;
		return x;
	}
	public E top() {
		if(isEmpty()) throw new EmptyStackException();
		return head.info;
	}
	
	
}
