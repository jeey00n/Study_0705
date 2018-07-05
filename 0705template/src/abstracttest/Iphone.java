package abstracttest;

public class Iphone extends Smartphone {

	@Override
	public void call() {
		int money = 113600;
		int fm = money / 50000;
		int m = (money % 50000) / 10000;
		int t = ((money % 50000) % 10000) / 1000;
		int h = (((money % 50000) % 10000) % 1000)/100;
		System.out.println("5만원:" + fm + "장, 만원: " + m + "장, 천원: " + t + "장, 백원: " + h+"개");
	}
}
