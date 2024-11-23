package impementation;

public class stack {

	int s[] = new int[10];
	int topOfStack;

	stack() {
		topOfStack = -1;
	}

	void push(int item) {
		if (topOfStack == 9) {
			System.out.println("Stack is full");
		} else {
			s.
			System.out.println(item + " element is pushed into stack");
			++topOfStack;
		}
	}

	int pop() {
		if (topOfStack < 0) {
			System.out.println("Stack is empty");
			return -1;
		}

		else
			System.out.println("element is  popped");
			return s[topOfStack--];

	}
	void printStack() {
		for (int x:s) {
			System.out.print(x+" ");
		}
	}

}
