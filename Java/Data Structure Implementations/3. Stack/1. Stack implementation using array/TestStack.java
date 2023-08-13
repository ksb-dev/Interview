import java.util.*;

public class TestStack {
	public static void main(String[] args) {
		StackClass stack = new StackClass();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		//stack.push(60);

		stack.pop();

		System.out.println(stack.peek());

		System.out.println(stack.isEmpty());

		stack.print();
	}
}