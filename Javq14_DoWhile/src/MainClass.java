
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt = 0;
		int num = 1;
		while (cnt < 100) {
			if(num % 3 == 0) {
				cnt++;
				System.out.println(num);
			}
			num++;
		}
	}

}
