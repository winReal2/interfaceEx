package sec01.exam01;

public class Application {
	public static void main(String[] args) {
		// 인터페이스는 생성할 수 없지만 
		// 참조변수의 타입으로 사용할 수 있다
		// 인터페이스 변수 = new 구현객체 ;   <= 이것이 바로 인터페이스의 다형성!
		Remotecontrol rc = new Audio();
		rc.turnOn();
		rc.setVolume(15);
		rc.turnOff();

		// 인터페이스의 다형성
		// 인터페이스의 구현체는 인터페이스를 타입으로 가질 수 있다(다형성)
//		Remotecontrol tv = new Television();
//		//Television tv = new Television();
//		tv.turnOn();
//		tv.setVolume(3);
//		tv.turnOff();
		
		// 상속 단계에 있는 부모가 인터페이스를 구현하고 있는 경우 (부모가 구현체면 자식도 구현가능)
		// 인터페이스의 타입으로 생성이 가능하다(=인터페이스 타입으로 가질 수 있다)
		Remotecontrol smartTV = new SmartTV();
		smartTV.turnOn();
		smartTV.setVolume(10);
		smartTV.turnOff();
		
		
		Searchable searchable = new SmartTV();
		Television television = new SmartTV();
	}
}
