import java.util.Scanner;

public class Exam009_random_score_process {
	public static void main(String[] args) {
		String[] name;
		int[][] score;
		int total[];
		int studunt_no;
		int [] ranking;
		
		
		Scanner sc = new Scanner(System.in);
		
		// 처리할 학생의 인원수를 입력한다.
		do {
			System.out.print("처리할 학생수는 =");
			studunt_no=sc.nextInt();
		}while ( studunt_no<1 ||  studunt_no>100);
		
		System.out.println(studunt_no+"명의 국어, 영어, 수학 점수를 랜덤으로 생성합니다.");
		
		name = new String[studunt_no];
		score = new int[studunt_no][3];
		total = new int[studunt_no];
		ranking = new int[studunt_no];
		
		String[] subjects = {"국어=>","영어=>","수학=>"};
		{
		for (int i=0; i<studunt_no; i++) {
			name[i]=Integer.toString(i + 1);
			
			for(int j=0; j < subjects.length; j++) {
				System.out.print(subjects[j]);
				score[i][j]=(int)(Math.random()*51)+50;
				total[i]+=score[i][j];
			}
			System.out.println();
		}
		
//		랭킹 구하는 부분은 꼭 외우세요. 코딩 문제에 단골 출연.
		
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
