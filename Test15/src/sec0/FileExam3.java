package sec0;

import java.io.File;
import java.io.IOException;
import java.util.Date;  //17������

//���ϰ� ���丮 �����ϴ¹��
public class FileExam3 {
	public static void main(String[] args) throws IOException {
		File f= new File("student");
		f.mkdir();	 //test15�� ���� ���丮�̹Ƿ� test15 �ȿ� student��� ���丮 ����
		
		File f2 = new File("manage/teacher/kt");
		f2.mkdirs();
		
		//���丮 ���� ��¥�� �ð� �����ϱ� 
		f.setLastModified(new Date().getTime());
		
		//���丮 �б� ����   // ������ �Ӽ��� ���� �б������� üũ�����ص� �̸�ɾ ����ϸ� �б����� üũ�� �����ϰ����ִ� ��ɾ�
		f.setReadOnly();
		
		
	}
}
