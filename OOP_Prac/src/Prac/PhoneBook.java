package Prac;
import java.util.Scanner;

class Get {												// 사람 수, 이름, 전화번호 입력을 받는 scanner class
	Scanner scanner = new Scanner(System.in);
	
	int Num;
	String Info;
	
	public Get() {
	}													// Get constructor
	
	public String getInfo() {
		return Info = scanner.next() ;					// String scanner
	}
	
	public int getNum() {
		return Num = scanner.nextInt();					// Integer scanner
	}
}

class Save {											// 이름, 전화번호를 object array에 저장하기 위한 save 클래스
	String info;
	
	public Save(String info) {
		this.info = info;
	}													// info = 이름, 전화번호 Constructor
	
	public String info() {
		return info;
	}													// info() 호출 시
}

public class PhoneBook {

	public static void main(String[] args) {
		Get get = new Get();
		int num;
		String name;
		String phone;
		String search;
		
		Save[] nameSave;																					// nameSave Object Array 생성
		Save[] phoneSave;																					// phoneSave Object Array 생성
		
		System.out.println("Number of Person");
		num = get.getNum();
		
		nameSave = new Save[num];																			// 입력 받은 사람 수 만큼 Object Array length 설정
		phoneSave = new Save[num];
		
		for(int i=0; i<num; i++) {																			// 이름과 전화번호를 사람 수만큼 반복하여 입력받음, Object Array에 저장
			System.out.println("Name and Phomenumber ex) 홍길동 010-1234-5678");
			name = get.getInfo();																			// String scanner method 호출
			phone = get.getInfo();
			
			nameSave[i] = new Save(name);																	// Object Array 에 저장
			phoneSave[i] = new Save(phone);
		}
		
		System.out.println("Store Done");
			
		boolean a = true;
		while(a) {																							// a = true 이면 무한 반복
			System.out.print("Name to search >> ");
			search = get.getInfo();																			// String scanner method 호출
			
			if(search.equals("stop")) {
				a = false;																					// stop 입력시 a = false ; while문 탈출
			} else {
				boolean result = false;																		
				for (int i = 0; i < nameSave.length; i++) {													// 반복하여 입력받은 이름과 같은 이름이 nameSave[i]에 있는지 비교
					if(nameSave[i].info.equals(search)) {
						System.out.println(nameSave[i].info + " 's number is " + phoneSave[i].info);
						result = true;																		// 같은 이름 발견 시 저장된 내용을 출력해주고 result = true로 바꿈
					}
				}
				if(result == false) System.out.println(search + " not found");								// 같은 이름을 발견하지 못하면 (result = false) 출력 이후 while 문 반복
			}
		}
	}
}
