package sec2;

public class Bus {
	int no; //노선번호
	int cnt; //승객수
	int money; //요금
	
	//객체 생성시 노선번호(no)만 입력 받는 생성자 함수
	public Bus(int num) {
		this.no =num;	
	}
		
	//승객이 버스를 타면 행해지는 일
	public void take(int money) {
		this.money += money;
		cnt++;
	}
	//버스의 현재 정보 출력
	public void show() {
		System.out.println("");
		
	}
}
