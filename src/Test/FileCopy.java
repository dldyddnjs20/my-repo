package Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) throws IOException {
		
		String oriFileName = "C:\\Users\\Leeyongwon\\실습 데이터\\yongwon.jpg";
		String tarFileName = "C:\\Users\\Leeyongwon\\Pictures\\yongwon.jpg";
		
		FileInputStream fis =new FileInputStream(oriFileName); // exe,jpg,mp 파일 다룰때 File
		FileOutputStream fos = new FileOutputStream(tarFileName);
		
		int readByteNo;
		byte[] readBytes = new byte[100];
		while ((readByteNo = fis.read(readBytes))!=-1) {
			fos.write(readBytes,0,readByteNo);
			
		}
		fos.flush(); //반드시 실행 합니다. 
		fis.close();
		fos.close();
		
		System.out.println("화일 복사 완료");
	}

}

// 자바 프로그램 실습
// 읽어 드린 단어장을 가지고 Hashmap을 만드시고 단어를 입력 받아 뜻을출력하는 프로그램을 만드세요
// 이어서 만든 hashmap에서 랜덤으로 문제 5개를 뽑아 뜻을 먼저 표시한후 영어 단어를 맞추는 프로그램 작성
