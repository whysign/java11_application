
package edu.kh.test;
public class Test4 {
	
	public static void main(String[] args) {

		Person[] pArr = new Person[3]; 	
		pArr[0] = new Person("�����", 43); 
		pArr[1] = new Person("�̼���", 54); 
		pArr[2] = new Person("�̿���", 61); //��� �ְų� �ʱ�ȭ �Ǿ� ���� ���� pArr �迭�� Person ��ü�� �����Ͽ� �� ���(0~2)�� ������ ��ü�� ����
		for(int i=0; i < pArr.length; i++) { 
			//for(int i=0; i <= pArr.length; i++) { //���� ������ �迭�� �������� �� ���� ���� �ݺ� ������ �ȴ�.(��û�� Ƚ���� �迭������ �� ũ��.) => ArrayIndexOutOfBoundsException �߻�   
			System.out.println(pArr[i].getName());	
			//Person �� �迭����� pArr ��ü�� �ʱ�ȭ(���� ����)�Ǿ� ���� �ʾ� => NullPointerException�� �߻�
		}
		
	}
}
