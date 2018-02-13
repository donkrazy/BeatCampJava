
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Superclass s = new Superclass();
		s.super_method1();
		SubClass ss = new SubClass();
		ss.sub_method();
		System.out.println("#####");
		System.out.println(s.super_1);
	}

}

class Superclass{
	int super_1 = 100;
	void super_method1() {
		System.out.println("super");
	}
}

class SubClass extends Superclass{
//	int super_1 = 200;
	@Override
	void super_method1() {
	}
	
	void sub_method() {
		super.super_1 = 333;
		System.out.println(super_1);
	}
}