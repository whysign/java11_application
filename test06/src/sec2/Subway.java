package sec2;

public class Subway {
	int no;
	String station;
	int money;
	int cnt;
	
	//지하철 노선번호를 매개변수로 받는 생성자 함수
	public Subway(int a) {
		this.no =a;		
	}
	// 지하철 승객이 탑승하면,생기는 필드의 변화
	public void take (int money) {
		this.money += money;
		cnt++;
		
	}
	//현재 지하철 정보 출력 
	public void show () {
		
		System.out.println("누적요금 :" );
	}
}
