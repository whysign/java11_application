
package edu.kh.test;

import java.util.ArrayList;
import java.util.List;

public class Test5 {

	public static void main(String[] args) {
		
		List<Fruit> list = new ArrayList<>();
		list.add(new Fruit("���", "����"));
		list.add(new Fruit("�޷�", "�ʷ�"));
		list.add(new Fruit("����", "����"));
		list.add(new Fruit("�ٳ���", "���")); //list.add("�ٳ���");	//list(ArrayList)�� ���׸� Ÿ���� Fruit�� �����Ǿ� �����Ƿ� Fruit���� ��ü�� �����Ͽ� ��Ҹ� �߰��ؾ� ������, �ڵ忡�� String�� ��ҷ� �߰��Ͽ���. => Type MisMatch Error �߻� 
 
		for(int i = 0; i < list.size(); i++) { //for(int i = 0; i < list.length; i++) { //list(ArrayList) �÷��� �����ӿ�ũ�� length �Ӽ����� ����� ���� ���� �� ���� => Not Found Attribute(�Ӽ�) Error �߻�
			System.out.println(list.get(i).getName());//System.out.println(list[i].getName());	//[�ε���] ��  �迭 ��ü���� Ȱ���ؾ� ������, list(ArrayList) �� ���� �迭 ��� ���� ������ []�� ���Ǿ��� => Not Allowed Operation(Operation Not Permmitted) Error �߻�
		}
	}
	
}
