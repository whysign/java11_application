package edu.kh.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		List<IPInfo>ipinfoList =new ArrayList<>(); //ipInfoList �� ArrayList �� �����ؾ� ������ ,null�� �����Ͽ����Ƿ� 13�ٺ���15��°���� NullPointerException �̹߻���
		ipinfoList.add(new IPInfo("121.121.123.123","ȫ�浿"));
		ipinfoList.add(new IPInfo("212.133.7.8","���")); //11��°����  : IpInfo Ŭ������ ������(Construdctor)���� �Ű����� �ϳ��� ���� �޴� ���� �����Ƿ� ��ü ������ �Ұ����ϴ� ��
		ipinfoList.add(new IPInfo("177.233.111.222","����"));
		
		System.out.println("ip �Է� :");
		String ip =sc.next();
		
		for(int i=0;i<ipinfoList.size();i++) {
			if(ipinfoList.get(i).getIp().equals(ip)) {//3
				System.out.println(ipinfoList.get(i).toString());
				break;
			}else {
				System.out.println("��ġ�ϴ� ip ����ڰ� �����ϴ�");
			}
		}
		
	}
}
