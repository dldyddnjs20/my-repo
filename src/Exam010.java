
public class Exam010 {
	public static void main(String [] args) {
		Radio r;
		r = new Radio();
		r.channel = 8;
		r.channelDown();
		System.out.println("현재 채널위치는"+r.channel+"입니다.");
		System.out.println("현재 라디오상태는"+r.power+"입니다.");
		r.power();
		System.out.println("현재 라디오상태는"+r.power+"입니다.");
	}
}

class Radio{
	String color;
	boolean power;
	int channel;
	
	void power() {power =!power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}
