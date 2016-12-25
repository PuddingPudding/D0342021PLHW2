
public class ClientTest 
{
	public static void main(String args[])
	{
		Comparable[] array = new SortableString[30];
		for(int i = 0; i < array.length; i++)
		{
			array[i] = new SortableString();
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		SortArray SA = new SortArray();
		SA.setArray(array);
		
		SA.setSortStrategy(new SelectionSort() );
		array = SA.getSortResult();
		System.out.println("選擇排序法之結果");
		for(int i = 0; i < array.length ; i++)
		{
			System.out.print(array[i] + " ");
		}
		System.out.println();
				
		SA.setSortStrategy(new QuickSort() );
		array = SA.getSortResult();
		System.out.println("快速排序法之結果");
		for(int i = 0; i < array.length ; i++)
		{
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
	}
}
