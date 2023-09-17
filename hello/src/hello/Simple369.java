package hello;

import java.util.Scanner;

public class Simple369 {
	
	public static void main(String args[])
	{
		System.out.println("1 ~ 99 사이의 숫자를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.next(); 								// 1~99 사이의 숫자 읽기
		
		int Q = n/10; 											// 입력된 숫자의 십의자리수 (0~9)
		int R = n%10;											// 입력된 숫자의 일의자리수 (0~9)

	
		if(Q == 0 && R==0)											// 입력으로 0을 받았을때
			System.out.println("1~99사이의 숫자가 아닙니다.");
		else if(Q == 0 && R%3 == 0)									// 십의자리수가 0이고 일의자리수가 3,6,9인 경우
			System.out.println("박수짝");
		else if(Q%3 == 0 && R%3 == 0)								// 십의자리수가 3,6,9이고 일의자리수가 3,6,9인 경우
			System.out.println("박수짝짝");							
		else if(Q%3 == 0 || R%3 == 0)								// 십의자리수가 3,6,9이거나 일의자리수가 3,6,9인경우
			System.out.println("박수짝");								
		else if(Q%3 != 0 && R%3 != 0)								// 자리수에 3,6,9가 없을때
			System.out.println("NO 369");							
		else														// 1~99 이외의 숫자일때
			System.out.println("1~99사이의 숫자가 아닙니다.");
	}
}
