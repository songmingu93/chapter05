package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class PhoneApp {

	public static void main(String[] args) throws IOException{
		
		//파일읽는다.  -->한줄씩  --> 출력
		Reader fr = new FileReader("C:\\javaStudy\\file\\Phone.txt");
		BufferedReader br = new BufferedReader(fr);
		
		List<Person> pList  = new ArrayList<Person>();
		
		String line = "";
		
		while(true) {
			line = br.readLine();  //이효리,010-2222-3333,031-2323-4441
			if(line == null) {
				break;
			}
			
			String[] pInfo = line.split(",");  //new String[3]
			
			String name = pInfo[0];
			String hp = pInfo[1];
			String company = pInfo[2];
			
			Person person = new Person(name, hp, company);
			
			pList.add(person);
		}
		
		for(int i=0; i<pList.size(); i++) {
			System.out.println("이름: " + pList.get(i).getName());
			System.out.println("핸드폰:" + pList.get(i).getHp());
			System.out.println("회사: " + pList.get(i).getCompany());
			System.out.println("");
		}
		
		System.out.println("---------------------------");
		
		System.out.println("정우성정보:"  + pList.get(1).getName() + ", " + pList.get(1).getHp() );
		
		
		//파일저장
		
		
		br.close();

	}

}