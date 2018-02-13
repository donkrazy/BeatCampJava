import java.math.BigDecimal;
import java.math.BigInteger;

public class MainClass {

	public static void main(String[] args) {
		TestClass t1 = new TestClass();
		t1.a1 = 4;
		System.out.println(t1.a1);
		System.out.println(t1.s);
		BigInteger b = new BigInteger("32165488465131351345646432132153453");
		BigDecimal b1 = new BigDecimal("123123123123434123412341341234.3");
		System.out.println(b1.add(new BigDecimal("0.7")));
	}

}


class TestClass{
	int a1 = 1;
	int b2 = 3;
	String s = "ddd";
}