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
		System.out.println("n�� �Է��ϼ���");
		int n = sc.nextInt();
		System.out.println("k�� �Է��ϼ���");
		int k =sc.nextInt();
		
		System.out.println("n:"+n+"k:"+k);
		
		
		for(int i=1; i<=n; i++) {
			q.offer(i); // ������ ����ŭ q�����
		}
		while (!q.isEmpty()) {
			for (int i=0; i< k-1; i++) {
				tmp = (int)q.poll();
				q.offer(tmp);
			}
			System.out.println("���ϴµ� Ż���� ����:"+ q.poll());
			if (q.size()==1) {
				System.out.println("���Ϸ����� ���ڴ� :"+q.poll());
				break;
			}
		}
	}

}
