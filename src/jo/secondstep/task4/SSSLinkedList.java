package jo.secondstep.task4;

import java.util.NoSuchElementException;

public class SSSLinkedList implements SSSList {
	private Node head;
	private Node last;
	private int size = 0;

	SSSLinkedList() {
		head = null;
		last = null;
		size = 0;
	}

	class Node {
		int data;
		Node next;
		Node prev;

		Node() {
		}

		Node(int d) {

			data = d;
		}
	}

	@Override
	public void add(int element) {
		// TODO Auto-generated method stub
		Node new_node = new Node(element);
		new_node.next = null;

		if (head == null) {
			head = last = new_node;
		} else {

			last.next = new_node;
			last = new_node;
		}

		size++;
	}

	@Override
	public void add(int index, int element) {
		// TODO Auto-generated method stub
		if (index > size)
			throw new IndexOutOfBoundsException();
		Node node = new Node(element);
		if (size == 0) {
			head = last = node;
		} else {
			if (index == 0) {
				node.next = head;
				head.prev = node;
				head = node;
			} else if (index == size) {
				node.prev = last;
				last.next = node;
				last = node;
			}

			else {
				Node current = this.head;

				while (--index > 0) {
					current = current.next;
				}
				node.next = current.next;
				current.next = node;
			}
		}
		size++;

	}

	@Override
	public void addFirst(int element) {
		// TODO Auto-generated method stub
		add(0, element);
	}

	@Override
	public void addLast(int element) {
		// TODO Auto-generated method stub
		add(size, element);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean contains(int element) {
		// TODO Auto-generated method stub
		Node currNode = head;
		while (currNode != null) {
			if (currNode.data == element)
				return true;

			currNode = currNode.next;
		}
		return false;
	}

	@Override
	public int get(int index) {
		// TODO Auto-generated method stub
		if (index < 0 || index > size)
			throw new IndexOutOfBoundsException();
		Node currNode = head;
		int count = 0;

		while (currNode != null) {
			if (count == index)
				return currNode.data;
			count++;
			currNode = currNode.next;
		}
		return 0;
	}

	@Override
	public void remove(int index) {
		// TODO Auto-generated method stub
		size--;
		if (index < 0 || index > size)
			throw new IndexOutOfBoundsException();
		if (head == null)
			return;
		Node temp = head ,  temp_prev = null; 
		if (index == 0) {
			head = temp.next;
			return;
			
		}
		
		int count =1;
		while (temp != null && count != index) 
	        { 
	            temp_prev = temp; 
	            temp = temp.next; 
	            count++;
	        }     
		if (temp == null || temp.next == null)
			return;

	
		
		temp_prev.next=temp.next;
		temp_prev.next=null;
		
		
	}

	@Override
	public void removeFirst() {
		// TODO Auto-generated method stub
		remove(0);
	}

	@Override
	public void removeLast() {
		// TODO Auto-generated method stub
		remove(size - 1);
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
		if (index < 0 || index > size)
			throw new IndexOutOfBoundsException();
		for (int i = 0; i < list.size(); i++)
			add(index++, list.get(i));

	}

	@Override
	public int indexOf(int element) {
		// TODO Auto-generated method stub
		Node currNode = head;
		int count = 0;

		while (currNode != null) {

			if (currNode.data == element)
				return count;
			count++;

			currNode = currNode.next;
		}
		if (true)
			throw new NoSuchElementException();
		return count;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		head = null;
		last = null;
		size = 0;
	}

	@Override
	public void set(int index, int element) {
		// TODO Auto-generated method stub
		if (index < 0 || index > size)
			throw new IndexOutOfBoundsException();
		add(index, element);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		Node currNode = head;

		System.out.print("LinkedList: ");

		while (currNode != null) {
			System.out.print(currNode.data + " ");

			currNode = currNode.next;
		}
	}

}
