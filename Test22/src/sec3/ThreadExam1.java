package sec3;
//Tread(쓰레드) = process(프로세스) = 현재 컴퓨터에서 실행 중인 프로그램(작업)  원래는 쓰레드가 여러개가 모여 프로세스라고 하는데 자바에선 같다고 본다. (하나의작업)
//발생(New)=>(실행대기:RUNNABLE) => 점유(실행:run) => 실행대기:RUNNABLE => 종료
//실행=> 실행대기 : sleep
//실행대기 => 실행: wake up(run)
public class ThreadExam1 {
	public static void FirstThread() {
		System.out.println("첫 번째 쓰레드");
	}
	public static void SecondaryThread() {
		System.out.println("두 번째 쓰레드");
		for(int i = 0; i<10;i++) {//0~9까지 카운트 작업 
			System.out.println(i);
			try {
				Thread.sleep(1000); //sleep(실행->실행대기)
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		Thread thread1 =new Thread(new Runnable() {//new Thread(생성) => Runnable(실행대기)
			@Override
			public void run() {//run(실행대기 -> 실행) : 
				FirstThread();		
			}		
		}); //쓰레드(실행가능한 작업) 
		thread1.run();
		thread1.start();
		System.out.println(thread1.getName());
		Thread thread2 =new Thread(new Runnable() {
			@Override
			public void run() {
				SecondaryThread();			
			}		
		});
		thread2.start();
		
	}
}
