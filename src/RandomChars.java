import java.util.Random;

//Class to generate random sequence of characters 
public abstract class RandomChars {
	
	/*Parameters: arrLength (desired length of randomized array, possibly determined by level/difficulty)
	 *Returns: charArr (Randomized array of characters from fullDictionary)
	 */
	public static char[] generateFull(int arrLength) {
		char[] fullDictionary = "1234567890abcdefghijklmnopqrstuvwxyz".toCharArray();
		char[] charArr = new char[arrLength];
		for(int i=0; i < arrLength; i++) {
			Random rand = new Random();
			int nextIndex = rand.nextInt(fullDictionary.length);
			charArr[i] = fullDictionary[nextIndex];
		}
		return charArr;
	}
	
	/*Parameters: arrLength (desired length of randomized array, possibly determined by level/difficulty)
	 *Returns: charArr (Randomized array of characters from leftDictionary)
	 */
	public static char[] generateLeft(int arrLength) {
		char[] leftDictionary = "12345qwertasdfgzxcv".toCharArray();
		char[] charArr = new char[arrLength];
		for(int i=0; i < arrLength; i++) {
			Random rand = new Random();
			int nextIndex = rand.nextInt(leftDictionary.length);
			charArr[i] = leftDictionary[nextIndex];
		}
		return charArr;
	}
	
	/*Parameters: arrLength (desired length of randomized array, possibly determined by level/difficulty)
	 *Returns: charArr (Randomized array of characters from rightDictionary)
	 */
	public static char[] generateRight(int arrLength) {
		char[] rightDictionary = "67890yuiophjklbnm".toCharArray();
		char[] charArr = new char[arrLength];
		for(int i=0; i < arrLength; i++) {
			Random rand = new Random();
			int nextIndex = rand.nextInt(rightDictionary.length);
			charArr[i] = rightDictionary[nextIndex];
		}
		return charArr;
	}
	
}
