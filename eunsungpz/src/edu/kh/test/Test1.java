package edu.kh.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		List<IPInfo>ipinfoList =new ArrayList<>(); //ipInfoList 는 ArrayList 로 생성해야 하지만 ,null로 대입하였으므로 13줄부터15번째줄은 NullPointerException 이발생함
		ipinfoList.add(new IPInfo("121.121.123.123","홍길동"));
		ipinfoList.add(new IPInfo("212.133.7.8","양양")); //11번째오류  : IpInfo 클래스의 생성자(Construdctor)에는 매개변수 하나를 전달 받는 값이 없으므로 객체 생성이 불가능하다 ㅏ
		ipinfoList.add(new IPInfo("177.233.111.222","고길순"));
		
		System.out.println("ip 입력 :");
		String ip =sc.next();
		
		for(int i=0;i<ipinfoList.size();i++) {
			if(ipinfoList.get(i).getIp().equals(ip)) {//3
				System.out.println(ipinfoList.get(i).toString());
				break;
			}else {
				System.out.println("일치하는 ip 사용자가 없습니다");
			}
		}
		
	}
}
