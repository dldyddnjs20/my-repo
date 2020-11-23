import java.util.ArrayList;
import java.util.Collections;

public class Exam050_class_Collections01 {
	public static void main(String[] args) {
		ArrayList list1= new ArrayList(10); // ���� Creation
		list1.add(5); // �̰��� ������ ���� autoboxing ����
		list1.add(4);
		list1.add(2); // ������ �߰� add
		list1.add(0);
		list1.add(1);
		list1.add(3);

		ArrayList list2= new ArrayList(list1.subList(1, 4));

		print(list1, list2);

		System.out.println(list1.get(0)); // read ���
		System.out.println(list1.indexOf(5));// index read
		System.out.println(list2.set(1, 4));
		System.out.println(list2.remove(1));// Delet ���
		System.out.println("size="+list1.size());
		print(list1, list2); // update ���� updates
		list2.add(2);

		System.out.println("������������ �����ϱ�...");
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);
		System.out.println(list1.get(0));
		System.out.println(list1.indexOf(5));// index read

		System.out.println("������������ �����ϱ�...");
		Collections.sort(list1, Collections.reverseOrder());
		Collections.sort(list2, Collections.reverseOrder());
		print(list1, list2);
		list2.add(7);
		System.out.println(list1.containsAll(list2));
		print(list1, list2);
		list2.add("ABC");
		print(list1, list2);
		list2.add(1);
		print(list1, list2);
		list2.add("1");
		print(list1, list2);

		for (int i = list2.size()-1 ;  i>=0; i--) {
			if (list1.contains(list2.get(i))) {
				list2.remove(i);
			}
		print(list1, list2);
		}

	}

	static void print (ArrayList list1, ArrayList list2) {
		System.out.println("list1"+list1);
		System.out.println("list2"+list2);
		System.out.println();
	}

}
