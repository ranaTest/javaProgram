package collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet hst=new HashSet();
		
		hst.add("Rana");
		hst.add("Rana");
		hst.add(1);
		hst.add(1);
		hst.remove("Rana");
		System.out.println(hst.contains(2));
		
		Iterator it=hst.iterator();
		
		while(it.hasNext()){
			
			System.out.println(it.next());
		}

	}

}
