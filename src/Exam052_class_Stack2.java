
import java.util.EmptyStackException;
import java.util.Stack;


public class Exam052_class_Stack2 {
	public static void main(String[] args) {
		Stack st = new Stack();
		String expression = "((3+8)*24/(4+8)))";

		System.out.println("expression :"+expression);

		try {
			for( int i =0; i <expression.length(); i++) {
				char ch = expression.charAt(i);
				System.out.print(ch);
				if ( ch =='(') {
					st.push(ch);
				}else if(ch==')') {
					st.pop();
				}
			}
			if(st.isEmpty()) {
				System.out.println("������ ��ȣ�� ��Ȯ�մϴ�.");
			}else {
				System.out.println("###������ ��ȣ�� ����Ȯ �մϴ�.###");
			}

		}catch (EmptyStackException e) {
			System.out.println("������ ��ȣ�� ����Ȯ �մϴ�.");
		}
	}

}
