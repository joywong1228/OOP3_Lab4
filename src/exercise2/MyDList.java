package exercise2;

public class MyDList<E> {

	private MyNode<E> head;
	private MyNode<E> tail;
	private int size;

	// Constructor
	public MyDList() {
		head = null;
		tail = null;
		size = 0;
	}

	public MyNode<E> getHead() {
		return head;
	}

	public void addFirst(E item) {
		MyNode<E> newNode = new MyNode<>(item);
		if (isEmpty()) {
			head = tail = newNode;
		} else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
		size++;
	}

	public void addLast(E item) {
		MyNode<E> newNode = new MyNode<>(item);
		if (isEmpty()) {
			head = tail = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		size++;
	}

	public E removeFirst() {
		if (isEmpty())
			throw new RuntimeException("List is empty");
		E val = head.getElement();
		head = head.next;
		if (head != null) {
			head.prev = null;
		} else {
			tail = null; // List is now empty
		}
		size--;
		return val;
	}

	public E removeLast() {
		if (isEmpty())
			throw new RuntimeException("List is empty");
		E val = tail.getElement();
		tail = tail.prev;
		if (tail != null) {
			tail.next = null;
		} else {
			head = null; // List is now empty
		}
		size--;
		return val;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}
}