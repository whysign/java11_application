package sec1;
//ArrayIndexOutOfBoundsException : �迭�� ������ �ʰ��ϴ� ���
public class ExceptionExam3 {

	public static void main(String[] args) {
		int[] nArr = {90,85,100};
		int i = 0;
		while(i<=4) {
			try {
			System.out.println(nArr[i]); //90 85 100
			i++;
			} catch(ArrayIndexOutOfBoundsException e) {
				e.getMessage();
				break;
			}catch(Exception e) {
				e.printStackTrace();				
			}finally {
				System.out.println("�۾� ����");//���� (try) �����̵� ����(catch)�̵� �۾� �� �ݵ�� ����
			}
		}
	}

}
