package projectA13;

public class Color extends Point{
	private String color; //점의 ㅅ색
	
	public void setColor(String color) {
		this.color=color;
	}
	
	public void showColorPoint() {
		System.out.println(this.color);
		showPoint();
		
	}

}
