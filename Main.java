package learning;

public class Main {

	public static void main(String[] args) {
		SimpleCalculator calculator=new SimpleCalculator();
		calculator.setFirstNumber(5.0);
		calculator.setSecondNumber(4);
		System.out.println("first number is "+calculator.getFirstNumber());
		System.out.println("second number is "+calculator.getSecondNumber());
		System.out.println("the sum is "+calculator.getAddition());
		System.out.println("the sub is "+calculator.getSubtraction());
		calculator.setFirstNumber(5.25);
		calculator.setSecondNumber(0);
		System.out.println("first number is "+calculator.getFirstNumber());
		System.out.println("second number is "+calculator.getSecondNumber());
		System.out.println("the product is "+calculator.getMultiplication());
		System.out.println("the division is "+calculator.getDevision());

	}

}
