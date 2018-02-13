import java.util.ArrayList;

public class MainClass {
	public static void main(String[] args) {
		int i= 0;
		ArrayList<Integer> a = new ArrayList<Integer>();
		while(i < 1000) {
			a.add(i);
			i++;
		}
		System.out.println(a);
	}
}
