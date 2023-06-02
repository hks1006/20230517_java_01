package kh.lclass.test;

import java.util.Scanner;

public class TestExam {
	public static void main(String[] args) {
		new TestExam().printGugudan();
	}
	public void printGugudan() {
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		// dan 이 2-9 사이 정수면
		//구구단
		//아니라면 "2-9사이 정수를 입력해주세요"
		// 반복문, 비교문

		if (dan >= 2 && dan <= 9) {
			for(int times=2; times<=9; times++) {
				System.out.println(dan + " x " + times + " = " + dan * times);
				
			}
		}
		else {
			System.out.println("2-9 사이 정수를 입력해주세요");
		}
	}
}
