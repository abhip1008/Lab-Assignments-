/** Class Design Reference for IntList  */

public class CharList {
 	private int numElements = 0;
 	private char[] data = new char[100];

 	public void add(char letter) {
		// Notice there is no check for numElements < 100
 		data[numElements++] = letter;
 	}

 	public String toString() {
 		String retVal = "";
 		for(int i = 0; i < numElements; i++) {
 			retVal += data[i];
 		}
 		return retVal;
 	}
}
