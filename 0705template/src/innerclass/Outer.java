package innerclass;

public class Outer {
	//일반 inner class : 클래스 안에 존재하는 클래스
	//class Inner{}
	//외부클래스 안에 만든 내부클래스는 외부의 또다른 클래스에서 쓸 수 없구나.

	
	//static inner class : 내부 클래스 안에 static멤버가 있으면
	//일반 inner class는 에러를 발생시킨다.
	//이 때는 class앞에 static을 붙여 줘야 한다.
	//static class Inner{
	//	static int n;
	//}
	
	//local inner class : 메소드 안에 만드는 클래스
	//메소드가 호출돼서 실행될 때 만들어졌다가 없어지는 클래스
	//클래스가 메소드를 호출할 때만 존재하기 때문에 메모리 효율을 높일 수도 있다.
	public void sample() {
		class Inner{
			
		}
	}
}
