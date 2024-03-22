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
		ServerSocket server= null;//서버용 소켓
		Socket socket= null; //클라이언트용 소켓
		Scanner sc= new Scanner(System.in);
		
		BufferedReader in =null; //메세지 받기
		PrintWriter out = null; //메세지 보내기
		try {
			server =new ServerSocket(6000); //특정 포트번호로 서버 시작
			System.out.println("서버포트 :6000");
			socket =server.accept();		//클라이언트 연결 대기
			System.out.println("[연결 대기]");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out =new PrintWriter(socket.getOutputStream());
			while(true) {
				String inMessage =in.readLine();//클라이언트으로 부터 온 메세지
				System.out.println("[From Client] : "+inMessage);
				//수신
				if(inMessage.contains("quit"))break;
				System.out.println("[Send to Message] : ");//클라이언트로 보낼 메세지 작성
				String outMessage =sc.nextLine();
				
				//발신
				out.println(outMessage);
				out.flush();
				if(outMessage.contains("quit")) break;
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("[소켓 연결 시작 오류]");
		}finally {
			try {
				sc.close();
				socket.close();
				server.close();
				System.out.println("[연결 종료]");
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("[소켓 연결 종료 오류]");
			}
			
		}
	}

}
