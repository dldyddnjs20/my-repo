
class Point1 {
	int x;
	int y;
	
//	String getLocation() {
//		return "x: "+ x + ", y:" + y;
//	}
	public String toString() {
//		System.out.println("x: "+ x + ", y:" + y);
		return "x: "+ x + ", y:" + y;
	}
}

class Point3D extends Point1{
	int z;
	String getLocation() {
		return "x: "+ x + ", y:" + y + ",z: "+z;
		
	}
	
}

public class Exam014_class_overriding {
	public static void main(String[] args) {
		Point1 p = new Point1();
		Point3D p3 = new Point3D();
		p3.x = 10;
		p3.y = 20;
		p3.z = 30;
		p.x = 100;
		p.y = 200;
		
		System.out.println(p3.getLocation());
		System.out.println(p.toString());// 클레스이름 @ 주소 출력
		System.out.println(p);// 프린트엘엔의 기능 
		
	}

}
