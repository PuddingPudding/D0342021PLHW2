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
	
	public void sort() //要求物件自己進行排序
	{
		this.sortStrategy.sort(this.array);
	}
	public Comparable[] getSortResult() //在不動到原陣列的情況下，去獲得排序後的結果
	{
		return this.sortStrategy.getSortResult(this.array);
	}
}
