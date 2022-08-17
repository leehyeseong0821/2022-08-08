package projectA18;

public class SuperSonicAirplane extends Airplane {
	
	public static final int NORMAL=1;
	public static final int SUPERSONIC=2;
	
	
	public int flyMODE = NORMAL;
	
	
	@Override
	public void fly() {
		if(flyMODE == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		}else {
			super.fly();
		}
	}
	@Override
	public void takeOff() {
		System.out.println("초음속 비행기 이륙");
	}
	@Override
	public void land() {
		System.out.println("초음속 비행기 착륙");
	}
 
}
