import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exam102_class_FunctionPackage3 {
	public static void main(String[] args) {
		
//		List<String> list = Arrays.asList("이용원","고은서","정원준","김혜은","이택영","김휘람");
		
		//순차처리
		
//		Stream<String> stream = list.stream();
//		stream.forEach(Exam102_class_FunctionPackage3::print); //메소드 참조 위에줄과 같음
//		stream.forEach(s -> print(s));
		
		
		
		IntStream intStream = new Random().ints(1,46);
		intStream.filter(i-> i==30).limit(30).forEach(System.out::println);
//		intStream.distinct().limit(6).sorted().forEach(System.out::println);
	}
	
	public static void print(String str) {
		System.out.println(str + ":" + Thread.currentThread().getName());
	}

}
