import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;


public class Exam052_class_ArrayList3 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		System.out.println(list);
		
		Iterator iter = list.iterator();
		while(iter.hasNext()) {
			Object obj = iter.next();
			System.out.println(obj);
		}
//		for(int i=0; i < list.size(); i++) {
//			Object obj = list.get(i);
////			System.out.println(list.get(i));
//			System.out.println(obj);
//		}

	}

}
