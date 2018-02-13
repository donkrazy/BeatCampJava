import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> ls = new ArrayList<Integer>();
		int i;
		try {
			do {
				System.out.println("숫자입력");
				i = s.nextInt();
				ls.add(i);
			} while (i != 0);

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(ls);
	}

}
