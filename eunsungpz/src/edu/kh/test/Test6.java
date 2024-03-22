
package edu.kh.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test6 {
	Scanner sc = new Scanner(System.in);
	List<Food> foodList = new ArrayList<>();
	
	public static void main(String[] args) {
		Test6 app = new Test6();
		app.mainMenu();
	}
	
	public void mainMenu() {
		boolean sw = true;
		while(sw) {
			System.out.println("=== ���� ����Ʈ ===");
			System.out.println("1. ���� �߰�");
			System.out.println("2. ���� ����");
			System.out.println("3. ���� ����");
			System.out.println("4. ���α׷� ����");
			System.out.print("��ȣ ���� : ");
			switch(sc.nextInt()) {
				case 1:
					add();
					break;
				case 2:
					info();
					break;
				case 3:
					remove();
					break;
				case 4:
					sw = false;
					break;
				default:
					System.out.println("����");
					sw = false;
			}
		}
	}
	
	public void add() {
		System.out.print("�߰��� ���� �Է� : ");
		String name = sc.next();
		System.out.print("\nĮ�θ� �Է� : ");
		int kcal = Integer.parseInt(sc.next());
		foodList.add(new Food(name, kcal));
		System.out.println("���� ������ �߰��Ǿ����ϴ�.");
	}
	
	public void info() {
		for(Food f:foodList) {
			System.out.println(f.toString());
		}
	}
	
	public void remove() {
		System.out.print("�����ϰ� ���� ���� ���� : ");
		String name = sc.next();
		Food fd;
		for(int i=0;i<foodList.size();i++) {
			fd = foodList.get(i);
			if(fd.getName().equals(name)) {
				System.out.println(fd.toString()+"�� �����Ǿ����ϴ�.");
				foodList.remove(i);
			}
		}
	}
}
