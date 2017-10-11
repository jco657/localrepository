package DataStructureChapter1;

public class Array1 {
	
	public static void main(String[] args){
		int n=10,size=100;
		Integer[] values = Array1.randomDiffInteger1(n, size);
		System.out.print(n+"个元素0-"+size+"之间的随机数集合：");
		Array1.print(values);
	}
	
	//输出随机数
	public static void print(Object[] value){
		for(Object obj:value){
			System.out.print(obj==null?"null":" "+obj.toString());
		}
		System.out.println();
	}
	
	//产生随机数
	public static Integer[] randomInteger(int n,int size){
		Integer[] values = new Integer[n];
		for(int i=0;i<values.length;i++){
			values[i] = new Integer((int)(Math.random()*size));//java.lang.Math.random()方法产生0-1之间double类型的随机数
		}
		
		return values;
	}
	
	//产生不同的随机数，case1：利用循环+label
	public static Integer[] randomDiffInteger1(int n,int size){
		Integer[] values = new Integer[n];
		for(int i=0;i<values.length;i++){
			if(0==i){
				values[i] = new Integer((int)(Math.random()*size));
			}else{
				label:
				{
					Integer tempValue = new Integer((int)(Math.random()*size));
					for(int j=0;j<=i;j++){
						if(tempValue == values[j]){
							break label;
						}else{
							values[i] = tempValue;
						}
					}
				}
			}
		}
		return values;
	}
	//产生不同的随机数，case2：利用asList()方法
	public static Integer[] randomDiffInteger2(int n,int size){
		Integer[] values = new Integer[n];
		for(int i=0;i<values.length;i++){
			if(0==i){
				values[i] = new Integer((int)(Math.random()*size));
			}else{
				Integer tempValues = new Integer((int)(Math.random()*size));
				if 
			}
		}
		return values;
	}
}
