//C:\DEV\eclipse-jee-photon-R-win32-x86_64\apps-workspaces\Day-20190808_first\bin>java -cp ./ net1.TCPEchoServer 9000
//������ �޽���: HelloJava

package net2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPEchoServer {
	
	public static void main(String[] args) {
		//��ȿ�� ó��(Validation)
		if(args.length != 1) {
			System.out.println("�Ķ����: <��Ʈ��ȣ>");
			System.exit(0);
		}
		
		int port=Integer.parseInt(args[0]); //��Ƽ���� �̿��� parse�� ����ȯ �ϴ°� wrapperó�� 
		
		ServerSocket server=null;
		
		try {
			server=new ServerSocket(port); //������ ������������ ���� (����ڵ��� ��Ʈ�� ���� �־���ְ� �ϱ����� �������� �ȳ���)
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
		
		while(true) {
			try {
				Socket con = server.accept();
				
				TCPEchoServerThread process=new TCPEchoServerThread(con);
				
				Thread thread=new Thread(process);
				thread.start();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
