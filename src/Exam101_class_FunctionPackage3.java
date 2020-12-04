import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Exam101_class_FunctionPackage3 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i =0; i<10; i++) {
			list.add(i);
		}
		list.forEach(i->System.out.print(i+","));
		
		System.out.println();
		
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.print(it.next()+",");
			
		}
		
		System.out.println();
		
		list.removeIf(xx->xx%2==0 || xx%3==0);
		System.out.println(list);
		
		Map<String, String> map = new HashMap<String,String>();
		map.put("고은서", "010-2462-9119");
		map.put("이용원", "010-2249-3650");
		map.put("이수근", "1588-1588");
		map.put("강호동","010-9988-9988");
		
		map.forEach((k,v) -> System.out.println(k+"의 전화번호는 = "+v));
		
		Iterator<Entry<String, String>> it2 = map.entrySet().iterator();
		
		while (it2.hasNext()) {
			System.out.println(it2.next()+",");
			
			
			
		}
	}

}
