package p301;

import java.io.*;

public class Discomfortlndexer {
public static void main(String[] args)
{
try {
BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
double DI; // ��������
double Ta; // �Ǳ��µ�(��)
double Tw; // �����µ�(��)

// �Է�
System.out.print( "�Ǳ� �µ��� �Է��ϼ���> ");
Ta = Double.parseDouble( br.readLine() );

System.out.print( "���� �µ��� �Է��ϼ���> ");
Tw = Double.parseDouble( br.readLine() );

// ���
DI = (Ta + Tw)*0.72 + 40.6;

// ���
System.out.println( "�������� = " + DI );

if ( DI <= 70 ) {
System.out.println( "����" );
}
else if ( DI <= 75 ) {
System.out.println( "�Ҽ� ����" );
}
else if ( DI > 75 ) {
System.out.println( "���ݼ� �̻� ����" );
}
else if ( DI > 80 ) {
System.out.println( "��� ����� ����" );
}
}
catch ( IOException e ) {
e.printStackTrace();
}
}
}
