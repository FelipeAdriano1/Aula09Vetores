package iteratorInterface.exec12;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InteratorInterface_ {
	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>(); 
		numeros.add(123); 
		numeros.add(223); 
		numeros.add(568); 

		Iterator<Integer> iterator = numeros.iterator(); 
		while (iterator.hasNext()) { 
			System.out.println(iterator.next()); 
		}
	}
}
