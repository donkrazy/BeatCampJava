import java.util.Scanner;

public class Problem4 {
	public static void main(String[] args) {
		Scanner s = null;
		try {
			System.out.println("�ֹι�ȣ�� �Է��ϼ��� ��)8711821213441:");
			s = new Scanner(System.in);
			String input = s.next();

			int length = input.length();
			if (length != 13) {
				System.out.println("�߸��� �ֹι�ȣ");
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
				System.out.println("��ȿ�� �ֹι�ȣ");
			}
			else {
				System.out.println("��ȿ���� ���� �ֹι�ȣ");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			s.close();
		}
	}
}
