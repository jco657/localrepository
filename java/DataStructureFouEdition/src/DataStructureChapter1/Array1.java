package DataStructureChapter1;

public class Array1 {
	public static void print(Object[] value){
		for (Object obj:value){
			System.out.print(obj==null?"null":" "+obj.toString());
		}
		System.out.println();
	}
	//���������
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
		System.out.print(n+"��Ԫ��0-"+size+"֮�����������ϣ�");
		Array1.print(values);
	}
}
