package interfaceCollection.exec8;

import java.util.ArrayList;
import java.util.Collection;

public class InterfaceCollection_ {
	public static void main(String[] args) {
		
		Collection<Integer> items = new ArrayList<>(); 
		
		items.add(1); 
		items.add(2);
		items.add(3);
		items.add(4);
		items.add(5);

		System.out.println("Total items: " + items.size()); 
	}
}
