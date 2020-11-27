package lyw01;

import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
public class tietanic{
	public static void main(String[] args) {
		int first, end;
		int Weight_max = 150;
		int n = 10;
		int[] vote_people = {86,95, 107, 67, 38, 49, 116, 22, 78, 53};
		int count = 0;
		List lst = new ArrayList();
		for(int i=0;i <vote_people.length; i++) {
			lst.add(vote_people[i]);
		}
		Collections.sort(lst);
		System.out.println(lst);
		System.out.println("=> 침몰하는 타이타닉 보트수 구하기 <=");
		System.out.println("n: "+n+" vote_people: "+Weight_max);

		while (lst.size()!=0) {
			if (lst.size() == 1){
				count += 1;	
				break;
			}
			first=(int) lst.get(0);
			end=(int) lst.get(lst.size()-1);
			if (first + end >Weight_max) {
				count += 1;
				lst.remove(lst.size()-1);

			}else {
				count+=1;
				lst.remove(0);
				lst.remove(lst.size()-1);
			}// end-if

		}
		System.out.println("필요한 보트의 최소량은 " + count + "대 입니다.");

	}
}
