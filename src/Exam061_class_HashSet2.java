import java.util.Set;
import java.util.TreeSet;





public class Exam061_class_HashSet2 {
	public static void main(String[] args) {
		Set set = new TreeSet();
		
		for (int i=0; set.size()<6; i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(num);
		}
		
		System.out.println(set);
//		List list = new LinkedList(set);
//		Collections.sort(list);
//		System.out.println(list);
	
	}

}



