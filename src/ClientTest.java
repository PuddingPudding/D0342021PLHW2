
public class ClientTest 
{
	public static void main(String args[])
	{
		Comparable[] array = new SortableInt[10];
		for(int i = 0; i < array.length; i++)
		{
			array[i] = new SortableInt();
			System.out.print(array[i] + " ");
		}
		System.out.println();
		SortArray SA = new SortArray();
		SA.setArray(array);
		SA.setSortStrategy(new SelectionSort() );
		SA.sort();
		for(int i = 0; i < array.length ; i++)
		{
			System.out.print(array[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < array.length ; i++)
		{
			System.out.print(SA.getArray()[i] + " ");
		}
	}
}
