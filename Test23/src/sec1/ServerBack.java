package sec1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class ServerBack extends Thread {
	Vector<ReceiveInfo> clientList = new Vector<ReceiveInfo>();	//Ŭ���̾�Ʈ ������ ���
	List<String> nickNameList = new ArrayList<String>(); //Ŭ���̾�Ʈ ��ȭ�� ���
	ServerSocket serverSocket;
	Socket socket;
	private ChatServerGUI serverChatGui;
	
	public void setGUI(ChatServerGUI serverChatGui){
		this.serverChatGui = serverChatGui;
	}
	
	public void startServer(int port) {
		try {
			Collections.synchronizedList(clientList);
			serverSocket = new ServerSocket(port);
			System.out.println("���� IP�ּ� : ["+InetAddress.getLocalHost()+"], "+"Port ��ȣ : ["+port+"]");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void run() {
		try {
			nickNameList.add("Admin");
			while(true) {
				System.out.println("���� �����");
				socket = serverSocket.accept();
				System.out.println("["+socket.getInetAddress()+"]���� �����ϼ̽��ϴ�.");
				ReceiveInfo receive = new ReceiveInfo(socket);
				clientList.add(receive);
				receive.start();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void transmitAll(String message) {
		for(int i=0;i<clientList.size();i++) {
			try {
				ReceiveInfo ri = clientList.elementAt(i);
				ri.transmitAll(message);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}	
	}
	
	public void removeClient(ReceiveInfo client, String nickName) {
		clientList.removeElement(client);
		nickNameList.remove(nickName);
		System.out.println("��Ͽ��� "+nickName+"�� �����Ͽ����ϴ�.");
		serverChatGui.userList.setText(null);
		serverChatGui.appendUserList(nickNameList);
	}
	
	class ReceiveInfo extends Thread {
		private DataInputStream in;
		private DataOutputStream out;
		String nickName;
		String message;	
		public ReceiveInfo(Socket socket) {
			try {
				out = new DataOutputStream(socket.getOutputStream());
				in = new DataInputStream(socket.getInputStream());
				nickName = in.readUTF();
				nickNameList.add(nickName);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		@Override
		public void run() {
			try {
				serverChatGui.userList.setText(null);
				serverChatGui.appendUserList(nickNameList);
				transmitAll(nickName+"���� �����ϼ̽��ϴ�.\n");
				for(int i=0;i<nickNameList.size();i++) {
					transmitAll("+++�г����ǽ���+++"+nickName+nickNameList.get(i));
				}
				serverChatGui.appendMessage(nickName+"���� �����ϼ̽��ϴ�.\n");
				while(true) {
					message = in.readUTF();
					serverChatGui.appendMessage(message);
					transmitAll(message);
				}
			} catch(Exception e) {
				System.out.println(nickName +"���� �����ϼ̽��ϴ�.");
				removeClient(this, nickName);
				transmitAll(nickName + "���� �����ϼ̽��ϴ�.");
				for(int i=0;i<nickNameList.size();i++) {
					transmitAll("+++�г����ǽ���+++"+nickNameList.get(i));
				}
				serverChatGui.appendMessage(nickName+"���� �����ϼ̽��ϴ�.\n");
			}
		}
		
		public void transmitAll(String message) {
			try {
				out.writeUTF(message);
				out.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}