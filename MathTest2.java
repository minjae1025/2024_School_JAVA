package MathClass;

import java.util.*;

public class MathTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = (int)(Math.random()*100);
		for (int i = 0; i<5; i++) {
			System.out.print("숫자 입력(0~99)? ");
			int user = sc.nextInt();
			if (num == user) {
				System.out.println("***** 축하합니다. *****");
				break;
			}
			else {
				if (user > num) {
					System.out.println(">>> 너무 큽니다.("+(i+1)+"회)");
				}
				else if (user < num) {
					System.out.println(">>> 너무 작습니다.("+(i+1)+"회)");
				}
			}
		}
	}

}
