enum Direction { EAST(1,">"), SOUTH(2,"v"), WEST(3,"<"), NORTH(4,"^");
	private static final Direction[] Darr= Direction.values();
	private final int value;
	private final String  symbol;
	
	Direction(int value, String symbol){
		this.value = value;
		this.symbol =symbol;
	}
	public int getValue() { return this.value;}
	public String getSymbol() { return this.symbol;}
	
	public static Direction of(int dir) {
		if (dir <1 || dir >4)
			throw new IllegalArgumentException("Invalid value: "+ dir);
		
		return Darr[dir-1];
	}
	
	public Direction rotate(int num) {
		num = num %4;
		
		if(num < 0) num +=4;
		return Darr[(value-1+num)%4];
	}
	
	public String toString() {
		return name()+getSymbol();
	}
} 

public class Exam075_class_enum {
	public static void main(String[] args) {
		for(Direction d : Direction.values())
			System.out.printf("%s=%d%s%n",d.name(),d.getValue(),d.getSymbol());
		
		Direction d1 = Direction.EAST;
		Direction d2 = Direction.of(1);
		
		System.out.println(d1==d2);
		
		System.out.println(Direction.EAST.rotate(0));
	}

}


