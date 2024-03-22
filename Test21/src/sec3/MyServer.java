
package sec3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyServer {
	public static void main(String[] args) {
		BufferedReader in = null;	//�б�(�Է� ��Ʈ��)
		PrintWriter out = null;		//����(��� ��Ʈ��)
		
		ServerSocket server = null;	//��������
		Socket socket = null;	//����
		Scanner sc = new Scanner(System.in);	//Ű���� �Է�
		
		try {
			server = new ServerSocket(6000);
			System.out.println("[Server ����] : Client ���� ��� ���Դϴ�.");
			socket = server.accept();	//Ŭ���̾�Ʈ�� ������ ������ ����
			System.out.println("[Client ����] ");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream());
			
			while(true) {
				String inMsg = in.readLine();
				if("quit".equalsIgnoreCase(inMsg)) break;
				
				System.out.println("[From Client: ] "+inMsg);
				System.out.println("���� >>>");
				
				String outMsg = sc.nextLine();
				out.println(outMsg);
				out.flush();
				if("quit".equalsIgnoreCase(outMsg)) break;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {			
				sc.close();
				socket.close();
				server.close();
				System.out.println("���� ����");
			} catch (IOException e) {
				System.out.println("������� ���� ����");
				e.printStackTrace();
			}
		}
	}
}
