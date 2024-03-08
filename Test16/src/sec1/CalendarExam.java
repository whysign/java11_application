package sec1;

import java.util.Calendar;

public class CalendarExam {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();	//Date today = new Date();
		int year = today.get(Calendar.YEAR);
		int month =today.get(Calendar.MONTH) + 1; // 0~11
		int day = today.get(Calendar.DATE);
		
		int doy =today.get(Calendar.DAY_OF_YEAR);
		int dom=today.get(Calendar.DAY_OF_MONTH);
		int dow =today.get(Calendar.DAY_OF_WEEK);
		
		int hour12 =today.get(Calendar.HOUR); //12 �ð���
		int hour24 =today.get(Calendar.HOUR_OF_DAY); //24�ð���
		int minute =today.get(Calendar.MINUTE); // ��]
		int second =today.get(Calendar.SECOND);
		int ampm =today.get(Calendar.AM_PM);
		
		int timeZone = today.get(Calendar.ZONE_OFFSET); //�и��� => �ð�(/1000/60/60)
		int lastDate = today.getActualMaximum(Calendar.DATE); //getActualMaximum ��������
		int firstDate = today.getActualMinimum(Calendar.DATE); //getActualMinimum ù���� ��
		
		
		System.out.println("����⵵ : " +year);
		System.out.println("����� : "+month);
		System.out.println("���� �� : "+day);
		
		System.out.println("������"+year+"����"+doy+"�� �� ��");
		System.out.println("������"+month+"����"+dom+"���� ��");
		System.out.println("������ �̹����� :"+dow+"���� ��");
		
		String[] wk = {"","�Ͽ���","������","ȭ����","������","�����","�ݿ���","�����"} ;
		System.out.println("������"+wk[dow]+"�Դϴ�.");
		
		System.out.println("����ð�(24�ð���) : "+hour24+":"+minute+":"+second);
		System.out.println("����ð�(12�ð���) - ");
		if(ampm == 0) {
			System.out.println("����"+hour12+":"+minute+":"+second);
		}else {
			System.out.println("����"+hour12+":"+minute+":"+second);
		}
		System.out.println("Ÿ����  :"+(timeZone/1000/60/60));
		System.out.println("�̴��� �������� :"+lastDate);
		System.out.println("�̴��� ù��°�� :"+firstDate);
	}	
}
