package practice_javaBasses;
/*java���������ţ������������Ŷ������Ų�ͬ�Ĺ�ϵ��
������jvm�����ǵײ��Ͷ��߲��ţ���Ҫ�������java��class�ļ���
�ٴ���JRE�����������в㣬����С�����л�����������jvm����⣻
�����jdk���ţ����������ŵĺ��Ĳ��֣�������JRE�����*/
public class �˴�������� {

	public static void main(String[] args) {
		byte a=127;//1�ֽ�  һ�����ļ�����ʹ�ô����ͣ�ȡֵ��Χ��-128~127֮�� ������
		short b=32767;//2�ֽ�  ȡֵ��Χ��-32768~32767 ������
		int c=127;//4�ֽ� ������ 
		boolean d=true;//1�ֽ� true��flase
		double e=1.22;//8�ֽ� ��������
		float f=1.33f;//4�ֽ� ��������
		long g=60;//8�ֽ� ������
		char h='��';//2�ֽ� �����Ƿ�Ϊ4�ֽں�3�ֽڵ� �ַ���    iso-8859-1 1�ֽ�  gbk 2�ֽ� utf-8 3�ֽ�
		//��������byte short int  long float double char boolean
		
		//��byte��short��������ʱ���������ֵҪתΪint���� Ҳ�������������ʱ��byte�Լ���ת��Ϊ��int���͵�ֵ
		byte b1=5;
		byte b2=6;
		int b3=(byte)b1+b2;
		System.out.println(b3);
		short a1=5;
		short a2=6;
		int a3=a1+a2;
		
		//char�����ŵ�λ�ö��ܷ�ʲô ��0-65535֮��ÿ�����ֶ�������һ���ַ���������ǲ��ӵ�����,��������"="����д��ֻ�з�Χ�ڵ�����
		char av=97;//=a   65=A 48=0
		System.out.println(av);
		
		//double�ᶪʧ���ȣ�
		double c1=1.2;
		double c3=1.1;
		double c4=c1-c3;
		System.out.println(c4);//0.09999999999999987
		
		
		
		
		
	}

}
