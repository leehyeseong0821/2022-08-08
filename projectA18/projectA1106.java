package projectA18;

public class projectA1106 {

	public static void main(String[] args) {
		 
		Airplane airplane = new Airplane();
		
		airplane.takeOff();
		airplane.land();
		airplane.fly();
		
		SuperSonicAirplane ac= new SuperSonicAirplane();
		 
		System.out.println();
		ac.takeOff();
		ac.fly();
		ac.flyMODE = SuperSonicAirplane.SUPERSONIC;
		ac.fly();
		ac.flyMODE = SuperSonicAirplane.NORMAL;
		ac.fly();
		ac.land();
		
		

	}

}
