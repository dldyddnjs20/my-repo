package Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.module.FindException;

public class FileReadChar {
	public static void countChar(String[] args) {
		int CharChar = 0; // ���Ͽ��� char������ �д´�. �ڷ� Ÿ���� ��Ƽ��
		int CharCnt = 0; // �����ִ� ����
		int spaceCnt = 0;// ���Ͽ� ��� �ִ� �����̽� ���ڼ�

		try {
			FileReader fileReader = new FileReader("C:\\Users\\Leeyongwon\\Desktop\\test.txt");
			while((CharChar = fileReader.read())!=-1) {
				if (CharChar == 32) {spaceCnt++;}
				if(CharChar !=32 ) {CharCnt++;}	

			}
			fileReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		System.out.print("\r Test.txt�� �ִ� ������: "+spaceCnt);
		System.out.print("\r Test.txt�� �ִ� ���ڼ���: "+CharCnt);
		System.out.print("\r Test.txt�� �� ���ڼ���(��������): "+(spaceCnt+CharCnt));
	}

}
