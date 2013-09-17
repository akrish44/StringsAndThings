public class Strings {
	
	public static void main(String[] args) {
		// char[] abecArray = {'d', 'i', 'm', 'p', 's', 'y'};
		// char[] dupleArray = {'h', 'e', 'l', 'l', 'o'};
		String str = "hello";
		char[] captainArray = str.toCharArray();
		// 'uryyb'



		// System.out.println("This string is " + isAbecedarian(abecArray));
		// System.out.println("The string is " + isDupledrome(dupleArray));

		System.out.println("The encoded value is: " + captainCrunch(captainArray));

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

	// public static boolean isDupledrome(char[] localArray) {

	// 	int size = localArray.length;
	// 	for(int i=0; i < (size-1); i++) {
	// 		if (localArray[i] != localArray[i+1]) {
	// 			return false;
	// 		}
	// 		return true;
	// 	}
	// 	return true;
	// }

	public static String captainCrunch(char[] localArray) {
		int size = localArray.length;
	

		for(int i=0; i<size; i++) {
			int charValue = 0;
			char z = 'z';
			int valueOfz = valueOf.z;
			charValue = valueOf.localArray[i];
			int diff = valueOfz - charValue;
			if (diff < (13)) {
				
				localArray[i] = charAt(charValue + 13);

			} else {//if (arrayUnder >(26 -13)
				
				localArray[i] = charAt(charValue - 13);
			}
		}
		
		return localArray.toString();
	}



}