package projectA24;
     
 class Person{
	 
 }
 class Student extends Person{
	 
 }
 
 class Researcher extends Person{
	 
 }
 
 class Proffesor extends Researcher{
	 
 }

public class projectA1111 {
	static void print(Person p) {
		if(p instanceof Person) {
			System.out.print("Person");
		}
		if(p instanceof Student) {
			System.out.print("Student");
		}
		if(p instanceof Researcher) {
			System.out.print("Reseracher");
		}
		if(p instanceof Proffesor) {
			System.out.print("Proffesor");
		}
		System.out.println();
	}

	
	
	
	
	
	
	public static void main(String[] args) {
		 System.out.print("new Student()->\t");
		 print (new Student());
		 System.out.print("new Researcher()->\t");
		 print (new Researcher());
		 System.out.print("new Proffesor()->\t");
		 print (new Proffesor());
		
		

	}

}
