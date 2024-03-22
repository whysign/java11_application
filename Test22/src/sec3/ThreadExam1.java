package sec3;
//Tread(������) = process(���μ���) = ���� ��ǻ�Ϳ��� ���� ���� ���α׷�(�۾�)  ������ �����尡 �������� �� ���μ������ �ϴµ� �ڹٿ��� ���ٰ� ����. (�ϳ����۾�)
//�߻�(New)=>(������:RUNNABLE) => ����(����:run) => ������:RUNNABLE => ����
//����=> ������ : sleep
//������ => ����: wake up(run)
public class ThreadExam1 {
	public static void FirstThread() {
		System.out.println("ù ��° ������");
	}
	public static void SecondaryThread() {
		System.out.println("�� ��° ������");
		for(int i = 0; i<10;i++) {//0~9���� ī��Ʈ �۾� 
			System.out.println(i);
			try {
				Thread.sleep(1000); //sleep(����->������)
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		Thread thread1 =new Thread(new Runnable() {//new Thread(����) => Runnable(������)
			@Override
			public void run() {//run(������ -> ����) : 
				FirstThread();		
			}		
		}); //������(���డ���� �۾�) 
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
