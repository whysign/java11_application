package edu.kh.test;

import java.util.ArrayList;
import java.util.List;

public class Test11 { 
	public static void main(String[] args) {
		String names ="박은성 이순신 강감찬 고주몽 부여온조";
		List<IPInfo> ipList =new ArrayList<>();
		ipList.add(new IPInfo("192.168.0.191","박은성"));
		ipList.add(new IPInfo("192.168.2.19","김지훈"));
		ipList.add(new IPInfo("192.168.1.132","홍민석"));
		ipList.add(new IPInfo("192.168.1.3","강감찬"));
		String str ="박은성";
		System.out.println("String에서 찾기");
		if(names.contains(str)) {
			System.out.println(str+"이포함완료");
		}else {
			System.out.println(str+"포함x");
		}
		System.out.println("\nArrayList에서 찾기");
		
		boolean sw = false;
		for(IPInfo i:ipList) {
			if(i.getUser().equals(str)) {
				sw=true;
			}
		}
			if(sw) {
				System.out.println(str+"포함o");
		}else {
				System.out.println(str+"포함x");
		}
	}
	
}
