package Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.module.FindException;

public class FileReadChar {
	public static void countChar(String[] args) {
		int CharChar = 0; // 파일에서 char단위로 읽는다. 자료 타입은 인티져
		int CharCnt = 0; // 파일있는 문자
		int spaceCnt = 0;// 파일에 들어 있는 스페이스 문자수

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
		System.out.print("\r Test.txt에 있는 공백은: "+spaceCnt);
		System.out.print("\r Test.txt에 있는 문자수는: "+CharCnt);
		System.out.print("\r Test.txt에 총 문자수는(공백포함): "+(spaceCnt+CharCnt));
	}

}
