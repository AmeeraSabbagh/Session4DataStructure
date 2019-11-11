package jo.secondstep.task4;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create Array List and Adding Data
		SSSArrayList list= new SSSArrayList();
		list.add(5);
		list.add(6);
		list.print();
		System.out.println("Adding element to index 1: ");
		list.add(1,7);
		list.print();
		System.out.println("removing element to index 1: ");
		list.remove(1);
		list.print();
		System.out.println("set index 0 with new value: ");
		list.set(0, 4);
		list.print();
		System.out.println("Clear Array List: ");
		list.clear();
		System.out.println("Add to First: ");
		list.addFirst(11);
		list.print();
		list.add(3);
		list.add(5);
		list.add(6);
		System.out.println("Add to ArrayList: ");
		list.print();
		System.out.println("ArrayList Size = "+list.size());
		
		//Create another Array List and Adding Data
		SSSArrayList list2= new SSSArrayList();
		list2.add(25);
		list2.add(26);
		list2.add(27);
		list.addAll(list2);
		System.out.println("Adding list of size: "+list2.size()+" to ArrayList: ");
		list.print();
		System.out.println("\n \n ********************************* \n *********************************");
		
		//Create Linked List and Adding Data
		SSSLinkedList linkedList= new SSSLinkedList();
		linkedList.add(55);
		linkedList.add(66);
		linkedList.add(77);
		linkedList.print();
		System.out.println("\nAdding element to index 1: ");
		linkedList.add(1,99);
		linkedList.print();
		System.out.println("\nRemoving element to index 0: ");
		linkedList.remove(0);
		linkedList.print();
		System.out.println("\nAdd to First: ");
		linkedList.addFirst(10);
		linkedList.print();
		System.out.println("\nLinkedList Size = "+linkedList.size());
		System.out.println("Check if linked list contain 10 : "+linkedList.contains(10));
		System.out.println("Value of index 1: "+linkedList.get(1));
		System.out.println("Index of element 10 : "+linkedList.indexOf(10));
		linkedList.clear();
		System.out.println("Clear LinkedList: ");
		linkedList.print();
		System.out.println("\nAdd new values new value: ");
		linkedList.add(100);
		linkedList.add(200);
		linkedList.add(300);
		linkedList.print();
		
		//Create another Linked List and Adding Data
		SSSLinkedList linkedList2= new SSSLinkedList();
		linkedList2.add(55);
		linkedList2.add(66);
		linkedList.addAll(linkedList2);
		System.out.println("\nAdding list of size: "+linkedList2.size()+" to LinkedList: ");
		linkedList.print();
		
		
		
	}

}
