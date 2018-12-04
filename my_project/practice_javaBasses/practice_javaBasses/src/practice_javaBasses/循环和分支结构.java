package practice_javaBasses;

import java.util.Arrays;

public class 循环和分支结构 {

public static void main(String[] args) {
	
	//四种循环模式 for循环，foreach新型循环，whill循环 do whill
	//for循环
	/*	int[] arr=new int[]{1,2,3,4,5,6};
		for(int i=1;i<arr.length;i++){
			System.out.println(arr[i]);
		}*/
	//冒泡算法
		int[] arr1=new int[]{0,4,0,5,9};
		System.out.println(arr1.length);
		for(int arr3:arr1){
			System.out.println(arr3);
		}
		//控制循环次数
		for(int i=0;i<arr1.length-1;i++){
			//控制第一个值和几个去比较
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
		
	//foreach新型循环
	//分支结构 if..else   if...else if  swtich..case
		//穿透性解决方案是用break返回；
		char name='董';
		switch(name){
		case '张':
			System.out.println("张女士");
		case 'd':
			System.out.println("董先生");
			break;
			default:
				System.out.println("董小妞");
		
		}
		
		//三目运算
		int k=5;
		k=(k>1)?1:-2;
	}
}

