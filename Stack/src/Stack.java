import java.util.EmptyStackException;

public class Stack<E> {
	E[] stack;
	int capacity;
	int top;
	
	@SuppressWarnings("unchecked") // TODO : why we need this ?
	public Stack() {
		capacity = 10;
		top = -1;
		stack = (E[]) new Object[capacity];
	}
	
	public void push(E data) {
		if(top < capacity) {
			top++;
			stack[top] = data;
		}
		else {
			increaseCapacity();
			push(data);
		}
	}
	
	public E pop() {
		if(top < 0) {
			throw new EmptyStackException();
		}
		top --;
		return stack[top + 1];
	}
	
	public E peek() {
		return stack[top];
	}
	
	public boolean isEmpty() {
		return (top < 0);
	}
	
	@SuppressWarnings("unchecked") // TODO : why we need this ?
	private void increaseCapacity() {
		capacity *= 2;
		E[] temp = stack;
		stack = (E[]) new Object[capacity];
		int i = 0;
		while (i < temp.length) {
			stack[i] = temp[i];
			i++;
		}
	}
}
