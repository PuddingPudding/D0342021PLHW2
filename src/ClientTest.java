import java.util.Scanner;

public class ClientTest 
{
	public static void main(String args[])
	{
		int choice = 0;
		final int quitOption = 3;
		
		Scanner keyboard = new Scanner(System.in);
		SortArray SA = new SortArray();
		Comparable[] array;
		
		while(choice != quitOption)
		{
			System.out.println("�A�Q�n������?");
			System.out.println("1.�إ߼Ʀr�}�C");
			System.out.println("2.�إߦr��}�C");
			System.out.println(quitOption + ".���}");
			choice = keyboard.nextInt();
			
			switch(choice)
			{
				case 1:
					System.out.println("�аݭn�h�����Ʀr�}�C?");
					array = new SortableInt[keyboard.nextInt()];
					for(int i = 0; i < array.length; i++)
					{
						array[i] = new SortableInt();						
					}
					SA.setArray(array);
					SA.printArray();
					break;
				case 2:
					System.out.println("�аݭn�h�����r��}�C?");
					array = new SortableString[keyboard.nextInt()];
					for(int i = 0; i < array.length; i++)
					{
						array[i] = new SortableString();						
					}
					SA.setArray(array);
					SA.printArray();
					break;
				case quitOption:
					System.out.println("BYE");
					break;
				default:
					System.out.println("���O���~!");
					keyboard.nextLine();
					break;
			}
		}
		
//		Comparable[] array = new SortableString[30];
//		for(int i = 0; i < array.length; i++)
//		{
//			array[i] = new SortableString();
//			System.out.print(array[i] + " ");
//		}
//		
//		System.out.println();
//		SortArray SA = new SortArray();
//		SA.setArray(array);
//		
//		SA.setSortStrategy(new SelectionSort() );
//		array = SA.getSortResult();
//		System.out.println("��ܱƧǪk�����G");
//		for(int i = 0; i < array.length ; i++)
//		{
//			System.out.print(array[i] + " ");
//		}
//		System.out.println();
//				
//		SA.setSortStrategy(new QuickSort() );
//		array = SA.getSortResult();
//		System.out.println("�ֳt�ƧǪk�����G");
//		for(int i = 0; i < array.length ; i++)
//		{
//			System.out.print(array[i] + " ");
//		}
//		
//		System.out.println();
	}
}
