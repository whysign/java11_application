package sec3;
//스케줄링 : 선점형과 비선점형이 있다.
//선점형(Preemption) : 해당 프로세스가 처리되다가 다른 프로세스에게 CPU를 양도될 수 있는 스케줄링
//비선점(non-Preemption):해당 프로세스가 모두 완료될때까지 다른 프로세스에게 CPU를 양도될 수 없는 스케줄링
//LeastJob : 요구 시간이 가장 작은 것 부터 (스케줄링) <=> STJ(Short Time Job)
//SRT(Short Remain Time Job):  => 선점형
//SCJ : 요구시 간이 가장 작은 것 부터 진행(스케줄링) => 비선점형
//아래와 같이 5개의 프로세스가 cpu 에서 처리되고자한다면
//A  08:00	3시간
//B  09:00	2시간
//C	 10:00	4시간
//D  14:00	3시간
//E	 14:00	2시간
//총시간 14시간
//8~11 9,11~13 10,13~17 14~16	16~19	14,19~22
//A -> B ->     C ->	E ->	C->		D->		
public class LeastJob implements Scheduler  {

	@Override
	public void getNextCall() {
		System.out.println("현재 상담이 모두 완료되어 다음 상담하실 분 들어오세요");		
	}
	@Override
	public void sendCallToAgent() {
		System.out.println("상담시간이 가장 적게 걸리는 사람을 우선 배정합니다");		
	}			
}