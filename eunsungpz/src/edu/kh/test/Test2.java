package edu.kh.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		List<String>nameList =new ArrayList<String>();
	while(true) {
		System.out.println("�߰����̸� �߰�");
		String name =sc.next();
		if(name.equals("clear") ) { //1��° ���� ==�� �ƴ϶� .equals ������ؾ���
			System.out.println("�̸������ �ʱ�ȭ");
			nameList.clear();//2��° ���� continue�� ������ ���� �ʱ�ȭ�� �׷��� �ǵڿ� �������.
			continue;
		}
		if(name.equals("exit")) {		
			System.out.println("�Է�����");
				break; //exit�� �Էµ� ��� �Ʒ� ��� ������ main�Լ��� ������ Ż���ع����ٱ׷��⶧���� return�̾ƴ϶� break������ؾ��Ѵ�..3��°����
		}
		if(nameList.contains(name)) {
			System.out.println("�̹������ϴ��̸�");
		}else {
			nameList.add(name);//4��°���� �̸� ��Ͽ�(nameList)�̸��� �߰��ϴ� ���� �ڵ��� �������� ���� �߰����� ���� .
			System.out.println(name+"�߰� �Ϸ�");
		}
	  }  
   }
}
