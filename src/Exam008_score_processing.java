import java.util.Scanner;

public class Exam008_score_processing {
	public static void main(String[] args) {
		String[] name;
		int[][] score;
		int total[];
		int studunt_no;
		int [] ranking;
		
		
		Scanner sc = new Scanner(System.in);
		
		// ó���� �л��� �ο����� �Է��Ѵ�.
		do {
			System.out.print("ó���� �л����� =");
			studunt_no=sc.nextInt();
		}while ( studunt_no<1 ||  studunt_no>20);
		
		System.out.println(studunt_no+"���� ����, ����, ���� ������ �Է� �ްڽ��ϴ�.");
		
		name = new String[studunt_no];
		score = new int[studunt_no][3];
		total = new int[studunt_no];
		ranking = new int[studunt_no];
		
		String[] subjects = {"����=>","����=>","����=>"};
		{
		for (int i=0; i<studunt_no; i++) {
			System.out.print("�̸�=>");
			name[i]=sc.next();
			
			for(int j=0; j < subjects.length; j++) {
				System.out.print(subjects[j]);
				score[i][j]=sc.nextInt();
				total[i]+=score[i][j];
			}
			System.out.println();
		}
		
//		��ŷ ���ϴ� �κ��� �� �ܿ켼��. �ڵ� ������ �ܰ� �⿬.
		
		for(int i=0 ; i<studunt_no; i++)
			ranking[i]=1;
		for(int i=0 ; i<studunt_no-1; i++) {
			for (int j=i+1; j<studunt_no; j++) {
				if(total[i] > total[j])
					ranking[j]++;
				else if (total[i]<total[j])
					ranking[i]++;
			}
		}
		
		for( int i=0; i<studunt_no; i++) {
			System.out.print(name[i]+"\t");
			for(int j=0; j<score[i].length; j++) {
				System.out.printf("%8d", score[i][j]);
				}
			System.out.printf("%6d %4.2f %4d \n",total[i],(float)total[i]/subjects.length,ranking[i]);
			}
		}
		
	}

}
