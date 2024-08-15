package vector;

import java.util.Vector;

public class Vectors_ {
	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();
		vector.add(60);
		vector.add(20);
		vector.add(30);
		vector.add(40);
		vector.add(230);
		vector.add(3320);
		vector.add(620);
		vector.add(2012);
		vector.add(301);
		
		System.out.println(vector.capacity());
		System.out.println("Vector: " + vector);
	}
}
