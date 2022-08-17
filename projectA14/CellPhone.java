package projectA14;

public class CellPhone {
    
//	인스턴스 멤버 변수
	String modle;
	String color;
//	생성자 생략
	
//	인스턴스 멤버 메소드
	
	void PowerOn() {
		System.out.println("전원을 켭니다.");
	}
	void PowerOff() {
		System.out.println("전원을 끕니다.");
	}
	void bell() {
		System.out.println("벨을 누릅니다.");
	}
	void sendVoice(String message) {
		System.out.println("보내기:"+message);
	}
	void recevieVoice(String message) {
		System.out.println("받기:"+message);
	}
	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
	
}
