package sec2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReceiveThread extends Thread {
	//����ȭ �÷��� : ���� ����ڰ� ���� ����� �����ϰ� �־�� �Ѵ�.
	static List<PrintWriter> list = Collections.synchronizedList(new ArrayList<PrintWriter>());
	
	Socket socket = null;
	BufferedReader in = null;
	PrintWriter out = null;
	
	public ReceiveThread(Socket socket) {
		this.socket = socket;
		try {
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream());
			list.add(out);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		String name = "";
		try {
			name = in.readLine();
			System.out.println("["+name+" ���ο� ���� ����]");
			sendAll("["+name+"]���� ��� ���̽��ϴ�.");
			
			while(in != null) {
				String inMsg = in.readLine();
				if("quit".equalsIgnoreCase(inMsg)) break;
				sendAll(name + ">>" + inMsg);
			}
		} catch (IOException e) {
			System.out.println("["+name+"���Ӳ���]");
			e.printStackTrace();
		} finally {
			System.out.println("["+name+"]���� �����̽��ϴ�.");
			list.remove(out);
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("["+name+" ��������]");
	}
	
	private void sendAll(String s) {
		for(PrintWriter out:list) {
			out.println(s);
			out.flush();
		}
	}
}