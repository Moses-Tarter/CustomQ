package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueCustomImp<E> {
	
	private Deque<E> insertHere;
	private Deque<E> removeFromHere;
	
	public QueueCustomImp() {
		insertHere = new ArrayDeque<E>();
		removeFromHere = new ArrayDeque<E>();
	}
	
	public void add(E e) {
		insertHere.addFirst(e);
	}
	
	public E pop() {
		if(removeFromHere.isEmpty())
			switchStacks();
		if(!removeFromHere.isEmpty())
			return removeFromHere.removeFirst();
		else
			return null;
	}
	
	public E peek() {
		if(removeFromHere.isEmpty())
			switchStacks();
		if(!removeFromHere.isEmpty())
			return removeFromHere.peekFirst();
		else 
			return null;
		
	}
	
	private void switchStacks() {
		insertHere.forEach(n -> removeFromHere.addFirst(insertHere.removeFirst()));
	}
}
