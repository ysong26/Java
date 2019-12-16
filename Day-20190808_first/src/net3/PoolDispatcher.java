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
		//2.요청 대기(listen)
		try {
			
			BufferedInputStream bis=null;
			BufferedOutputStream bos=null;
			Socket con=server.accept();
			
			//3.수신(accept)
			//3-1. 스트림 객체 생성

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
