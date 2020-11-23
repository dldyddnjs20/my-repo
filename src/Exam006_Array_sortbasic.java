import java.util.Arrays;

public class Exam006_Array_sortbasic {
	public static void main(String[] args) {
		int[] arr= {4,23,33,15,17,19};
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		for (int i : arr)
			System.out.print(i + " ");
		
		String[] frults = {"apple","orange","kiwi","strawberry","melon"};
		Arrays.sort(frults);
		System.out.println(Arrays.toString(frults));
		for (String i : frults)
			System.out.print(i + " ");
	}
}

