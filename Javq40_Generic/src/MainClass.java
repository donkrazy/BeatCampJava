
public class MainClass {

	public static void main(String[] args) {
		TestClass t1 = new TestClass();
		test_method(t1);
		test_method("helloworld");
		
		Integer int1 = Integer.valueOf(1);
		test_method(int1);
		
		Integer int2 = 100;
		int a = int2.intValue();
		Double double2 = 11.11;
		
		test_method(int2);
		test_method(55.55);
		System.out.println(int2.getClass());
		
		test_method("DFdfzdf");
		Object ob = new Object();
		System.out.println(ob.getClass().toString());
	}
	
	public static void test_method(Object obj) {
		System.out.println(obj);
		if(obj instanceof String) {
			System.out.println("Sttrr");
		}
		else if (obj instanceof TestClass) {
			TestClass t = (TestClass) obj;
			((TestClass) obj).test_method();
		}
	}

}

class TestClass{
	public void test_method() {
		System.out.println("TESTclasds¸Þ¼­µå");
	}
}
