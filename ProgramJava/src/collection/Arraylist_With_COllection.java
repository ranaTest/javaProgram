package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Arraylist_With_COllection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList c=new ArrayList();
		c.add('r');
		c.add('a');
		c.add('b');
		c.add("Rana");
		c.add(10);
		c.add(10.5);
		
		ArrayList al=new ArrayList(c);
		
		Iterator it= al.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}

	}

}
