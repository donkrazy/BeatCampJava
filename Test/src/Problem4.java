import java.util.Scanner;

public class Problem4 {
	public static void main(String[] args) {
		Scanner s = null;
		try {
			System.out.println("주민번호를 입력하세요 예)8711821213441:");
			s = new Scanner(System.in);
			String input = s.next();

			int length = input.length();
			if (length != 13) {
				System.out.println("잘못된 주민번호");
				return;
			}

			int[] inputArray = new int[13];
			for (int i = 0; i < length; i++) {
				inputArray[i] = (int) input.charAt(i) - '0';
			}

			int validInt = 0;
			int[] validIntArray = { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5 };

			for (int i = 0; i < length - 1; i++) {
				validInt += inputArray[i] * validIntArray[i];
			}

			boolean result;
			result = (11 - (validInt % 11)) % 10 == inputArray[length - 1];
			
			if(result) {
				System.out.println("유효한 주민번호");
			}
			else {
				System.out.println("유효하지 않은 주민번호");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			s.close();
		}
	}
}
