import java.util.HashSet;



public class Exam062_class_HashSet4 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("abc");
		set.add("abc");
		set.add(new Person("Lee", 26));
		set.add(new Person("Lee", 26));
		System.out.println(set);
		
		
	
	}
}
class Person{
	String name;
	int age;
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	

}



