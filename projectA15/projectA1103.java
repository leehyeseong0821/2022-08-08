package projectA15;

 class Student extends Person{
	 private String work;
	 
	 public String getWork(){
		 return work;
		 
	 }
	 
	 public void setWork(String work) {
		 this.work=work;
	 }
	 	 public void sayAge() {
	 		int age=super.getAge();
	 		System.out.println("나이는 "+age+"세입니다.");
	 	 }
	 	 
	 	 @Override
	 	public String toString() {
	 return "이름:"+super.name+"Part:"+this.part+"하는일:"+this.work;
	 	}
	 
 }
class StudentWork extends Student {
	 @Override
	public String toString() {
		
		return super.toString();
	}
	
	
}
 
 
public class projectA1103 {

	public static void main(String[] args) {
		Person person = new Person();
		person.name="이혜성";
		person.part="강사";
		
		
		Student student = new Student();
		
		student.name="이혜성";
		student.part="강사";
		student.setAge(20);
		student.setWork("공부");
		System.out.println(student);
		student.sayAge();
		
	   StudentWork studentwork = new StudentWork();
	   
	   studentwork.name="김지영";
	   studentwork.part="학생";
	   studentwork.setAge(30);
	   studentwork.setWork("공부");
	   System.out.println(studentwork);
	   studentwork.sayAge();
		

	}

}
