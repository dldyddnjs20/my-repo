class Point extends Object{
	int x;
	int y;
	Point() {}
	Point(int x,int y){
		super();
		this.x=x;
		this.y=y;
	}
}
//상속관계
class Circle extends Point{
	int r;
	// 생성자의 첫줄은 다른생성자를 호출해야한다. 호출을 안하는 경우는 super ()를 해준다
	Circle () {} // default 생성자
	Circle (int x, int y, int r) {
		super(x,y);
//		super(x,y); //부모 생성자
		this.r = r;
	}
}

//포함관계
//class Circle{
//	Point p= new Point();
//	int r;
//}
public class Exam013_class_inheritance_01 {
	public static void main(String[] args) {
		Circle c = new Circle(20,20,100);

		System.out.println("c.x=" + c.x);
		System.out.println("c.y=" + c.y);
		System.out.println("c.r=" + c.r);
		
	}

}
