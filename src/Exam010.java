
public class Exam010 {
	public static void main(String [] args) {
		Radio r;
		r = new Radio();
		r.channel = 8;
		r.channelDown();
		System.out.println("���� ä����ġ��"+r.channel+"�Դϴ�.");
		System.out.println("���� �������´�"+r.power+"�Դϴ�.");
		r.power();
		System.out.println("���� �������´�"+r.power+"�Դϴ�.");
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
