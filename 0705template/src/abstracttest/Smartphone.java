 package abstracttest;
//추상 클래스: 인스턴스를 만들 수 없는 클래스.
abstract class Smartphone {
	//하위 클래스의 메소드와 오버라이딩 관계를 만들기 위해 생성한 메소드
	//추상 메소드: 내용이 없는 메소드로 상속받은 곳에서 반드시 재정의해야 함.
	public abstract void call();
}
