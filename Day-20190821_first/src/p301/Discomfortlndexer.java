package p301;

import java.io.*;

public class Discomfortlndexer {
public static void main(String[] args)
{
try {
BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
double DI; // 불쾌지수
double Ta; // 건구온도(℉)
double Tw; // 습구온도(℉)

// 입력
System.out.print( "건구 온도를 입력하세요> ");
Ta = Double.parseDouble( br.readLine() );

System.out.print( "습구 온도를 입력하세요> ");
Tw = Double.parseDouble( br.readLine() );

// 계산
DI = (Ta + Tw)*0.72 + 40.6;

// 출력
System.out.println( "불쾌지수 = " + DI );

if ( DI <= 70 ) {
System.out.println( "쾌적" );
}
else if ( DI <= 75 ) {
System.out.println( "소수 불쾌" );
}
else if ( DI > 75 ) {
System.out.println( "과반수 이상 불쾌" );
}
else if ( DI > 80 ) {
System.out.println( "모든 사람이 불쾌" );
}
}
catch ( IOException e ) {
e.printStackTrace();
}
}
}
