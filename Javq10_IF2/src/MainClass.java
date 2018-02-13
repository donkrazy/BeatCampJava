import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Scanner s = new Scanner(System.in);
			long joo = s.nextLong();
			long gender = (long) (joo /  Math.pow(10, 6)) % 10;
			System.out.println(joo);
			long year = (long) (joo / Math.pow(10, 11));
			long month = (long) (joo / Math.pow(10, 10));
			long date = (long) (joo /  Math.pow(10, 19));
			
			// 주민번호 입력
			// 각자리수
			// 계산
			// 성별 판단
			// 출력
			s.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		char c = 'a';
		Character c1 ='c';
		System.out.println((int)c1.MAX_HIGH_SURROGATE);

	}
}
