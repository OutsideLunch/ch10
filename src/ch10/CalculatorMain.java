package ch10;

public class CalculatorMain {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		try {
			cal.div();
		}
		catch (InputMismatchException e) {
			
			e.printStackTrace();
		}
	}

}
