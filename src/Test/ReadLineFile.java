package Test;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//자바 프로그램 실습
//읽어 드린 단어장을 가지고 Hashmap을 만드시고 단어를 입력 받아 뜻을출력하는 프로그램을 만드세요
//이어서 만든 hashmap에서 랜덤으로 문제 5개를 뽑아 뜻을 먼저 표시한후 영어 단어를 맞추는 프로그램 작성


public class ReadLineFile {
	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(System.in);
		HashMap<String, String>h = new HashMap<String,String>();
		
		File file = new File ("C:\\단어장.txt");
		
		if (file.exists()) {
			BufferedReader inFile = new BufferedReader(new FileReader(file));
			String strLine = null;
			while((strLine = inFile.readLine()) !=null) {
				String[] lyw = strLine.split(" +");
				System.out.println(lyw[0]+" : "+ lyw[1]);
				h.put(lyw[0], lyw[1]);
				
			}
				
			
			inFile.close();
		}
		
		System.out.println("영어 단어를 입력하세요");
		String n = in.next();
		
	}

}
