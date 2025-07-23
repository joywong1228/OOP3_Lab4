package exercise2;

public class MyNode<E> {
	private E data;
	MyNode<E> prev;
	MyNode<E> next;

	public MyNode(E data) {
		this.data = data;
		this.prev = null;
		this.next = null;
	}

	public MyNode<E> getNext() {
		return next;
	}

	public MyNode<E> getPrev() {
		return prev;
	}

	public E getElement() {
		return data;
	}
}