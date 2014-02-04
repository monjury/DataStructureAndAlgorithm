package string;

public class SpaceReplacement {

	// Replace space with '%20' in a character array
	
	public static void replace(char[] input) {
		// 1. Get number of trailing space count to get real string length
		int actualLength = input.length;
		while(input[actualLength - 1] == ' ') {
			actualLength--;
		}
		
		
		// 2. Get number of within blanks in real string length
		int i = 0;
		int blanks = 0;
		while(i < actualLength){
			if(input[i] == ' ') {
				blanks++;
			}
			i++;
		}
		
		// 3. Copy to new array from end to start
		int resultLength = actualLength + (blanks * 2);
		char[] result = new char[resultLength];
		int rIndex = resultLength - 1;
		int iIndex = actualLength - 1;
		while(rIndex >= 0) {
			if(input[iIndex] == ' ') {
				result[rIndex--] = '0';
				result[rIndex--] = '2';
				result[rIndex--] = '%';
				iIndex--;
			}
			else {
				result[rIndex--] = input[iIndex--];
			}
		}
		print(input, result);
	}
	
	private static void print(char[] input, char[] result) {
		System.out.print(" INPUT : ");
		for(char a : input){
			System.out.print(a);
		}
		
		System.out.print(" RESULT : ");
		for(char a : result){
			System.out.print(a);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		SpaceReplacement.replace("hello world   ".toCharArray());
		SpaceReplacement.replace("hello world".toCharArray());
		SpaceReplacement.replace("how are you   ".toCharArray());
		SpaceReplacement.replace("   hello world   ".toCharArray());
	}
}
