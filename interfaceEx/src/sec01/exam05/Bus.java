package sec01.exam05;

// Vehicle인터페이스를 implements 구현하겠다
// Bus는 Vehicle인터페이스의 구현체!
// 나는 인터페이스로 자동형변환이 가능하다
public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	public void checkFare() {  // 버스만 가지고 있는 메소드
		System.out.println("승차요금을 체크합니다.");
	}

}
