package edu.kh.test;

import java.util.ArrayList;
import java.util.List;

public class Test11 { 
	public static void main(String[] args) {
		String names ="������ �̼��� ������ ���ָ� �ο�����";
		List<IPInfo> ipList =new ArrayList<>();
		ipList.add(new IPInfo("192.168.0.191","������"));
		ipList.add(new IPInfo("192.168.2.19","������"));
		ipList.add(new IPInfo("192.168.1.132","ȫ�μ�"));
		ipList.add(new IPInfo("192.168.1.3","������"));
		String str ="������";
		System.out.println("String���� ã��");
		if(names.contains(str)) {
			System.out.println(str+"�����ԿϷ�");
		}else {
			System.out.println(str+"����x");
		}
		System.out.println("\nArrayList���� ã��");
		
		boolean sw = false;
		for(IPInfo i:ipList) {
			if(i.getUser().equals(str)) {
				sw=true;
			}
		}
			if(sw) {
				System.out.println(str+"����o");
		}else {
				System.out.println(str+"����x");
		}
	}
	
}
