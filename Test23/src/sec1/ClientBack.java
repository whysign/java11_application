
package sec1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ClientBack extends Thread {
	private String NickName, IPAddress;
	private int Port;
	private Socket socket;
	private String Message;
	private DataInputStream in;
	private DataOutputStream out;
	private ChatClientGUI chatgui;
	ArrayList<String> NickNameList = new ArrayList<String>(); // ��������� �����մϴ�.

	public void getUserInfo(String NickName, String IPAddress, int Port) {
		this.NickName = NickName;
		this.IPAddress = IPAddress;
		this.Port = Port;
	}

	public void setGui(ChatClientGUI chatgui) {
		this.chatgui = chatgui;
	}

	@Override
	public void run() {
		try {
			socket = new Socket(IPAddress, Port);
			out = new DataOutputStream(socket.getOutputStream());
			in = new DataInputStream(socket.getInputStream());
			out.writeUTF(NickName);
			
			while (in != null) { 
				Message = in.readUTF();
				if (Message.contains("+++�г����ǽ���+++")) { 
					chatgui.UserList.setText(null);
					NickNameList.add(Message.substring(12));
					chatgui.AppendUserList(NickNameList);
				}else if (NickName.length() > 15) {
				    JOptionPane.showMessageDialog(chatgui, "����� ���̵�� 15���� �̸� �̾�� �մϴ�.", "����", JOptionPane.ERROR_MESSAGE);
				}
				else if (Message.contains("���� �����ϼ̽��ϴ�.\n")) {
					NickNameList.clear();
					chatgui.UserList.setText(null);
					chatgui.AppendMessage(Message);
				} else if (Message.contains("���� �����ϼ̽��ϴ�.\n")) {
					NickNameList.clear();
					chatgui.UserList.setText(null);
					chatgui.AppendMessage(Message);
				} else {
					chatgui.AppendMessage(Message);
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void Transmit(String Message) {
		try {
			out.writeUTF(Message);
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
