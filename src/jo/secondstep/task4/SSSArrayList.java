package jo.secondstep.task4;

import java.util.NoSuchElementException;

public class SSSArrayList implements SSSList {
	private int array[];
	private int size = 0;
	private static int capacity = 10;

	SSSArrayList() {
		array = new int[capacity];
	}

	@Override
	public void add(int element) {
		// TODO Auto-generated method stub
		if (size == array.length) {
			int[] copy = new int[2 * size];
			for (int i = 0; i < array.length; i++) {
				copy[i] = array[i];
				array = copy;
			}
		}
		array[size] = element;
		size++;

	}

	@Override
	public void add(int index, int element) {
		// TODO Auto-generated method stub
		if (index < 0 || index > capacity)
			throw new IndexOutOfBoundsException();
		else

		{
			int tempArr[] = new int[capacity * 2];

			for (int i = 0; i < index; i++)
				tempArr[i] = array[i];

			tempArr[index] = element;

			for (int i = index + 1; i < size + 1; i++)
				tempArr[i] = array[i - 1];

			array = tempArr;

			size++;
		}

	}

	@Override
	public void addFirst(int element) {
		// TODO Auto-generated method stub
		add(0, element);
	}

	@Override
	public void addLast(int element) {
		// TODO Auto-generated method stub
		add(element);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean contains(int element) {
		// TODO Auto-generated method stub
		for (int i = 0; i < size; i++)
			if (array[i] == element)
				return true;
		return false;
	}

	@Override
	public int get(int index) {
		// TODO Auto-generated method stub
		if (index < 0 || index > array.length)
			throw new IndexOutOfBoundsException();
		return array[index];
	}

	@Override
	public void remove(int index) {
		// TODO Auto-generated method stub
		if (index < 0 || index > array.length)
			throw new IndexOutOfBoundsException();

		int[] tempArr = new int[array.length - 1];
		for (int i = 0, k = 0; i < size; i++) {

			if (i == index) {
				continue;
			}
			tempArr[k++] = array[i];
			
		}
		array = tempArr;
		size--;
	}

	@Override
	public void removeFirst() {
		// TODO Auto-generated method stub
		remove(0);
	}

	@Override
	public void removeLast() {
		// TODO Auto-generated method stub
		remove(array.length - 1);
	}

	@Override
	public void addAll(SSSList list) {
		// TODO Auto-generated method stub
		for (int i = 0; i < list.size(); i++)
			add(list.get(i));

	}

	@Override
	public void addAll(int index, SSSList list) {
		// TODO Auto-generated method stub

		for (int i = 0; i < list.size(); i++)
			add(index++, list.get(i));

	}

	@Override
	public int indexOf(int element) {
		// TODO Auto-generated method stub

		for (int i = 0; i < size; i++) {
			if (array[i] == element) {

				return i;
			}
		}
		if (true)
			throw new NoSuchElementException();

		return 0;

	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		array = null;
		array = new int[capacity];
		size = 0;
	}

	@Override
	public void set(int index, int element) {
		// TODO Auto-generated method stub
		if (index < 0 || index > array.length)
			throw new IndexOutOfBoundsException();

		array[index] = element;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print("ArrayList: ");
		for (int i = 0; i < size; i++)
			System.out.print(array[i] + " ");
		System.out.print("\n");

	}

}
