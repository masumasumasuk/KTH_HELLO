package hello;

import java.util.Scanner;

public class ChangeMoneyHW2 {

	public static void main(String[] args) {
		int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};	// cash unit	
		int[] count = new int[9];										// 지폐 개수 배열
		
		System.out.print("Input Price(WON) : ");
		Scanner scanner = new Scanner(System.in);
		int IN = scanner.nextInt();										// input price 읽기
		int i=0;
		
		for(i=0 ; i < unit.length ; i++) {
			count[i] = IN / unit[i] ;									// count 배열에 unit의 지폐 개수 저장
			IN = IN % unit[i];											// 다음 연산을 위해 거스른 돈 제거
		}
		
		for(i=0 ; i < unit.length ; i++) {
				System.out.print(unit[i]+" : "+count[i]);				// 지폐 고액권부터 차례대로 개수 출력
				System.out.println(" ");
		}
	}
 
}
