
public class Exam011 {
	public static void main(String [] args) {
		Car c1 = new Car();
//		c1.color = "white";
//		c1.gearType = "auto";
//		c1.door = 4;
//		c1.kinds = "suv";
		
		Car c2 = new Car("black","gear",4,"����");
		System.out.println("c1�� ������"+c1.color+" ���Ÿ����"+c1.gearType+" ���ǰ�����"+c1.door+" ���� ������"+c1.kinds);
		System.out.println("c2�� ������"+c2.color+" ���Ÿ����"+c2.gearType+" ���ǰ�����"+c2.door+" ���� ������"+c2.kinds);
		
	}
}

class Car {
	String color;
	String gearType;
	String kinds;
	int door;
	

	Car() {
		this("white", "Auto", 4, "suv");
	}
	
	Car(String c, String g, int d, String k){
		color = c;
		gearType = g;
		door = d;
		kinds = k;
	}
}