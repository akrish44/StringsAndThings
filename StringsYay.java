public class StringsYay {
	public static void main(String[] args) {
		int[] maxArray = {4, 2, 7, 9, 5, 6};

		System.out.println("The maximum value is " + maximum[maxArray]);
	}

	public static int maximum(char[] array1) {
		int size = array1.length;

		for(int i=0; i <= size; i++) {
			int max = 0;
			if (array1[i] < array1[i+1]) {
				max = array1[i+1];
			} else {
				max = array1[i];
			}
		}
	}

}