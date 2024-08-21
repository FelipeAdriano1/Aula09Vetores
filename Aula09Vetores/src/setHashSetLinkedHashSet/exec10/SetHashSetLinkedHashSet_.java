package setHashSetLinkedHashSet.exec10;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetHashSetLinkedHashSet_ {
	public static void main(String[] args) {
		
		Set<String> fruit = new LinkedHashSet<>(); 
		
		fruit.add("Abacate");
		fruit.add("Banana");
		fruit.add("Caqui");
		fruit.add("Banana");

		System.out.println(fruit); 
		
		//Acredito a lógica é manter somente o primeiro registro, não aceitando duplicatas.
		//Esta foi a saída do programa: [Abacate, Banana, Caqui]
	}
}
