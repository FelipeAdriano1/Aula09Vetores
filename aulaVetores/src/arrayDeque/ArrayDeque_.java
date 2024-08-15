package arrayDeque;
import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeque_ {
	public static void main(String[] args) {
		Deque<String> stack = new ArrayDeque<>();
		stack.push("Primeiro elemento");
		stack.push("Segundo elemento");
		stack.push("Terceiro elemento");
		
		//COLOCAR THREAD PARA IMPRIMIR A INSERÇÃO DOS ELEMENTOS.

		System.out.println("Popped return: " + stack.pop());
		System.out.println("\nPilha após o popped: " + stack.peek());
	}
}
