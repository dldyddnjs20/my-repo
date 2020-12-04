import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class StudentJAVA{
	private String name;
	private int score;
	
	public StudentJAVA(String name, int score) {
		this.name = name;
		this.score = score;
		
	}
	
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
}

public class Exam103_class_FunctionPackage4 {
	public static void main(String[] args) {
		
		List<StudentJAVA> list = Arrays.asList(
				new StudentJAVA("�̿��1", 85),
				new StudentJAVA("�̿��2", 70),
				new StudentJAVA("�̿��3", 50),
				new StudentJAVA("�̿��4", 95),
				new StudentJAVA("�̿��5", 76),
				new StudentJAVA("�̿��6", 100)
				);
		double avg = list.stream().mapToInt(StudentJAVA::getScore).average().getAsDouble();
		System.out.printf("�л����� ����� = %3.2f",avg);

	}

}
