package abstracttest;

public class Main {

	public static void main(String[] args) {
		Smartphone obj = new Iphone();
		obj.call();

		obj = new Android();
		obj.call();

		obj = new WinPhone();
		obj.call();
		// Smartphone smartphone = new Smartphone();
		// abstract class라서 인스턴스를 생성할 수 없다.
		// smartphone.call();

		/*
		 * Iphone iphone = new Iphone(); iphone.call();
		 * 
		 * Android android = new Android(); android.dial();
		 */

		// final변수 - 값을 변경할 수 없다.
		// 지역변수지만 전역변수처럼 메모리에서 소멸되지 않는다.
		final int ZERO = 0;
		// ZERO=1;

		int command = 1;
		final int LBUTTONDOWN = 1;
		final int RBUTTONDOWN = 2;
		if (command == LBUTTONDOWN) {

		} else if (command == RBUTTONDOWN) {

		}
	}
}
