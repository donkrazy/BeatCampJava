package fefe;

public class MainClass {
	public static void main(String[] args) {
		TestClass t= new TestClass();
		int i = t.test_method();
		System.out.println(i);
		
		System.out.println("############");
		
		DataClass dd = new DataClass();
		dd.d1 = 1;
		dd.d2 = 4;
		String zz = dd.toString();
		System.out.println(zz);
		
		System.out.println("############");
		
		String y = t.test_method2(1, 2, '3', "vvv");
		System.out.println(y);
		
		System.out.println("############");
		
		System.out.printf("°á°ú: %s\n", y);
	}
}

