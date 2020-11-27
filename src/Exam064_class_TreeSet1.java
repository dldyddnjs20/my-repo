import java.util.Set;
import java.util.TreeSet;





public class Exam064_class_TreeSet1 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();

		String from = "b";
		String to = "d";

		set.add("abc"); set.add("bts"); set.add("big_bang");
		set.add("red_valbet"); set.add("brown"); set.add("zebra");
		set.add("golia"); set.add("wax"); set.add("tamberin");

		System.out.println(set);
		System.out.println("range from to"+from+"to "+ to);
		System.out.println("Result 1: " + set.subSet(from, to));
		System.out.println("Result 2: " + set.subSet(from,  "zzz"));
		System.out.println(set.headSet("red"));
		System.out.println(set.tailSet("red"));

	}

}
