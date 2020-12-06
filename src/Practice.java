
public class Practice {
	public static void main(String [] args) {
		Car3 c1 = new Car3();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		c1.kinds = "suv";
		
		Car3 c2 = new Car3("black","gear",4,"경차");
		System.out.println("c1의 색깔은"+c1.color+" 기어타입은"+c1.gearType+" 문의갯수는"+c1.door+" 차의 종류는"+c1.kinds);
		System.out.println("c2의 색깔은"+c2.color+" 기어타입은"+c2.gearType+" 문의갯수는"+c2.door+" 차의 종류는"+c2.kinds);
		
	}
}

class Car3 {
	String color;
	String gearType;
	String kinds;
	int door;
	
	Car3() {}
	
	Car3(String c, String g, int d, String k){
		color = c;
		gearType = g;
		door = d;
		kinds = k;
	}
}