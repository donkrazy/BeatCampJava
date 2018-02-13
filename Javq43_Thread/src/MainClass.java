
public class MainClass {

	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 20; i++) {
					try {
						Thread.sleep(10);
					} catch (Exception e) {
						e.printStackTrace();
					}
					System.out.print("_");
				}
			}
		}).start();

		new Thread(() -> {
			for (int i = 0; i < 20; i++) {
				try {
					Thread.sleep(10);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.print("^");
			}
		}).start();
	}

}
