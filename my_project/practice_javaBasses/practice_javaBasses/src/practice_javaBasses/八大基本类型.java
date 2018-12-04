package practice_javaBasses;
/*java有三个部门，并且三个部门都存在着不同的关系：
首先是jvm部门是底层劳动者部门，主要负责加载java的class文件；
再次是JRE部门是属于中层，是最小的运行环境，管理了jvm和类库；
最后是jdk部门，是整个部门的核心部分，包含了JRE和命令；*/
public class 八大基本类型 {

	public static void main(String[] args) {
		byte a=127;//1字节  一般在文件流中使用此类型；取值范围在-128~127之间 整数型
		short b=32767;//2字节  取值范围在-32768~32767 整数型
		int c=127;//4字节 整数型 
		boolean d=true;//1字节 true和flase
		double e=1.22;//8字节 浮点数型
		float f=1.33f;//4字节 浮点数型
		long g=60;//8字节 整数型
		char h='董';//2字节 汉字是分为4字节和3字节的 字符型    iso-8859-1 1字节  gbk 2字节 utf-8 3字节
		//记忆排序：byte short int  long float double char boolean
		
		//在byte和short类型运算时呼运算的数值要转为int类型 也就是再有运算的时候byte自己就转换为了int类型的值
		byte b1=5;
		byte b2=6;
		int b3=(byte)b1+b2;
		System.out.println(b3);
		short a1=5;
		short a2=6;
		int a3=a1+a2;
		
		//char单引号的位置都能放什么 在0-65535之间每个数字都代表着一个字符，如果我们不加单引号,我们能在"="后面写的只有范围内的数字
		char av=97;//=a   65=A 48=0
		System.out.println(av);
		
		//double会丢失精度；
		double c1=1.2;
		double c3=1.1;
		double c4=c1-c3;
		System.out.println(c4);//0.09999999999999987
		
		
		
		
		
	}

}
