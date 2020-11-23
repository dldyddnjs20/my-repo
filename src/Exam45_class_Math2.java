

public class Exam45_class_Math2 {
	public static void main(String[] args) {
		
		int i = Integer.parseInt("100");
		System.out.println(i);
		try {
			System.out.println(Integer.parseInt("100",2));
			System.out.println(Integer.parseInt("100",10));
			System.out.println(Integer.parseInt("FF",16));
			System.out.println(Integer.parseInt("77",8));
			System.out.println(Integer.parseInt("FF",8));
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}

