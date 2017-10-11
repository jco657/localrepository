package DataStructureChapter1;

public class Array1 {
	public static void print(Object[] value){
		for (Object obj:value){
			System.out.print(obj==null?"null":" "+obj.toString());
		}
		System.out.println();
	}
	//产生随机数
	public static Integer[] randomInteger(int n,int size){
		Integer[] values = new Integer[n];
		for(int i=0;i<values.length;i++){
			values[i] = new Integer((int)(Math.random()*size));
		}
		
		return values;
	}
	
	public static void main(String[] args){
		int n=10,size=100;
		Integer[] values = Array1.randomInteger(n, size);
		System.out.print(n+"个元素0-"+size+"之间的随机数集合：");
		Array1.print(values);
	}
}
