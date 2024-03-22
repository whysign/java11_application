package sec2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {

	public static void main(String[] args) {
		Socket socket =null;	 //����
		Scanner sc= new Scanner(System.in); //�Է�
		
		BufferedReader in =null; //�޼��� �ޱ�
		PrintWriter out = null; //�޼��� ������
		
		try {
			socket =new Socket("127.0.0.1",6000);//���� ����
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out =new PrintWriter(socket.getOutputStream());
			
			while(true) {
				System.out.println("[From Client] : ");//���� �޼��� �ۼ�
				String outMessage =sc.nextLine();
				
				out.println(outMessage); //���� �޼��� ����
				out.flush();			 //�޼��� �߼�
				if(outMessage.contains("quit"))break;
				
				String inMessage = in.readLine(); //�����޼��� �б�
				System.out.println("[From Server] : "+inMessage);
				if(inMessage.contains("quit"))break;
			}
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println("[Ŭ���̾�Ʈ ���� ��� ����]");
		}finally {
			try {
				sc.close();
				socket.close();
				System.out.println("[Ŭ���̾�Ʈ ���� ���� ����]");
			}catch(IOException e) {
				e.printStackTrace();
				System.out.println("[Ŭ���̾�Ʈ ���� ���� ���� ����]");
			}
		}
	}

}
