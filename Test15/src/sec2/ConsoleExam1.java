package sec2;

import java.io.Console;
import java.io.IOException;

public class ConsoleExam1 {
	public static void main(String[] args) throws IOException{
		Console con = System.console();
		
		System.out.println("�̸�  : ");
		String name = con.readLine();
		
		System.out.println("���� : ");
		int point = Integer.parseInt(con.readLine());
		
		System.out.println("������ : ");
		double weight = Double.parseDouble(con.readLine());
		
		System.out.println("��й�ȣ : ");
		char[] pwc = con.readPassword();
		String pw =new String(pwc); 	//���ڹ迭�� ���ڿ��� �� ��ȯ
		
		Person p = new Person(name,point,weight);
		System.out.println(p.toString());
		System.out.println("��й�ȣ : "+pw);
		
	}
}
//console ���� scanner�� ������ �̿��Ѵ�.
//console���� ��Ⱑ ��� ���� �Է��� �ð��� ���⶧���̴�.