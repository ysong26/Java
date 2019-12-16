/*C:\DEV\eclipse-jee-photon-R-win32-x86_64\apps-workspaces\Day-20190808_first\bin>java -cp ./ net3.TCPEchoClient 127.0.0.1 9000 HelloJava
�۽��� �޽���: HelloJava

������ �޽���: HelloJava */

package net3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.Socket;

public class TCPEchoClient {
	private Socket socket=null;
	private BufferedInputStream bis=null;
	private BufferedOutputStream bos=null;
	
	public TCPEchoClient(String sAddress, int port) {
		try {
			socket=new Socket(sAddress, port);
			bis=new BufferedInputStream(socket.getInputStream());
			bos=new BufferedOutputStream(socket.getOutputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//1.����
	public void send(byte[] buf) {
		try {
			System.out.println("�۽��� �޽���: "+ new String(buf)); //�͸�Ŭ����
			bos.write(buf);
			bos.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	//2.����
	public void receive() {
		try {
			int len=0;
			byte echo[]=new byte[256];
			String str="";
			
			while((len=bis.read(echo,0,echo.length))!= -1) {
				str=str+new String(echo,0,len);
			}
			System.out.println("������ �޽���: "+str);
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
	}
	
	//3.����
	public void close() {
		try {
			bos.close();
			bis.close();
			socket.close();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		if(args.length <=2 || args.length > 3) {
			System.out.println("�Ķ����: <�����ּ�> <��Ʈ��ȣ> <�޽���>");
			System.exit(0);
		}
		
		String sAddress=args[0]; //�����ּ�
		int port=Integer.parseInt(args[1]); //��Ʈ��ȣ
		
		byte buf[]=(args[2]+"\n").getBytes(); //�޽���
		
		TCPEchoClient client=new TCPEchoClient(sAddress, port);
		client.send(buf);
		client.receive();
		client.close();

	}

}
