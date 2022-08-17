package projectA23;



class Person{
	 String name;
	 String id;
	 public Person(String name) {
		 this.name=name;
	 }
	
 }
 
 class Student extends Person{
	 String grade;
	 String department;
	 public Student(String name) {
		 super(name);
	 }
	 
 }



public class projectA1110 {

	public static void main(String[] args) {
		Person p;
		Student s= new Student("이혜성");
		System.out.println(s.name);
		
		Person p1=new Student("척준경");
		Student s1;
		s1=(Student)p1;
		s1.grade="A";
		s1.department="컴퓨터";
		System.out.println(s1.name);
		System.out.println(s1.grade);
		System.out.println(s1.department);
		
		

	}

}
