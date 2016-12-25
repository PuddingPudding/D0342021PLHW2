public class SortArray 
{
	Comparable[] array;
	private SortStrategy sortStrategy;
	private SearchStrategy searchStrategy;
	
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
	
	public void setSearchStrategy(SearchStrategy input)
	{
		this.searchStrategy = input;
	}
	
	public void sort() //�n�D����ۤv�i��Ƨ�
	{
		this.sortStrategy.sort(this.array);
	}
	public Comparable[] getSortResult() //�b���ʨ��}�C�����p�U�A�h��o�Ƨǫ᪺���G
	{
		return this.sortStrategy.getSortResult(this.array);
	}
	
	public int search(Comparable input)
	{
		this.sort();
		System.out.println("�w�����j�M�e���Ƨǰʧ@");
		return this.searchStrategy.search(this.array , input);
	}
}
