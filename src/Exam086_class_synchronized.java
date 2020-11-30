public class Exam086_class_synchronized{

	public static void main(String[] args) {
		Runnable r = new RunnableEx86();

		Thread th1 = new Thread(r);
		th1.start();
		new Thread(r).start();

	}
}

class Account{
	private int balance = 1000;

	public synchronized int getBalance() {
		try {Thread.sleep(300);} catch (InterruptedException e) {}
		return this.balance;
	}

	public synchronized void withdraw(int money) {
		if (balance < money) {
			try {wait();} catch (InterruptedException e) {}
		}
		balance -=money;
	}
	
	public synchronized void deposit (int money) {
		if (money > 0) {
			balance += money;
			notify();}
	}
}

class RunnableEx86 implements Runnable{
	Account acc = new Account();

	public void run() {
		while (acc.getBalance()>0) {
			int money = (int) (Math.random()*2 +1) *100;
			acc.deposit(money);
			System.out.println("현재 입금 후 잔액은 "+acc.getBalance());
			
			money = (int) (Math.random()*3 +1) *100;
			System.out.println("출금액"+money);
			acc.withdraw(money);
			System.err.println("출금 후 잔액은 " + acc.getBalance());

		}
	}
}