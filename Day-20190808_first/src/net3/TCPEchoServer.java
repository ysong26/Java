//C:\DEV\eclipse-jee-photon-R-win32-x86_64\apps-workspaces\Day-20190808_first\bin>java -cp ./ net3.TCPEchoServer 9000
//������ �޽���: HelloJava

package net3;

import java.io.IOException;
import java.net.ServerSocket;

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
		
			PoolDispatcher tPool=new PoolDispatcher();
			tPool.startDispatching(server);
			
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
	}

}
