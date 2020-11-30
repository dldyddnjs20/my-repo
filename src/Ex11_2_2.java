import java.util.*;
import java.util.concurrent.CountDownLatch;

class Ex11_2_2 {
	public static void main(String[] args) {
		int first, end;
//		int n=5, weight_limit=140;
//		int[] weight= {90,50,70,100,60};
		int n=10, weight_limit=150;
		int[] weight= {86,95,107,67,38,49,116,22,78,53};

		List lst = new ArrayList();

		for (int i=0; i < weight.length ; i++) 
			lst.add(weight[i]);

		Collections.sort(lst);
		System.out.println(lst);
		System.out.println("=>침몰하는 타이타닉 보트수 구하기<=");
		System.out.println("n: "+n+" weight_limit:"+weight_limit);
		
		int cnt = 0;
		while (lst.size()!=0) {
			if (lst.size() ==1 ) { cnt +=1; break; }
			first=(int) lst.get(0);
			end=(int) lst.get(lst.size()-1);
			if (first + end  > weight_limit ) 
			{
				cnt +=1;
				lst.remove(lst.size()-1);
			} else {
				cnt +=1;
				lst.remove(0);
				lst.remove(lst.size()-1);
			} // end-if

		} // end-while
		
		System.out.println("필요한 보트의 최소량은 "+cnt+"대 입니다.");
	}
}