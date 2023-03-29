package sec01.exam04;

public class Application {
	public static void main(String[] args) {
		
		//객체를 생성
		// 내가 정의해 놓은 class를 타입으로 사용
		KumhoTire kumho = new KumhoTire();
		//KumhoTire가 Tire를 구현하고 있으므로 tire로 자동형변환 된다 
		// (형변환이 중요한 이유는 부품을 교체가 가능하기 때문!)
		Tire tire = new KumhoTire();
		
		// 다형성 : 여러가지 타입을 가질 수 있는 성질
		// 1. 상속 : 자식클래스는 부모타입으로 선언할 수 있다(부모타입으로 자동형변환된다)
		// 2. 인터페이스 : 인터페이스의 구현체는 인터페이스 타입으로 선언할 수 있다 
		                // 인터페이스 타입으로 자동형변환 된다
		
		// 다형성 (: 여러가지 타입을 받을 수 있다)
		// 매소드의 오버라이딩(재정의)
		
		// 생성자의 매개변수의 타입으로 인터페이스를 사용하고 있으므로 
		// 인터페이스의 구현체를 매개변수로 넣어줘야 합니다.
		// 인터페이스의 구현체는 추상메소드를 모두 구현 해야하며
		// 구현체가 구현한 메소드가 실행됩니다.
		Car kumho_car = new Car(new KumhoTire());
		Car Hankook_car = new Car(new HankookTire());
		
	
		kumho_car.run();
		System.out.println("==================");
		Hankook_car.run();
		
	}
}
