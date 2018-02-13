import java.io.IOException;

public class MainClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("글자입력");
		char a1 = (char) System.in.read();
		System.out.println(a1);
		System.in.read();
		System.in.read();
		System.out.println("굴자입력: ");
		int a2 = System.in.read();
		System.out.println(a2);
	}
}
