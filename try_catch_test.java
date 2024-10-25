package test;

import java.util.*;

public class try_catch_test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("아무거나 입력해 보십시오 : ");
		InputMismatchTest();
	}
	public static void InputMismatchTest() { 
		Scanner sc = new Scanner(System.in);
		int temp;
		while (true) {
			try {
				temp = sc.nextInt();
				System.out.println("정수입니다.");
		        break;
		    } catch (InputMismatchException e) {
		        sc.nextLine(); // 잘못된 입력을 버퍼에서 제거
		        System.out.println("입력한 것은 실수이거나 문자입니다.");
		    }	
		}
	}
}
