package iterable.exec6;

import java.util.ArrayList;
import java.util.List;

public class Iterable_ {
	public static void main(String[] args) {
		
		List<String> items = new ArrayList<>();
		
		items.add("Mamão");
		items.add("Melancia");
		items.add("Mexerica");
		items.add("Maçã");
		items.add("Manga");

		for (String item : items) {
			System.out.println(item);
		}
	}
}
