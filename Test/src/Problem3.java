
public class Problem3 {
	public static void main(String[] args) {
		new print3by3() {
			@Override
			void write(int i, int j) {
				System.out.print(j + 1 + 3 * i + " ");
			}
		}.print();
		new print3by3() {
			@Override
			void write(int i, int j) {
				System.out.print(-j + 3 + 3 * i + " ");
			}
		}.print();
		new print3by3() {
			@Override
			void write(int i, int j) {
				System.out.print(3 * j + 1 + i + " ");
			}
		}.print();
		new print3by3() {
			@Override
			void write(int i, int j) {
				if (i >= 2 - j) {
					System.out.print("0 ");
				} else {
					System.out.print("  ");
				}
			}
		}.print();
		new print3by3() {
			@Override
			void write(int i, int j) {
				if ((i + j) % 2 == 0) {
					System.out.print("0 ");
				} else {
					System.out.print("  ");
				}
			}
		}.print();
	}

}

abstract class print3by3 {
	void print() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				write(i, j);
			}
			System.out.println();
		}
		System.out.println();
	}

	abstract void write(int i, int j);
}