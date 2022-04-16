package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
			System.out.println("키와 몸무게를 입력해 주세요.");
			System.out.println("키: ");
			
			double height = sc.nextDouble();
			
			System.out.println("몸무게: ");
			double weight = sc.nextDouble();
		
			double V = (height - 100.0) * 0.9;
			if(V > weight) {
				System.out.println("저체중 입니다.");
			}else if(V == weight) {
				System.out.println("표준체중 입니다.");
			} else {
				System.out.println("과체중 입니다.");
			}
			System.out.println("표준체중" + V);			
		sc.close();
	}

}
