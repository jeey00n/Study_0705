package innerclass;

public class Main {

	public static void main(String[] args) {
		ThreadEx obj = new ThreadEx();
		obj.start();

		// Thread클래스의 anonymous만들기
		Thread th = new Thread() {
			public void run() {
				try {
					for (int i = 10; i < 20; i++) {
						System.out.println(i);
						//()안은 밀리세컨드, 1000분의 1초
						Thread.sleep(1000);
					}
				} catch (Exception e) {
				}
			}
		};
		th.start();
	}
}
