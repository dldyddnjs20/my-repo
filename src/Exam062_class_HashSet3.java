import java.util.HashSet;
import java.util.Iterator;



public class Exam062_class_HashSet3 {
	public static void main(String[] args) {
		HashSet setA = new HashSet();
		HashSet setB = new HashSet();
		HashSet setHap = new HashSet();
		HashSet setKyo = new HashSet();
		HashSet setCha = new HashSet();
		
		for( int i=1; i<=5; i++)
			setA.add(i+"");
		setB.add("4"); setB.add("5"); setB.add("6");
		setB.add("7"); setB.add("8"); setB.add("9");
		
		System.out.println("setA= "+setA);
		System.out.println("setB= "+setB);
		
		Iterator it = setB.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if (setA.contains(tmp)) setKyo.add(tmp);
			
		}
		System.out.println("A ¡û B: "+setKyo);
//		setA.retainAll(setB);
//		System.out.println("A ¡û B: "+setA);
		
		it = setA.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if (!setB.contains(tmp)) setCha.add(tmp);
			
		}
		System.out.println("A - B: "+ setCha);
//		setA.removeAll(setB);
//		System.out.println("A - B: "+ setA);
		
		it = setA.iterator();
		while(it.hasNext()) {
			setHap.add(it.next());
			
		}
		it = setB.iterator();
		while(it.hasNext()) {
			setHap.add(it.next());
			
		}
//		setA.addAll(setB);
//		System.out.println("A + B: "+setA);
		System.out.println("A + B: "+setHap);
		
	}
}
	



