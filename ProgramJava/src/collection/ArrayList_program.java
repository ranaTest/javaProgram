package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al=new ArrayList();
		
		al.add("Rana");
		al.add(1);
		al.add(10.2);
		al.add('c');
		
		Iterator at=al.iterator();
		
		while (at.hasNext()) {
			
			if(at.next().equals("Rana"))
			
			System.out.println(at.next());
		}
		

	}

}
