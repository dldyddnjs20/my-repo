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
		System.out.println("����� �̸��� �Է��ϼ���=");
		name = sc.next();
		System.out.println("����� ���̸� �Է��ϼ���=");
		age = sc.nextInt();
		System.out.println("����� Ű�� �Է��ϼ���=");
		height = sc.nextDouble();
		System.out.println("����� �����Ը� �Է��ϼ���=");
		weight= sc.nextFloat();
		
		//bmi_index = ������/Ű�� meter �������� ����
		bmi_tmp = (float) height/100;
		bmi_index = weight/(bmi_tmp*bmi_tmp);

        if (bmi_index >= 30) {

            bmi="��.";

        } 
        else if (bmi_index >= 25 && bmi_index < 30) {

            bmi="������.";

        } 
        else if (bmi_index >= 20 && bmi_index < 25) {

            bmi ="����.";

        } 
        else {

            bmi ="��ü��.";

     }
		
		System.out.printf("%s���� ���̴� %d�� Ű�� %.1f �����Դ� %.1f �Դϴ�. \n", name, age, height, weight);
		System.out.printf("����غ��� ����� BMI ġ���� = %.1f �Դϴ�.���� %s�Դϴ�. \n", bmi_index, bmi);

	}
}
