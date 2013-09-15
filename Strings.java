public class Strings {
	
	public static void main(String[] args) {
		// char[] abecArray = {'d', 'i', 'm', 'p', 's', 'y'};
		char[] dupleArray = {'h', 'e', 'l', 'l', 'o'};
		

		// System.out.println("This string is " + isAbecedarian(abecArray));
		System.out.println("The string is " + isDupledrome(dupleArray));


	}
	// public static boolean isAbecedarian(char[] localArray) {
	
	// 	int size = localArray.length;
	// 	for(int i=0; i < (size-1); i++) {
	// 		if (localArray[i] >= localArray[i+1]) {
	// 			return false;
	// 		}
	// 	} 
	// 	return true;
	// }

	public static boolean isDupledrome(char[] localArray) {

		int size = localArray.length;
		for(int i=0; i < (size-1); i++) {
			if (localArray[i] != localArray[i+1]) {
				return false;
			}
			return true;
		}
		return true;
	}



}