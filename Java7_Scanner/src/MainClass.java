import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수입력");
		int a1 = scan.nextInt();
		System.out.println("실수입력");
		double a2 = scan.nextDouble();
		System.out.println("문자열입력");
		String a3 = scan.next();
		System.out.printf("%d/%f/%s", a1, a2, a3);
		scan.close();
	}

}
