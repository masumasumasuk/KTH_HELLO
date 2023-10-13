package Prac;
import java.util.Scanner;

class Get {
	Scanner scanner = new Scanner(System.in);
	
	public int Num;
	public String Name;
	public String Phone;
	public String Search;
	
	public Get() {
	}
	
	public String getName() {
		return Name = scanner.next() ;
	}
	
	public String getPhone() {
		Phone = scanner.next();
		return Phone ;
	}
	
	public int getNum() {
		Num = scanner.nextInt();
		return Num ;
	}
	
	public String getSearch() {
		Search = scanner.next();
		return Search;
	}
}

class Save {
	String info;
	
	public Save(String info) {
		this.info = info;
	}
	
	public String info() {
		return info;
	}
}

public class PhoneBook {

	public static void main(String[] args) {
		Get get = new Get();
		int num;
		String name;
		String phone;
		String search;
		
		Save[] nameSave;
		Save[] phoneSave;
		
		System.out.println("Number of Person");
		num = get.getNum();
		
		nameSave = new Save[num];
		phoneSave = new Save[num];
		
		for(int i=0; i<num; i++) {
			System.out.println("Name and Phomenumber ex) 홍길동 010-1234-5678");
			name = get.getName();
			phone = get.getPhone();
			
			nameSave[i] = new Save(name);
			phoneSave[i] = new Save(phone);
		}
		
		System.out.println("Store Done");
			
		boolean a = true;
		while(a) {
			System.out.print("Name to search >> ");
			search = get.getSearch();
			
			if(search.equals("stop")) {
				a = false;
			} else {
				boolean result = false;
				for (int i = 0; i < nameSave.length; i++) {
					if(nameSave[i].info.equals(search)) {
						System.out.println(nameSave[i].info + " 's number is " + phoneSave[i].info);
						result = true;
					}
				}
				if(result == false) System.out.println(search + " not found");
			}
		}
	}
}
