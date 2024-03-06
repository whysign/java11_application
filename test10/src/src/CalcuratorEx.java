package src;


public class CalcuratorEx {

	public static void main(String[] args) {
		int num1 =50;
		int num2 =5;
		Arithmatic a1 = new Arithmatic();
		a1.print();
		System.out.println("덧셈 :" +a1.add(num1, num2) );
		System.out.println("뺼셈 :" +a1.subtract(num1, num2));
		System.out.println("곱셈 :" +a1.multiply(num1, num2));
		System.out.println("나눗셈 :" +a1.divide(num1, num2));
		System.out.println("거듭제곱 :" +a1.power(num1, num2));
	}

}
