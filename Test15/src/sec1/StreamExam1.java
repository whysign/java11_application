package sec1;
// ����/Ű����/������ �Է� :FileInputStream ,BufferedInputStream,FileReader,BufferedReader
// ����/�����/������ �Է� :FileOutputStream,BufferedOutputStream,FileWriter,BufferedWriter
//Stream ���� ������ Ŭ������ ������ �������  ����Ʈ ������ :FileInputStream ,BufferedInputStream,FileOutputStream,BufferedOutputStream
//Stream ���� ������ �ʴ� Ŭ������ ������ ������� ���� ������ :FileReader,BufferedReader,FileWriter,BufferedWriter
public class StreamExam1 {
	public static void main(String[] args) {
		String fileInputStream = "FileInputStream�� ����Ʈ ������ �Է��ϱ� ���� ��Ʈ��";
		String bufferedInputStream = "BufferedInputStream ����Ʈ ������ �Է��ϱ� ���� ��Ʈ�� : �޸� ������ �ε���";
		String FileReader = "FileReader ���ڴ����� �Է��ϱ� ���� ��Ʈ��";
		String BufferedReader ="BufferedReader ���� ������ �Է��ϱ� ���� ��Ʈ�� :�޸� ���۷� �ε���";
		String FileOutputStream ="FileOutputStream ����Ʈ ������ �Է��ϱ� ���� ��Ʈ��";
		String BufferedOutputStream =" BufferedOutputStream ����Ʈ ������ �Է��ϱ� ���� ��Ʈ�� :�޸𸮹��۷� �ε� ��";
		String FileWriter =" FileWriter ���� ������ �Է��ϱ� ���� ��Ʈ��";
		String BufferedWriter ="BufferedWriter ���� ������ �Է��ϱ� ���� ��Ʈ��:�޸𸮹��۷� �ε� ��";
		System.out.println(fileInputStream);
		System.out.println(bufferedInputStream);
		System.out.println(FileReader);
		System.out.println(BufferedReader);
		System.out.println(FileOutputStream);
		System.out.println(BufferedOutputStream);
		System.out.println( FileWriter);
		System.out.println(BufferedWriter);
		
	}

}
