package ch10;

public class Throws2Main {

	public static void main(String[] args) {
//		만약 main 메서드에서도 throws를 사용 시 JVM에서 예외 처리를 실행함
		try {
			findClass();
		}
		catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다. (main 메서드에서 오류 처리)");
		}
		catch (NullPointerException e) {
			System.out.println("변환할 수 없습니다. (main 메서드에서 오류 처리)");
		}
	}
	
	public static void findClass() throws ClassNotFoundException {
//		원래 예외가 발생하는 영역에 직접 try / catch 를 사용하여 예외처리를 해야하지만 throws를 사용하게 되면
//		해당 메서드를 호출한 곳에서 try/catch를 사용하여 예외처리를 할 수 있음
		Class clazz = Class.forName("java.lang.String");
//		try {
//		Class clazz = Class.forName("java.lang.String");
//		}
//		catch (ClassNotFoundException e) {
//			System.out.println("클래스가 존재하지 않습니다. (findClass 에서 오류처리)");
//		}
	}
	
	public static void method1() throws NullPointerException {
		String data = null;
		System.out.println(data.toString());
	}

}
