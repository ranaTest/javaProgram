package collection;

import java.util.Collection;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linked_List_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList lt= new LinkedList();
		lt.add('a');
		lt.add(3);
		lt.add("Rana");
		lt.add(10.5);
	
		
		
		LinkedList ll= new LinkedList(lt);
	System.out.println(ll);
		ll.add(2, 55);
		System.out.println(ll);
		
		ListIterator it=ll.listIterator();
		
		
		while(it.hasNext()){
			
			System.out.println(it.next());
		}
		while(it.hasPrevious()){
			System.out.print(it.previous());
		}
		

	}

}
