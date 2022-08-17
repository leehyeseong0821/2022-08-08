package projectA25;


class Shape{
	public void draw() {
		System.out.println("Shape draw");
	}
}

class Line extends Shape{
	@Override
	public void draw() {
		System.out.println("Line draw");
	}
}

class Rect extends Shape{
	@Override
	public void draw() {
		System.out.println("Rect draw");
	}
}
class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("Circle draw");
	}
}


public class projectA1112 {
	static void paint(Shape p) {
		p.draw();
	}

	public static void main(String[] args) {
//		Line line = new Line();
//		line.draw();
//		Rect rect = new Rect();
//		rect.draw();
//		Circle circle=new Circle();
//		circle.draw();
//		Shape shape=new Shape();
//		shape.draw();
//		
//		Shape sa=new Line();
//		sa.draw();
//		
              Line line = new Line();
              paint(line);
              paint(new Shape());
              paint(new Rect());
              paint(new Circle());
              paint(new Line());
		
	}

}
