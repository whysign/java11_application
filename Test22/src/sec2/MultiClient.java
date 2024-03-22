package sec2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MultiClient {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		MultiClient client = new MultiClient();
		client.start();
	}
	public void start() {
		Socket socket = null;
		BufferedReader in = null;
		
		try {
			socket = new Socket("192.168.20.233", 8000);
			System.out.println("[���� ���� ok]");
			
			System.out.print("����ڸ� �Է� : ");
			String name = sc.next();
			
			Thread sendThread = new SendThread(socket, name);
			sendThread.start();
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while(in != null) {
				String inMsg = in.readLine();
				if(("["+name+"���� �����̽��ϴ�.").equals(inMsg)) break;
				System.out.println("From : "+inMsg);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("[���� ���� ����]");
	}
}