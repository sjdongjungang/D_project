package practice_javaBasses;

import java.util.Arrays;

public class ѭ���ͷ�֧�ṹ {

public static void main(String[] args) {
	
	//����ѭ��ģʽ forѭ����foreach����ѭ����whillѭ�� do whill
	//forѭ��
	/*	int[] arr=new int[]{1,2,3,4,5,6};
		for(int i=1;i<arr.length;i++){
			System.out.println(arr[i]);
		}*/
	//ð���㷨
		int[] arr1=new int[]{0,4,0,5,9};
		System.out.println(arr1.length);
		for(int arr3:arr1){
			System.out.println(arr3);
		}
		//����ѭ������
		for(int i=0;i<arr1.length-1;i++){
			//���Ƶ�һ��ֵ�ͼ���ȥ�Ƚ�
			for(int j=0;j<arr1.length-1-i;j++){
				if(arr1[j]>arr1[j+1]){
					int temp=arr1[j];
					arr1[j]=arr1[j+1];
					arr1[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr1));
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i+"*"+j+"="+(i*j));
				
			}
			System.out.println("");
		}
		
	//foreach����ѭ��
	//��֧�ṹ if..else   if...else if  swtich..case
		//��͸�Խ����������break���أ�
		char name='��';
		switch(name){
		case '��':
			System.out.println("��Ůʿ");
		case 'd':
			System.out.println("������");
			break;
			default:
				System.out.println("��С�");
		
		}
		
		//��Ŀ����
		int k=5;
		k=(k>1)?1:-2;
	}
}

