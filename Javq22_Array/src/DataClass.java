
public class DataClass {
	int a;
	int b;
	int[] c;

	void print() {
		int i = a + b;
		for (int j : c) {
			i += j;
		}
		System.out.println(i);
	}

}
