package calculadora4;

public class Soma {
	
	private double num1, num2;
	
	public double calcularSoma() {
		double soma = num1 + num2;
		return soma;
	}
	
	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}
}
