
package edu.kh.test;

import java.util.Arrays;
import java.util.Scanner;

public class TestController {
	public void test1() {
		Scanner sc = new Scanner(System.in);
		String[] personArr = new String[5];
		for(int i = 0; i < personArr.length; i++) {
			System.out.print((i+1)+ "��° �ֹι�ȣ �Է� : ");
			String personId = sc.nextLine();
			if((personId.length() == 14)) { 
				char gender = personId.charAt(7); 
				if(gender == '1' || gender == '2' || gender == '3' || gender == '4') {
					personArr[i] = personId.substring(0, 8) + "******";
				} else {
					System.out.println("�߸��� �ֹι�ȣ �����Դϴ�. �ٽ��Է��ϼ���.");
					i--;	
				}
			} else {
				System.out.println("�߸��� �ֹι�ȣ �����Դϴ�. �ٽ��Է��ϼ���.");
				i--;
			}
		}
		System.out.println("--- �ֹι�ȣ ���� ��� �Ϸ� ---");
		System.out.println(Arrays.toString(personArr));
	}
}
