package abstracttest;

public class Android extends Smartphone {

	@Override
	public void call() {
		double x = 10.75;
		System.out.println("소수 첫째자리 반올림: " + ((int)(x+0.5)));
		System.out.println("소수 둘째자리 반올림: " + ((int)(x * 10 + 0.5))/10.0);
	}
}
