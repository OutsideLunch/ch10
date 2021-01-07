package ch10;

import java.util.Scanner;

public abstract class Converter {
	abstract protected double convert(double src);
	abstract protected String srcString();
	abstract protected String destString();
	protected double ratio; // 비율
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(srcString() + "을 " + destString() + "로 바꿉니다.");
	    System.out.print(srcString() + "을 입력하세요>> ");
	    double val = scanner.nextDouble();
	    double res = convert(val);
	    System.out.println("변환 결과: " + res + destString() + "입니다");
	    scanner.close();
	  
	}	
}

// 문제 3) Converter 클래스를 상속받아 원화를 달러로 변환하는 Won2Dollar 클래스를 생성하세요.
// 실행을 위한 main 메서드는 아래와 같음

// 결과
// 원을 달러로 바꿉니다.
// 원을 입력하세요 >> 24000
// 변환 결과 : 20.0달러 입니다.
