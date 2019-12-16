//C:\DEV\eclipse-jee-photon-R-win32-x86_64\apps-workspaces\Day-20190808_first\bin>java -cp ./ net1.TCPEchoServer 9000
//������ �޽���: HelloJava

package net1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPEchoServer {
	private ServerSocket server=null;
	
	public TCPEchoServer(int port) { //�������Լ� void ���� �ȵ�
			//1.���ϰ�ü����
		
		try {
			server=new ServerSocket(port); //������ ������������ ���� (����ڵ��� ��Ʈ�� ���� �־���ְ� �ϱ����� �������� �ȳ���)
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
	
	}
	
	public void process() { //2-5�ܰ� ���μ����� ��� ����(�۽ź���)
		while(true) {
			//2.��û ���(listen)
			try {
				Socket con = server.accept();
				//3.����(accept)
				//3-1. ��Ʈ�� ��ü ����
				BufferedInputStream bis=null;
				BufferedOutputStream bos=null;
				bis=new BufferedInputStream(con.getInputStream());
				bos=new BufferedOutputStream(con.getOutputStream());
				
				byte buf[]=new byte[256];
				int len=0;
				String str="";
				
				
			while((len=bis.read(buf,0,buf.length)) != -1) {
				//3-2. �б�
				str=str+new String(buf,0,len);
				//3-3.���÷��� 
				bos.write(buf, 0, len);
				bos.flush();
				
				if(str.indexOf("\n") != -1);
					break;
			}
				
				System.out.println("������ �޽���: "+str);
				
				//4.����(close) TCP�� �����������̶� close�ʼ�
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
		//��ȿ�� ó��(Validation)
		if(args.length != 1) {
			System.out.println("�Ķ����: <��Ʈ��ȣ>");
			System.exit(0);
		}
		
		int port=Integer.parseInt(args[0]); //��Ƽ���� �̿��� parse�� ����ȯ �ϴ°� wrapperó�� 
		
		TCPEchoServer server=new TCPEchoServer(port);
		
		server.process();
		
	}

}
