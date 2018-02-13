import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("½¸ÀÚ ÀÔ·Â");
			int num = s.nextInt();
			long total = 0;
			for(int i=1; i<num; i++) {
				total += i;
			}
			System.out.println(total);
			s.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
