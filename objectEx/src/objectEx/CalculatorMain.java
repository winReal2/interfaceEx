package objectEx;

public class CalculatorMain {

	public static void main(String[] args) {
		//타입 변수명 = new 타입
		Calculator calc = new Calculator();
		int res = calc.add(5, 3);
		System.out.println("두 수의 합은 : " + res);
	}
		
}
