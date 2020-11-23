package lyw01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



public class Princess {
	public static void main(String[] args) {
		int tmp;
		Queue q = new LinkedList();
		Scanner sc = new Scanner(System.in);
		System.out.println("n을 입력하세요");
		int n = sc.nextInt();
		System.out.println("k을 입력하세요");
		int k =sc.nextInt();
		
		System.out.println("n:"+n+"k:"+k);
		
		
		for(int i=1; i<=n; i++) {
			q.offer(i); // 왕자의 수만큼 q만들기
		}
		while (!q.isEmpty()) {
			for (int i=0; i< k-1; i++) {
				tmp = (int)q.poll();
				q.offer(tmp);
			}
			System.out.println("구하는데 탈락한 왕자:"+ q.poll());
			if (q.size()==1) {
				System.out.println("구하러가는 왕자는 :"+q.poll());
				break;
			}
		}
	}

}
