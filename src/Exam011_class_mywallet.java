
public class Exam011_class_mywallet {
	public static void main(String[] args) {
		MyWallet ann = new MyWallet();
		
	
		
		System.out.println("name : "+ ann.name);
		System.out.println("age : "+ ann.age);
		System.out.println("address : "+ ann.address);
		ann.show_mywallet();
		ann.pay_wallet(30000);
		ann.show_mywallet();
	}
}

class MyWallet{
	// iv �����
	String name;
	int age;
	String address;
	private int wallet;
	
	//������ ����
	public MyWallet() {
		this("������", 22, "���� �����̱�", 54584891);
	}
	public MyWallet(String name, int age, String address, int wallet) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.wallet = wallet;
	}
	void show_mywallet() {
		System.out.println("Mywallet : " + wallet);
	}
	void pay_wallet(int pay) {
		wallet = wallet - pay;
	}
}