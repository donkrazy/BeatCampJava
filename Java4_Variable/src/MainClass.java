
public class MainClass {
	public static void main(String[] args) {
		boolean a1;
		a1 = true;
		boolean a2 = false;
		System.out.println(a1 | a2);
		char a4 = '쀍';
		System.out.println((int)a4);
		System.out.println((char) 49169);
		float a5 = 11.11f;
		double a6 = 11.111;
		System.out.println(a5);
		System.out.println(a6);
		
		// literal의 기본 크기 고려
		// 정수형 4byte(int), 실수형 8byte(float)
		byte a = 100;
		float d = 11.11f;
		
		int koreanPointAvg = 20;
		System.out.println(koreanPointAvg);
		System.out.println('갸'>'나');
	}
}
