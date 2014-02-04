package string;

public class StringCompressor {
	
	public static void compress(String input) {
	
		StringBuilder result = new StringBuilder();
		int i = 0;
		char temp = '\u0000';
		int currentCount = 0;
		
		while(i < input.length()) {
			currentCount = 0;
			temp = input.charAt(i);
			while(i < input.length() && input.charAt(i) == temp) {
				currentCount++;
				i++;
			}
			result.append(temp);
			result.append(currentCount);
		}
		
		String resultStr = (result.length() <= input.length()) ? result.toString() : input; 
		print(input, resultStr);
	}
	
	private static void print(String input, String result) {
		System.out.print(" INPUT : " +  input);
		System.out.print(" RESULT : " + result);
	}
	
	public static void main(String[] args) {
		StringCompressor.compress("aaab");
	}
}
