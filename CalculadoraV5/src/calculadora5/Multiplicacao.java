package calculadora5;

public class Multiplicacao implements IOperacao{
	
	private double num1, num2;
	
	@Override
	public double calcula() {
		double multiplicacao = num1 * num2;
		return multiplicacao;
	}

	public double getNum1() {
		return num1;
	}
	@Override
	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}
	@Override
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	
}
