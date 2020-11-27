import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;





public class Exam072_class_GenericType {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("이용원1",15,10));
		list.add(new Student("이용원2",14,11));
		list.add(new Student("이용원3",12,12));
		list.add(new Student("이용원4",11,13));
		list.add(new Student("이용원5",16,14));
		
		System.out.println(list);
		Iterator<Student> it = list.iterator();
		while (it.hasNext()) {
			Student s = it.next();
//			

			
			System.out.printf("%s      %d     %d  \n",s.name,s.grade,s.no);
			
		}
		
	}

}

class Student{
	String name = "";
	int grade;
	int no;
	
	Student(String name, int grade, int no){
		this.name = name;
		this.grade = grade;
		this.no = no;
	}
}
