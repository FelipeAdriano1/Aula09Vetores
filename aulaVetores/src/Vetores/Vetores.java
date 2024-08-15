package Vetores;
import java.util.Arrays;

public class Vetores {
	public static void main(String[] args) {
		int[] num = {10, 6, 234, 41, 42};
		
		Arrays.sort(num);
		
		System.out.println(Arrays.toString(num));
		// 6, 10, 41, 42, 234
		//            ^
		//            |
		int i = Arrays.binarySearch(num, 42);
		System.out.println(i);
	}
}
