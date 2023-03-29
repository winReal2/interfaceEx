package sec01.exam01;
// (, 로 구분) 여러개의 인터페이스를 구현할 수 있다
// 인터페이스들에 선언된 추상메소드를 모두 구현해야 한다
// 미구현 메소드가 남아 있다면 추상클래스가 된다
public class Audio implements Remotecontrol, Searchable {
	
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다");
	}
	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		// else 안쓰는 대신 this.volume = volume;를 맨 윗줄로 보내도 됨
		if(volume > MAX_VOLUME) {
			 this.volume = MAX_VOLUME;
		} else if(volume < MIN_VOLUME) {
			 this.volume = MIN_VOLUME;
		} else {
		this.volume = volume;
	}
	System.out.println("현재 오디오 볼륨 : " + this.volume);
	}
	
	
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다");
		
	}
}
	

