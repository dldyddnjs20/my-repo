import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;





public class Exam060_class_HashSet {
	public static void main(String[] args) {

		Object[] objs = {"1",1,"2","3","3","4","4"};
		System.out.println(objs);
		Set set = new HashSet();

		for(int i=0;i <objs.length; i++) {
			set.add(objs[i]);
		}
		System.out.println(set);
		
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next()); // 한개 한개씩 내용을 출력
		}

	}

}



