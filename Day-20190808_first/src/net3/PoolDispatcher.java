package net3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class PoolDispatcher{
	
	static final String NUMTHREADS="10";
	static final String THREADDROP="Thread";
	
	private int numThreads=0;
	
	
	public PoolDispatcher() {
		numThreads=Integer.parseInt(System.getProperty(THREADDROP, NUMTHREADS)); //pool
	}
	
	
	public void startDispatching(final ServerSocket server) {
		
		for(int i=0; i < (numThreads-1); i++) {
			Thread thread=new Thread() {
				public void run() {
					dispatchLoop(server);
				}
			};
			
			thread.start();
		}
		
		dispatchLoop(server);

	}

	private void dispatchLoop(final ServerSocket server) {
		//2.��û ���(listen)
		try {
			
			BufferedInputStream bis=null;
			BufferedOutputStream bos=null;
			Socket con=server.accept();
			
			//3.����(accept)
			//3-1. ��Ʈ�� ��ü ����

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
