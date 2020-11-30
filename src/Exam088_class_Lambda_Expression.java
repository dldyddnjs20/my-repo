
@FunctionalInterface
interface Myfuntion {
	public abstract int method(int x,int y);
}

@FunctionalInterface
interface Singlefuntion {
	public abstract int method(int x);
}

@FunctionalInterface
interface Voidfuntion {
	public abstract void method();
}

public class Exam088_class_Lambda_Expression {
	public static void main(String[] args) {
		
		Myfuntion max, sum, mul;
		Singlefuntion squre;
		Voidfuntion message;
		
		max = (a,b) -> a>b ? a:b;
		sum = (a,b) -> a+b;
//		sum = (a,b) -> total(a,b); 위에 sum이랑 똑같음
		mul = (a,b) -> a*b;
		squre = x -> x*x;
		message = () -> System.out.println("void 람다식 출력");
		
		int tmp= max.method(10, 20);
		System.out.println(max.method(4, 7));
		System.out.println(sum.method(5, 7));
		System.out.println(mul.method(4, 7));
		System.out.println(squre.method(5));
		message.method();
		
	}
	
	static int total(int x, int y) {
		return x+y;
	}
}
