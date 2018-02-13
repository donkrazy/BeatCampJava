public class MainClass {
	
	public MainClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[10];
		a[3] = 5;
		System.out.println(a[2]);
		System.out.println(a.getClass().toString());
		System.out.println("#########");
		DataClass dc = new DataClass();
		dc.a = 1;
		dc.b = 2;
		dc.c = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		dc.print();
		int[] x = {1,2,3};
		int[][] y = {{1,2}, {3,4}, {5,6}};
		System.out.println(y[2][1]);
		
		System.out.println(sum(dc.c));
		System.out.println("####");
		
		System.out.println(sum2(dc.c));
	}
	
	static int sum(int[] nums) {
		int i = 0;
		for (int j : nums) {
			i += j;
		}
		return i;
	}
	
	static int sum2(int ... nums) {
		int count = 0;
		for(int i : nums) {
			count += i;
		}
		return count;
	}
}