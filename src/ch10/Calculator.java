package ch10;

import java.util.Scanner;

public class Calculator {
	
	Scanner sc = new Scanner(System.in);
	
	public Calculator() {
		
	}
	
	public void plus() throws InputMismatchException {
		String a = sc.next();
		String b = sc.next();
		try {
		int result = Integer.parseInt(a) + Integer.parseInt(b);
		System.out.println("두 수의 합은 : " + result);
		}
		catch (Exception e) {
			throw new InputMismatchException("정수를 입력하세요");
		}
	}
	
	public void minus() throws InputMismatchException {
		String a = sc.next();
		String b = sc.next();
		try {
		int result = Integer.parseInt(a) - Integer.parseInt(b);
		System.out.println("두 수의 차는 : " + result);
		}
		catch (Exception e) {
			throw new InputMismatchException("정수를 입력하세요");
		}
	}
	
	public void multi() throws InputMismatchException {
		String a = sc.next();
		String b = sc.next();
		try {
		int result = Integer.parseInt(a) * Integer.parseInt(b);
		System.out.println("두 수의 곱은 : " + result);
		}
		catch (Exception e) {
			throw new InputMismatchException("정수를 입력하세요");
		}
	}
	
	public void div() throws InputMismatchException {
		String a = sc.next();
		String b = sc.next();
		try {
		Double result = Double.parseDouble(a) / Double.parseDouble(b);
		System.out.println("두 수의 나눗셈은 : " + result);
		}
		catch (Exception e) {
			throw new InputMismatchException("정수를 입력하세요");
		}
	}
}
