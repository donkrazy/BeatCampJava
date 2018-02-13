import com.tmaxsoft.test3.TestClass2;

public class MainClass {
	public static void main(String[] args) {
		TestClass1 t1 = new TestClass1();
		System.out.println(t1.data1 + t1.data2 + t1.data3 + t1.data4);

		TestClass2 t2 = new TestClass2();
		System.out.println(t2.data1 + t2.data2 + t2.data3 + t2.data4);

	}
}

class SubClass extends TestClass1 {
	SubClass() {
		System.out.println(data1 + data2 + data3 + data4);
	}
}

class SubClass2 extends TestClass2 {
	SubClass2(){
		System.out.println(data1 + data2 + data3 + data4);
	}
}