package projectA20;

public class Car {
	
	public int speed;
	
	
	public void speedUp() {
		speed =speed +1;
	}
	
	public final void stop() {
		System.out.println("멈추시오.");
		speed=0;
	}

}
