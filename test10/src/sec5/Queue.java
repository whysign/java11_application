package sec5;

public interface Queue {
	void enQueue(String title);//저장된 데이터의끝
	String deQueue(); //저장된 데이터의 시작
	int getsize();	// 현재Queue에 저장된개수
}
