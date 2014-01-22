package stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class ParenthesisValidator {

	public static void validate(String input) {
		// Check valid input //TODO

		Stack<Character> stack = new Stack<Character>();
		boolean isValid = true;
		for (int i = 0; i < input.length(); i++) {
			if (isOpen(input.charAt(i))) {
				stack.push(input.charAt(i));
			}
			else {
				try {
					Character open = stack.pop();
					if(input.charAt(i) != getClosing(open)) {
						isValid = false;
						break;
					}
				}
				catch (EmptyStackException e) {
					isValid = false;
					break;
				}
			}
		}
		if (stack.size() != 0) {
			isValid = false;
		}
		System.out.println("Input : " + input + " Validity : " + isValid);
	}

	private static boolean isOpen(Character single) {
		if (single == '(' || single == '{' || single == '[' || single == '<') {
			return true;
		}
		return false;
	}

	private static Character getClosing(Character opening) {
		switch (opening) {
		case '(':
			return ')';
		case '{':
			return '}';
		case '[':
			return ']';
		case '<':
			return '>';
		default:
			return null;
		}
	}

	public static void main(String[] args) {

		ParenthesisValidator.validate("(())"); // VALID

		ParenthesisValidator.validate("(())(()())"); // VALID

		ParenthesisValidator.validate("(()))()("); // INVALID

		ParenthesisValidator.validate("(()()()()((()())"); // INVALID

		ParenthesisValidator.validate("()("); // INVALID 

		ParenthesisValidator.validate("[{({)}}]"); // INVALID

		ParenthesisValidator.validate("[{(){}}]"); // VALID
		
		ParenthesisValidator.validate("(){}[]<>{(<[]>)}"); // VALID
		
		ParenthesisValidator.validate("({[<]>})"); // INVALID
		
		ParenthesisValidator.validate("()()(((())))"); // VALID
		
		ParenthesisValidator.validate("[[[]]()()(){()[{}]{{<>}<><><>}}]"); // VALID

	}
}
