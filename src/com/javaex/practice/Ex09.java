package com.javaex.practice;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			if(num1%num2 == 0){
			System.out.println(num1 + "은(는)" + num2 + "의 약수입니다.");
			} else {
			System.out.println(num1 + "은(는)" + num2 + "의 약가 아닙니다.");
			}
		} else if(num2 > num1) {
			if(num2%num1 == 0) {
				System.out.println(num2 + "은(는)" + num1 + "의 약수입니다.");
			} else {
				System.out.println(num2 + "은(는)" + num1 + "의 약수가 아닙니다.");
			}
		}
		
		sc.close();
	}

}
