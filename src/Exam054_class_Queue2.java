import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;



public class Exam054_class_Queue2 {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 10; // Queue에 최대 5개 까지만 저장하겠다.
	
	public static void main(String[] args) {
		System.out.println("help를 입력하면 도움말을 볼수 있어요.");
		
		while (true) {
			System.out.println(">>");
			try {
				Scanner s = new java.util.Scanner(System.in);
				String input = s.nextLine().trim();
				
				if("".equals(input)) continue;
				if(input.equalsIgnoreCase("q")) {
					System.out.println("프로그램을 종료합니다.......");
					System.exit(0);
				}else if(input.equalsIgnoreCase("help")) {
					System.out.println("help -- 도움말을 보여줍니다. ");
					System.out.println("q or Q key -- 프로그램 종료 ");
					System.out.println("history -- 최근에 입력한 명령어 "+MAX_SIZE+"개 보여줍니다.");
				}else if(input.equalsIgnoreCase("history")) {
					int i=0;
					save(input);
					
					LinkedList tmp = (LinkedList)q;
					ListIterator it = tmp.listIterator();
					
					while (it.hasNext()) 
						System.out.println(++i+"."+it.next());
					}else {
						save(input);
						System.out.println(input);
					}
				}
			 catch (Exception e) {
				System.out.println("입력 오류 발생 했어요.");
			}
		}

	}
	public static void save (String input) {
		if(!"".equals(input))
			q.offer(input); // q.add(); 도가능
		
		if(q.size()>MAX_SIZE)
			q.remove(); // q.pill();
	}

}
