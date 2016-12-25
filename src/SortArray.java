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
	
	public void sort() //要求物件自己進行排序
	{
		this.sortStrategy.sort(this.array);
	}
	public Comparable[] getSortResult() //在不動到原陣列的情況下，去獲得排序後的結果
	{
		return this.sortStrategy.getSortResult(this.array);
	}
	
	public int search(Comparable input)
	{
		this.sort();
		System.out.println("已完成搜尋前的排序動作");
		return this.searchStrategy.search(this.array , input);
	}
}
