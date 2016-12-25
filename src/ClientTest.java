
public class ClientTest 
{
	public static void main(String args[])
	{
		Comparable[] array = new SortableInt[30];
		for(int i = 0; i < array.length; i++)
		{
			array[i] = new SortableInt();
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		SortArray SA = new SortArray();
		SA.setArray(array);
		
		SA.setSortStrategy(new SelectionSort() );
		array = SA.getSortResult();
		System.out.println("��ܱƧǪk�����G");
		for(int i = 0; i < array.length ; i++)
		{
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		SA.setSortStrategy(new QuickSort() );
		array = SA.getSortResult();
		System.out.println("�ֳt�ƧǪk�����G");
		for(int i = 0; i < array.length ; i++)
		{
			System.out.print(array[i] + " ");
		}
		
		Comparable test = new SortableInt(42);
		SA.setSearchStrategy(new BinarySearch() );
		System.out.println(SA.search(test) );
	}
}
