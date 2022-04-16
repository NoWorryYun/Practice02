package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 3개를 입력해주세요.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		System.out.println("가장 작은 수는 ");
		if(num1 < num2 && num1 < num3) {
			System.out.println(num1);
		} else if(num2 < num1 && num2 < num3) {
			System.out.println(num2);
		} else {
			System.out.println(num3);
		}
		
		System.out.println("입니다.");
		sc.close();
	}

}
