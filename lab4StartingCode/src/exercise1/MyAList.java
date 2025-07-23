package exercise1;

import java.util.ArrayList;
import java.util.Iterator;

public class MyAList<E> implements Iterable<E>
{
	private ArrayList<E> list;

	public MyAList()
	{
		list = new ArrayList<E>();
	}

	void add(E item)
	{
		list.add(item);
	}

	void addAll(MyAList<E> other)
	{
		for (E item : other) {
			this.add(item);
		}
	}

	E get(int index)
	{
		return list.get(index);
	}

	void remove(int index)
	{
		list.remove(index);
	}

	void set(int index, E item)
	{
		list.set(index, item);
	}

	int size()
	{
		return list.size();
	}

	boolean isEmpty()
	{
		return list.isEmpty();
	}

	Object[] toArray()
	{
		return list.toArray();
	}

	void clear()
	{
		list.clear();
	}

	@Override
	public Iterator<E> iterator()
	{
		return list.iterator();
	}

}
