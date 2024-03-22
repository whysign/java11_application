package sec2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {

	public static void main(String[] args) {
		ServerSocket server= null;//������ ����
		Socket socket= null; //Ŭ���̾�Ʈ�� ����
		Scanner sc= new Scanner(System.in);
		
		BufferedReader in =null; //�޼��� �ޱ�
		PrintWriter out = null; //�޼��� ������
		try {
			server =new ServerSocket(6000); //Ư�� ��Ʈ��ȣ�� ���� ����
			System.out.println("������Ʈ :6000");
			socket =server.accept();		//Ŭ���̾�Ʈ ���� ���
			System.out.println("[���� ���]");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out =new PrintWriter(socket.getOutputStream());
			while(true) {
				String inMessage =in.readLine();//Ŭ���̾�Ʈ���� ���� �� �޼���
				System.out.println("[From Client] : "+inMessage);
				//����
				if(inMessage.contains("quit"))break;
				System.out.println("[Send to Message] : ");//Ŭ���̾�Ʈ�� ���� �޼��� �ۼ�
				String outMessage =sc.nextLine();
				
				//�߽�
				out.println(outMessage);
				out.flush();
				if(outMessage.contains("quit")) break;
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("[���� ���� ���� ����]");
		}finally {
			try {
				sc.close();
				socket.close();
				server.close();
				System.out.println("[���� ����]");
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("[���� ���� ���� ����]");
			}
			
		}
	}

}
