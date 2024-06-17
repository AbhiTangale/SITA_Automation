package Resources;

import java.util.Random;

public class CommonUtilities {
	private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

	public static String generateRandomString(int length) {
		StringBuilder sb = new StringBuilder(length);
		Random random = new Random();

		for (int i = 0; i < length; i++) {
			int index = random.nextInt(CHARACTERS.length());
			char randomChar = CHARACTERS.charAt(index);
			sb.append(randomChar);
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		int stringLength = 10; // Change the length as needed
		String randomString = generateRandomString(stringLength);

		System.out.println("Random String: " + randomString);
	}
//	public static void randominputnumber() {
//	Random random = new Random();
//	int min = 1;
//	int max = 100000;
//	int randomNumber = random.nextInt(max - min + 1) + min;
//	String randominputnumbers1 = Integer.toString(randomNumber);
//   
//}
	
	
	    private static final Random random = new Random();

	    public static int generateRandomNumber(int min, int max) {
	        return random.nextInt((max - min) + 1) + min;
	    }
	}
	

