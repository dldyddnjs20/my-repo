import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exam102_class_FunctionPackage3 {
	public static void main(String[] args) {
		
//		List<String> list = Arrays.asList("�̿��","������","������","������","���ÿ�","���ֶ�");
		
		//����ó��
		
//		Stream<String> stream = list.stream();
//		stream.forEach(Exam102_class_FunctionPackage3::print); //�޼ҵ� ���� �����ٰ� ����
//		stream.forEach(s -> print(s));
		
		
		
		IntStream intStream = new Random().ints(1,46);
		intStream.filter(i-> i==30).limit(30).forEach(System.out::println);
//		intStream.distinct().limit(6).sorted().forEach(System.out::println);
	}
	
	public static void print(String str) {
		System.out.println(str + ":" + Thread.currentThread().getName());
	}

}
