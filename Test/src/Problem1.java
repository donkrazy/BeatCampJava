import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		try {
			System.out.print("�ܼ��� �Է��ϼ���:");
			Scanner s = new Scanner(System.in);
			int inputNum = s.nextInt();
			System.out.printf("===%d�� ������===\n", inputNum);
			for (int i = 1; i < 10; i++) {
				System.out.printf("%d * %d = %d\n", inputNum, i, i * inputNum);
			}
			s.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
