//C:\DEV\eclipse-jee-photon-R-win32-x86_64\apps-workspaces\Day-20190808_first\bin>java -cp ./ net1.TCPEchoServer 9000
//수신한 메시지: HelloJava

package net1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPEchoServer {
	private ServerSocket server=null;
	
	public TCPEchoServer(int port) { //생성자함수 void 쓰면 안됨
			//1.소켓객체생성
		
		try {
			server=new ServerSocket(port); //서버는 서버소켓으로 만듬 (사용자들이 포트를 직접 넣어쓸수있게 하기위해 숫자직접 안넣음)
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
	
	}
	
	public void process() { //2-5단계 프로세스로 묶어서 만듬(송신빠짐)
		while(true) {
			//2.요청 대기(listen)
			try {
				Socket con = server.accept();
				//3.수신(accept)
				//3-1. 스트림 객체 생성
				BufferedInputStream bis=null;
				BufferedOutputStream bos=null;
				bis=new BufferedInputStream(con.getInputStream());
				bos=new BufferedOutputStream(con.getOutputStream());
				
				byte buf[]=new byte[256];
				int len=0;
				String str="";
				
				
			while((len=bis.read(buf,0,buf.length)) != -1) {
				//3-2. 읽기
				str=str+new String(buf,0,len);
				//3-3.디스플레이 
				bos.write(buf, 0, len);
				bos.flush();
				
				if(str.indexOf("\n") != -1);
					break;
			}
				
				System.out.println("수신한 메시지: "+str);
				
				//4.종료(close) TCP는 연결지향형이라 close필수
				bos.close();
				bis.close();
				con.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
		}

	}
	
	
	

	
	public static void main(String[] args) {
		//유효성 처리(Validation)
		if(args.length != 1) {
			System.out.println("파라미터: <포트번호>");
			System.exit(0);
		}
		
		int port=Integer.parseInt(args[0]); //인티저를 이용해 parse로 형변환 하는거 wrapper처리 
		
		TCPEchoServer server=new TCPEchoServer(port);
		
		server.process();
		
	}

}
