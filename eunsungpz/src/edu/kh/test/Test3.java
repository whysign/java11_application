package edu.kh.test;

import java.util.ArrayList;
import java.util.List;
public class Test3 {
	public static void main(String[] args) {
		List<Integer>List =new ArrayList<>();//List<Integer> List =null;  ù°���� :list ���� �����Ƿ� ��ü ������ �Ǿ� ���� �ʾ� NullPointerException�� �߻�
		List.add(4);
		List.add(-5);
		List.add(0);
		List.add(-3);
		List.add(2);
		List.add(1);//List.add(1.23456); �ι�° ���� : List�� ����� ����� ������Ÿ���� Integer�� �����Ǿ������Ƿ� ������ �Է°����ϹǷ� ������ Ÿ�� ������ ���� .
		
		for(int num :List) {
			char ch;
			
			if(num<0) {	//if(num<=0) ����° ���� : if ���� ���ǿ��� 0�� �����Ͽ� �������  ǥ�� �����Ƿ�  0�̿��� ������ �߻��ϰ� ,0�� ����� ���������� ó���Ǿ����  else���� ������� �ʴ� ���� �߻� 
				ch='-';
			}else if(num>0) {
				ch='+';
			}else {
				System.out.println("@@@@@@@");
				continue;
			}
			//int math.abs(num)(����): ������ ���밪�� ��ȯ
			for(int i=1 ; i<=Math.abs(num);i++) {//for(int i=1 ; i<Math.abs(num);i++) 4��° ���� :for �ݺ����� ���� ������ �ش� ���ڸ� �����ϴ� ���� �ƴ� ���� �������� �����ϰ� �Ǿ� �ش� ������ Ƚ�� ��ŭ ��ȣ�� ����ؾ� �Ǵµ� �� ���� �� ��µ� 
				System.out.println(ch); // +++ ----
			}
			System.out.println();
		}
	}
}
