
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass sb = new SubClass();
	}

}

class SuperClass{
	int a;
	int b;
	
	SuperClass() {
	}
	
	SuperClass(int a, int b){
		
	}
}
class SubClass extends SuperClass{
	SubClass(){
		super(100, 100);
		System.out.println("SubClass");
	}
}
