@FunctionalInterface
interface MyFunction91{
	void run();
}


public class Exam91_class_lamdba {
	
	static void execute(MyFunction91 f) {
		f.run();
	}
	
	static MyFunction91 getMyFunction() {
		MyFunction91 f = () -> System.out.println("f3.run()");
		return f;
	}
	
	public static void main(String[] args) {
		
		MyFunction91 f1 = () -> System.out.println("f1.run()");
		
		MyFunction91 f2 = new MyFunction91() {
			
			@Override
			public void run() {
				System.out.println("f2.run()");
				
			}
		};
		f1.run();
		f2.run();

		MyFunction91 f3 = getMyFunction(); // MyFunction91 f3=f
		f3.run();
		
		execute(f3);
		execute(() -> System.out.println("run()"));
		
	}

}
