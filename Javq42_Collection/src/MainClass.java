import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList<>();
		list1.add("dfdfdf");
		list1.add(3);
		list1.add(333333L);
		list1.add(3.3);
		list1.add(3.2f);
		list1.add('f');
		list1.add(4);
		for (Object object : list1) {
			System.out.println(object);
		}
		System.out.println("------------------");
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		System.out.println("-------------------");
		ArrayList<String> list2 = new ArrayList();
		list2.add("Dfdfd");
		System.out.println("-------------------");
		HashMap<String, TestClass> map = new HashMap<>();
		map.put("data1", new TestClass());
		System.out.println("--------------------");
		HashSet set = new HashSet<String>();
		set.add("s");
		set.add("ffff");
	}
}

class TestClass{
	
}