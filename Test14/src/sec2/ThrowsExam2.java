package sec2;

public class ThrowsExam2 {
	public static void main(String[] args) { //main �޼ҵ忡 throws�� ���ܸ� ���ѱ��� ���� ���
		String name = null ;
		nullPassing(name);
		
		int[] arr = {100,80,90};
		arrayPassing(arr);
		
		String data = "pes0722" ;
	}
	public static void nullPassing(String name) throws NullPointerException{
		System.out.println(name);	
	}
	public static void arrayPassing(int[] arr) throws ArrayIndexOutOfBoundsException{
		int tot = 0;
		for(int i=0;i<10;i++) {
			System.out.println(arr[i]);
			tot += arr[i];
		}
		System.out.println("�հ� : "+tot);
	}
}
