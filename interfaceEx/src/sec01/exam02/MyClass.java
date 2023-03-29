package sec01.exam02;

import sec01.exam01.Audio;
import sec01.exam01.Remotecontrol;
import sec01.exam01.SmartTV;

public class MyClass {
	// 인터페이스는 생성할 수 없다
	// 인터페이스는 필드, 생성자, 
	// 메소드의 매개변수, 메소드의 로컬변수(지역변수)로 선언할 수 있다(선언할 수 있다=타입으로 사용할 수 있다)
	// 결론적으로, 다형성을 의미(여러가지 타입을 가질 수 있다)
	
	// 인터페이스가 필드의 타입으로 선언된 경우
	// 인터페이스의 구현체만 인터페이스를 타입으로 사용할 수 있다.
	// SmartTV() 자리에 올 수 있는 것은 인터페이스의 구현체!
	 Remotecontrol rc = new SmartTV();
	 
	 public MyClass() {
		 
	 }
	 
	 public MyClass(Remotecontrol rc) {
		 // 매개변수로 받아온 rc를 필드에 저장
		 this.rc = rc;
	 }
	 public void methodA() {
		 // Audio 객체를 생성하여 RemoteControl 타입으로 자동변환
		 // 인터페이스의 타입으로 지역변수 생성
		 Remotecontrol rc = new Audio();
		 // 생성된 객체를 필드에 저장
		 this.rc = rc;
	 }
	 public void methodB(Remotecontrol rc) {
		 // 매개변수로 받아온 rc를 필드에 저장
		 this.rc = rc;
	 
	 }
}
