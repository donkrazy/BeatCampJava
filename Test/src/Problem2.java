
public class Problem2 {

	public static void main(String[] args) {
		int MAX_NUM = 1000;
		for (int i = 1; i <= MAX_NUM; i++) {
			for(int j = 2; j <= i; j++) {
				if(j == i) {
					System.out.printf("%d�� �Ҽ��Դϴٶ���\n", j);
				}
				if(i % j == 0) {
					break;
				}
			}

		}
	}

}
