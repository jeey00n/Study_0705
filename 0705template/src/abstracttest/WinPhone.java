package abstracttest;

public class WinPhone extends Smartphone {

	@Override
	public void call() {
		int time = 132400;
		//위에 저장된 값이 초라고 가정하고 몇 시간 몇 분 몇 초인지 출력
		int hour = time/3600;
		int minute = (time%3600)/60;
		int second = time%60;
		System.out.println(time+"초는 " + hour+"시간 " + minute + "분 "+ second+"초입니다.");

	}

}
