
public class Exam011 {
	public static void main(String [] args) {
		Car c1 = new Car();
//		c1.color = "white";
//		c1.gearType = "auto";
//		c1.door = 4;
//		c1.kinds = "suv";
		
		Car c2 = new Car("black","gear",4,"경차");
		System.out.println("c1의 색깔은"+c1.color+" 기어타입은"+c1.gearType+" 문의갯수는"+c1.door+" 차의 종류는"+c1.kinds);
		System.out.println("c2의 색깔은"+c2.color+" 기어타입은"+c2.gearType+" 문의갯수는"+c2.door+" 차의 종류는"+c2.kinds);
		
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