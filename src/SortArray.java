public class SortArray 
{
	Comparable[] array;
	private SortStrategy sortStrategy;
	public SortArray()
	{
	}
	public void setArray(Comparable[] input)
	{
		this.array = input;
	}
	public void setSortStrategy(SortStrategy input)
	{
		this.sortStrategy = input;
	}
	
	public Comparable[] sort() //�n�D����ۤv�i��Ƨ�
	{
		return this.sortStrategy.sort(this.array);
	}
	public Comparable[] getSortResult() //�b���ʨ��}�C�����p�U�A�h��o�Ƨǫ᪺���G
	{
		return this.sortStrategy.getSortResult(this.array);
	}
}
