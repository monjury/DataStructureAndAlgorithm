package string;

public class RotationValidator {

	public static boolean isRotate(String a, String b) {
		int len = a.length();
		if(len != b.length()) {
			return false;
		}
		StringBuilder temp = null;
		for(int i = 1; i < len; i++) {
			temp = new StringBuilder();
			temp.append(a.substring(i, len));
			temp.append(a.substring(0, i));
			if(temp.toString().equals(b)) {
				return true;
			}
		}
		
		return false;
	}
	
	public static void print(String a, String b) {
		boolean result = isRotate(a, b);
		System.out.print(" INPUT : " +  a + ", " + b);
		System.out.println(" RESULT : " + result);
	}
	
	public static void main(String[] args) {
		RotationValidator.print("abcd", "dabc");
		RotationValidator.print("abcaaad", "dabcaaa");
		RotationValidator.print("abcd", "daabc");
	}
}
