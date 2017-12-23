package dataStructureChapter2;

public class SeqList<T> extends Object
{
	protected Object[] element;
	protected int n;
	public SeqList(int length)
	{
		this.element = new Object[length];
		this.n = 0;
	}
	public SeqList()
	{
		this(64);
	}
	public SeqList(T[] values)
	{
		this(values.length);
		for(int i=0;i<values.length;i++)
			this.element[i]=values[i];
		this.n = element.length;
	}
}
