package learning;

public class SimpleCalculator {
	private double firstNumber;
	private double secondNumber;
	public double getFirstNumber() {
		return firstNumber;
	}
	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}
	public double getSecondNumber() {
		return secondNumber;
	}
	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}
	public double getAddition() {
		return firstNumber+secondNumber;
	}
	public double getSubtraction() {
		return firstNumber-secondNumber;
	}
	public double getMultiplication() {
		return firstNumber*secondNumber;
	}
	public double getDevision() {
		if(secondNumber==0) {
			return 0;
		}else {
		return firstNumber/secondNumber;
	}
	}
}
