import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;



public class Exam054_class_Queue2 {
	public static void main(String[] args) {
		String[] strArr = {"cat","Monkey","tiger","dog","elephant"};

		Arrays.sort(strArr);
		System.out.println(Arrays.toString(strArr));

		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
		System.out.println(Arrays.toString(strArr));

		Arrays.sort(strArr, Collections.reverseOrder());
		System.out.println(Arrays.toString(strArr));

		Arrays.sort(strArr, new Descending());
		System.out.println(Arrays.toString(strArr));
	}

}
class Descending implements Comparator{
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable) o1;
			Comparable c2 = (Comparable) o2;
			return c1.compareTo(c2)*-1;

		}
		return -1;
	}

}

