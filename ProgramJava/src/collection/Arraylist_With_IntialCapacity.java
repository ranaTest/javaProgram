package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist_With_IntialCapacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList at=new ArrayList(11);
		
		at.add("Rana");
		at.add(1);
		at.add(2);
		at.add(3);
		at.add(4);
		at.add(5);
		at.add(6);
		at.add(7);
		at.add(8);
		at.add(9);
		at.add(10);
		at.add(11);
		at.add("randhir");
		at.add(null);
		System.out.println(at.remove(at));
		System.out.println(at.get(0));
		System.out.println(at.set(2, "Mohan"));
		
		
		
		
		
		int size= at.size();
		System.out.println(size);
		
		Iterator it=at.iterator();
		
		while(it.hasNext()){
		
			
			System.out.println(it.next());
			
		}		

	}

}
