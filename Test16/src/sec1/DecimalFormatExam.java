package sec1;

import java.text.DecimalFormat;

//DecimalFormat : ���ڿ� ǥ�������� �����Ͽ� Ȱ���ϴ� Ŭ����
public class DecimalFormatExam {
	public static void main(String[] args) {
		//ǥ�� ���� �ڵ� : 0,# 
		//1234.56 �� ������ ���
		// 0 =>1234 , 0.0=> 1234.5, 000000.00000 => 001234.56000
		// # =>1234 , #.#=> 1234.5, ######.##### => 1234.56
		
		// ,->õ���� ���б�ȣ, E-> ���� ���·� ǥ�� , % -> ����� ǥ��
		//-1234
		//-#, -0 => -1234
		//#-, 0- => 1234-
		//#,##0 = -1,234
		//#E0 => 1.234E+03
		//#% => -123400%
		
		double n = 1234567.89;
		DecimalFormat df1= new DecimalFormat("#,##0.0000");
		DecimalFormat df2= new DecimalFormat("000,000,000.####");
		
		String res1 =df1.format(n);
		String res2 =df2.format(n);
		
		System.out.println("#,##0.0000 ǥ�� :"+res1);
		System.out.println("000,000,000.####ǥ�� :"+res2);
		
	}
}
