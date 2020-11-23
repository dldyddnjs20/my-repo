
public class Exam001 {
	public static void printResult (Boolean result) {
		if (result) {
			System.out.println("같습니다. :=)");
		} else {
			System.out.println("다릅니다. :=<" );
		}
	}
	
	public static void main(String[] args) {
		String str1 = "apple";
		String str2 = "apple";
		
		
		String str3 = new String("APPLE");
		String str4 = new String("apple");
		
		System.out.println("str1:"+str1);
		System.out.println("str2:"+str2);
		System.out.println("str3:"+str3);
		System.out.println("str4:"+str4);
		System.out.println();
		
		printResult(str1==str2);
		printResult(str2==str3);
		
		printResult(str2.equalsIgnoreCase(str3));
	}
}
