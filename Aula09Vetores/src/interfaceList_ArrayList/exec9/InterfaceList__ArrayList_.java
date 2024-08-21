package interfaceList_ArrayList.exec9;

import java.util.ArrayList;
import java.util.List;

public class InterfaceList__ArrayList_ {
	public static void main(String[] args) {
		
		List<String> animals = new ArrayList<>(); 
		
		animals.add("Azul"); 
		animals.add("Vermelho"); 
		animals.add("Branco"); 

		System.out.println("color at index 1: " + animals.get(1)); 
	}
}
