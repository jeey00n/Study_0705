package sharedata;

public class Main {

	public static void main(String[] args) {
		Location location = new Location();
		location.latitude = 34.2468;
		location.longitude = 137.4682;
		//Location의 데이터를 Map을 이용해서 출력한 것입니다.
		location.getLocation();
	}

}
