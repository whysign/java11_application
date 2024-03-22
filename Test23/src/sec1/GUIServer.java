package sec1;

import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

class ManagerLogin extends JFrame implements ActionListener, KeyListener {	//GUI ������ â 
	JPanel port_log = new JPanel();
	JLabel port_label = new JLabel("�Է��� ����� ��Ʈ��ȣ�� �Է��ϼ���");
	JLabel port_warn = new JLabel("(��, ��Ʈ��ȣ�� 0~65536 �̾�� ��)");
	JTextField port_num = new JTextField(20);
	JButton port_btn = new JButton("����~!");
	ChatServerGUI serverChat;
	public ManagerLogin() {
		setTitle("GUI ������ â");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,400);
		setVisible(true);
		setResizable(false);
		port_btn.addActionListener(this);
		port_num.addKeyListener(this);
		port_log.add(port_label);
		port_log.add(port_warn);
		port_log.add(port_num);
		port_log.add(port_btn);
		
		add(port_log);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		//Ư�� Ű�� �����ٰ� ������ ��
		
	}

	@Override
	public void keyPressed(KeyEvent e) {	//Ű���� �Է½� ����
		try {
			if(e.getKeyCode() == KeyEvent.VK_ENTER) {
				int port = Integer.parseInt(port_num.getText().trim());
				serverChat = new ChatServerGUI(port);
				setVisible(false);
			}
		} catch(Exception a) {
			JOptionPane.showMessageDialog(null, "�ùٸ��� ���� �Է��Դϴ�.");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		//Ű������ Ư�� Ű���� ������ ��
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//����~! ��ư�� ������
		try {
			int port = Integer.parseInt(port_num.getText().trim());
			if(e.getSource() == port_btn) {
				serverChat = new ChatServerGUI(port);
				setVisible(false);			
			}
		} catch(Exception a) {
			JOptionPane.showMessageDialog(null, "�ùٸ��� ���� �Է��Դϴ�.");
		}
	}
}

class ChatServerGUI extends JFrame implements ActionListener, KeyListener {

	JPanel serverGUI_Panel = new JPanel();
	JLabel serverLabel = new JLabel("���� ����");
	JLabel userLable = new JLabel("����� ���");
	JTextField chat = new JTextField(45);
	JButton enter = new JButton("����");
	TextArea serverChatList = new TextArea(30, 50);
	TextArea userList = new TextArea(30, 15);
	JTextField portLabel = new JTextField(50);
	ServerBack sb = new ServerBack();
	String ip;
	public ChatServerGUI(int port) {
		setTitle("���� ����");
		setVisible(true);
		setLocationRelativeTo(null);
		setSize(750, 620);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			InetAddress host = InetAddress.getLocalHost();
			ip = host.getHostAddress();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

		portLabel.setText("���� ������ �ּ� : "+ip+", ���� ���� ��Ʈ : "+port);
		serverChatList.setEditable(false);
		userList.setEditable(false);
		chat.addKeyListener(this);
		enter.addActionListener(this);
		
		serverGUI_Panel.add(serverLabel);
		serverGUI_Panel.add(serverChatList);
		serverGUI_Panel.add(userLable);
		serverGUI_Panel.add(userList);
		serverGUI_Panel.add(chat);
		serverGUI_Panel.add(enter);
		serverGUI_Panel.add(portLabel);
		add(serverGUI_Panel);
		
		userList.append("Admin\n");
		sb.setGUI(this);
		sb.startServer(port);
		sb.start();
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		String message = chat.getText().trim();
		if(e.getKeyCode() == KeyEvent.VK_ENTER && message.length() > 0) {
			appendMessage("���� : "+message+"\n");
			sb.transmitAll("���� : "+message+"\n");
			chat.setText(null);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String message = chat.getText().trim();
		if(e.getSource() == enter && message.length() > 0) {
			appendMessage("���� : "+message+"\n");
			sb.transmitAll("���� : "+message+"\n");
			chat.setText(null);
		}
	}
	
	public void appendMessage(String message) { //�޽��� �߰� ����
		serverChatList.append(message);
	}
	
	public void appendUserList(List<String> nickNameList) { //����� ��Ͽ� �߰� ����
		String name;
		for(int i=0;i<nickNameList.size();i++) {
			name = (String) nickNameList.get(i);
			userList.append(name + "\n");
		}
	}
	
}

public class GUIServer {
	public static void main(String[] args) {
		new ManagerLogin();
	}
}