public class SortArray 
{
	Comparable[] array;
	private SortStrategy sortStrategy;
	public SortArray()
	{
	}
	public void setArray(Comparable[] input)
	{
		this.array = input.clone();
	}
	public Comparable[] getArray()
	{
		return this.array;
	}
	
	public void setSortStrategy(SortStrategy input)
	{
		this.sortStrategy = input;
	}
	
	public void sort() //�n�D����ۤv�i��Ƨ�
	{
		this.sortStrategy.sort(this.array);
	}
	public Comparable[] getSortResult() //�b���ʨ��}�C�����p�U�A�h��o�Ƨǫ᪺���G
	{
		return this.sortStrategy.getSortResult(this.array);
	}
}
