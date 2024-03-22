package sec2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiServer {
	public static void main(String[] args) {
		MultiServer multi = new MultiServer();
		multi.start();
	}
	public void start() {
		ServerSocket server = null;
		Socket socket = null;
		
		try {
			server = new ServerSocket(8000);
			
			while(true) {
				System.out.println("[Server ����] : Client ���� ��� ��");
				socket = server.accept();
				ReceiveThread receiveThread = new ReceiveThread(socket);
				receiveThread.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(server!=null) {
				try {
					server.close();
					System.out.println("[���� ����]");
				} catch (IOException e) {
					System.out.println("[���� ���� ��� ����]");
					e.printStackTrace();
				}
			}
		}
	}
}