import java.util.Scanner;
public class Exam002_BMI_calculator {
	public static void main(String[] args) {
		String name;
		int age;
		double height;
		float weight;
		float bmi_index=0;
		float bmi_tmp=0;
		String bmi;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 이름을 입력하세요=");
		name = sc.next();
		System.out.println("당신의 나이를 입력하세요=");
		age = sc.nextInt();
		System.out.println("당신의 키를 입력하세요=");
		height = sc.nextDouble();
		System.out.println("당신의 몸무게를 입력하세요=");
		weight= sc.nextFloat();
		
		//bmi_index = 몸무게/키를 meter 단위변경 제곱
		bmi_tmp = (float) height/100;
		bmi_index = weight/(bmi_tmp*bmi_tmp);

        if (bmi_index >= 30) {

            bmi="비만.";

        } 
        else if (bmi_index >= 25 && bmi_index < 30) {

            bmi="과제충.";

        } 
        else if (bmi_index >= 20 && bmi_index < 25) {

            bmi ="정상.";

        } 
        else {

            bmi ="저체중.";

     }
		
		System.out.printf("%s님의 나이는 %d세 키는 %.1f 몸무게는 %.1f 입니다. \n", name, age, height, weight);
		System.out.printf("계산해보니 당신의 BMI 치수는 = %.1f 입니다.따라서 %s입니다. \n", bmi_index, bmi);

	}
}
