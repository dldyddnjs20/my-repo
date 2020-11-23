import java.math.BigInteger;

public class Exam003_BigInteger {
	public static void main(String[] args) {
		BigInteger a = BigInteger.valueOf(10_000_000); // 1천만
		BigInteger b = BigInteger.valueOf(20_000_000); // 2천만
		BigInteger c;
		
		c = a.multiply(b);
		System.out.println(c);
	}
}
