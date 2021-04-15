
public class Calc {
	public int add(int num1, int num2){
		return num1 + num2;
	}
	public int min(int num1, int num2){
		return(num1 < num2)?num1:num2;
	}
	public int div(int num1,int num2){
		if(num2==0)
			throw new ArithmeticException("div by zero");
		return num1/num2;
	}
}
