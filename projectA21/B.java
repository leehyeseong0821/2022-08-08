package projectA21;

public class B extends A{
	
	public B() {
		System.out.println("생성자B()");
	}
    public B(int x) {
//    	super(x);쓰면 2개다 출력
    	System.out.println("매게변수생성자 B(int x)");
    }

}
