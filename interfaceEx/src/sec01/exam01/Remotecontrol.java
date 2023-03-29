package sec01.exam01;

public interface Remotecontrol {
	// 인터페이스는 생성자를 가질 수 없음
	// 인스턴스 필드도 가질 수 없음  >> 상수는 사용가능
	// 보통은 추상메소드를 가지고 있음
	
	// 인터페이스에서 static final을 자동으로 붙여줍니다
	// 상수 : 대문자 , _ (언더바)
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//추상메소드  (abstract 붙이지 않아도 인터페이스에서 자동으로 추상메소드로 만들어줌)
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
