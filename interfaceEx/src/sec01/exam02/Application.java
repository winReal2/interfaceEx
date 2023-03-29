package sec01.exam02;

import sec01.exam01.Audio;

public class Application {
	public static void main(String[] args) {
		// 기본 생성자를 이용하여 객체를 생성 후 레퍼런스변수
		// 참조타입 변수에 저장
		MyClass myclass = new MyClass();
		// 1. 인터페이스가 필드에 사용된 경우
		// 1_1. myClass의 필드에 접근해서 구현체에서 정의한 메소드 호출(smartTV 생성)
		myclass.rc.turnOn();       //rc에 접근가능한 이유는 RemoteControl의 접근제한이 default이기 때문!
		myclass.rc.setVolume(15);
		myclass.rc.turnOff();
		
		// 1_2. 필드에 새로운 객체를 생성하여 저장
		myclass.rc = new Audio();
		myclass.rc.turnOn();       //rc에 접근가능한 이유는 RemoteControl의 접근제한이 default이기 때문!
		myclass.rc.setVolume(15);
		myclass.rc.turnOff();
		
		System.out.println("====================");
		// 2. 인터페이스가 생성자의 매개변수로 이용된 경우
		// 인터페이스의 구현체를 생성하여 매개변수로 전달
		MyClass myclass1 = new MyClass(new Audio());
		myclass1.rc.turnOn();
		myclass1.rc.setVolume(10);
		myclass1.rc.turnOff();
	
		System.out.println("====================");
		// 3. 인터페이스가 메소드의 매개변수로 이용된 경우
		// 기본생성자로 생성하면 rc는 SmartTV로 생성됩니다.
		// 필드의 선언부에서 생성하고 있습니다.
		MyClass myclass2 = new MyClass();
		
		// 인터페이스가 메소드의 매개변수 타입으로 사용될 경우
		// 메소드 호출시 구현객체를 매개값으로 대입합니다.
		myclass.methodB(new Audio());
		myclass.rc.turnOn();
		myclass.rc.setVolume(3);
		myclass.rc.turnOn();
		
		System.out.println("====================");
		
		MyClass myclass3 = new MyClass();
		// 4. 메소드에 선언된 로컬변수를 rc에 저장
		myclass3.methodA();
		myclass3.rc.turnOn();
		myclass3.rc.setVolume(5);
		myclass3.rc.turnOff();
	}
}
