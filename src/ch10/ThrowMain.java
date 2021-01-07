package ch10;

public class ThrowMain {
	
	public static void main(String [] args) {
		
		try {
			System.out.println("----- main 메서드 try 영역 시작 -----");
			method1();
//			String data1 = args[0];
//			String data2 = args[1];
//			int value1 = Integer.parseInt(data1);
//			int value2 = Integer.parseInt(data2);
//			int result = value1 + value2;
//			System.out.println(data1 + " + " + data2 + " = " + result);
			System.out.println("----- main 메서드 try 영역 종료 -----");
		}
		catch (Exception e) {
			System.out.println("오류가 발생했습니다.");
		}
	}
	
	public static void method1() {
		try {
		String data1 = "100";
		String data2 = "a100";
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		int result = value1 + value2;
		System.out.println(data1 + " + " + data2 + " = " + result);
		}
		catch (NumberFormatException e) {
			System.out.println("method1 에서 예외 처리");
		}
	}
	
	public static int method2(String data) throws NumberFormatException {
		int result = Integer.parseInt(data);
		return result;
	}
}
