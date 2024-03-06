package src;

public class CalcExam5 {

	public static void main(String[] args) {
		int num1 =100;
		int num2 =3;
		Repeator rep1;		
		rep1 = new Repeator() {
		
		public int add(int num1, int num2) {
				return num1 + num2;
		}
		
			int power(int num1, int num2) {//2, 3
				int tmp = num1;
				for(int i=1;i<num2;i++) {//1 2 
					num1 = num1 * tmp;
				}
				return num1;
			}
			@Override
			public int multiply(int num1, int num2) {
				// TODO Auto-generated method stub
				return 0;
			}
			@Override
			public int divide(int num1, int num2) {
				// TODO Auto-generated method stub
				return 0;
			}	
	};
	System.out.println("덧셈 :" +rep1.add(num1, num2) );
	System.out.println("뺼셈 :" +rep1.subtract(num1, num2));
	System.out.println("곱셈 :" +rep1.multiply(num1, num2));
	System.out.println("나눗셈 :" +rep1.divide(num1, num2));
	System.out.println("거듭제곱 :" +rep1.power(num1, num2));
  }

}
