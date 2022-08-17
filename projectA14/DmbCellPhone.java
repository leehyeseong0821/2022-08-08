package projectA14;

public class DmbCellPhone extends CellPhone {
// 인스턴스 멤버 변수
	int channel;
	
//	생성자
	
	DmbCellPhone(String model,String color,int channel){
		this.modle=model;
		this.color=color;
		this.channel=channel;
	}
	
//	인스턴스 메버 메소드
	
	void tunrOnDmb() {
		System.out.println("채널"+this.channel+"번 DMb 방송 수신");
	}
	void changeChannelDmb(int channel) {
		this.channel=channel;
		System.out.println("채널"+this.channel+"번으로 바꿉니다.");
	}
	void turnOFFDmb() {
		System.out.println("Dmb 수신을 멈춥니다.");
	}
	
}
