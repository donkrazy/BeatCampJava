import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�����Է�");
		int a1 = scan.nextInt();
		System.out.println("�Ǽ��Է�");
		double a2 = scan.nextDouble();
		System.out.println("���ڿ��Է�");
		String a3 = scan.next();
		System.out.printf("%d/%f/%s", a1, a2, a3);
		scan.close();
	}

}
