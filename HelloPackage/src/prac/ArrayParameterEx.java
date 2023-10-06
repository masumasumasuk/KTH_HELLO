package prac;

public class ArrayParameterEx {
	static void replaceSpace(char a[]) {
		for(int i=0; i<a.length; i++) {
			if(a[i] == ' ') 
				a[i] = ',';
		}
}
	static void printCharArray(char a[]) {
		int i = 0;
		for(i=0; i<a.length; i++) {
			System.out.print(a[i]);
		}										//for-each 구문으로 연습
		System.out.println("");
	}
	public static void main (String[] args) {
		char c[] = {'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.'};
		printCharArray(c);
		replaceSpace(c);
		printCharArray(c);
		}
	
	}
