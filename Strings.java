public class Strings {
	
	public static void main(String[] args) {
		char[] abecArray = {'d', 'i', 'm', 'p', 's', 'y'};


		System.out.println("This string is " + isAbecedarian(abecArray));

	}
	public static boolean isAbecedarian(char[] localArray) {
	
		int size = localArray.length;
		for(int i=0; i < (size-1); i++) {
			if (localArray[i] >= localArray[i+1]) {
				return false;
			}
		} 
		return true;
	}


}