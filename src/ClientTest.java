import java.util.Scanner;

public class ClientTest 
{
	public static void main(String args[])
	{
		int choice = 0;
		final int quitOption = 8;
		
		Scanner keyboard = new Scanner(System.in);
		SortArray SA = new SortArray();
		SortArray SATemp = new SortArray();
		Comparable[] array;
		Comparable element = null;
		
		while(choice != quitOption)
		{
			System.out.println("�A�Q�n������?");
			System.out.println("1.�إ߼Ʀr�}�C");
			System.out.println("2.�إߦr��}�C");
			System.out.println("3.�Ƨ� (�ο�ܱƧǪk)");
			System.out.println("4.�Ƨ� (�Χֳt�ƧǪk)");
			System.out.println("5.�����ܻP�ֳt�ƧǪk(���|�v�T���}�C)");
			System.out.println("6.�j�M��� (�j�M�e�|���N��ƱƧǡA�ϥδ`�Ƿj�M�k)");
			System.out.println("7.�j�M��� (�j�M�e�|���N��ƱƧǡA�ϥΤG���j�M�k)");
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
				case 3:
					if(SA.array != null)
					{
						SA.setSortStrategy(new SelectionSort() );
						SA.printArray();
						SA.sort();
						System.out.println("�g��ܱƧǫ�");
						SA.printArray();
					}
					else
					{
						System.out.println("�|�L���");
					}
					break;
				case 4:
					if(SA.array != null)
					{
						SA.setSortStrategy(new QuickSort() );
						SA.printArray();
						SA.sort();
						System.out.println("�g�ֳt�Ƨǫ�");
						SA.printArray();
					}
					else
					{
						System.out.println("�|�L���");
					}
					break;
				case 5:
					if(SA.array != null)
					{
						System.out.println("��}�C\n");
						SA.printArray();
						
						SA.setSortStrategy(new SelectionSort() );
						SATemp.setArray(SA.getSortResult() );
						SATemp.printArray();
						SA.printScanTimes();
						
						SA.setSortStrategy(new QuickSort() );
						SATemp.setArray(SA.getSortResult() );
						SATemp.printArray();
						SA.printScanTimes();
					}
					else
					{
						System.out.println("�|�L���");
					}
					break;
				case 6:
					if(SA.array != null)
					{
						if(SA.array instanceof SortableInt[])
						{
							element = new SortableInt();							
						}
						else if(SA.array instanceof SortableString[])
						{
							element = new SortableString();							
						}
						SA.setSortStrategy(new QuickSort() );
						SA.setSearchStrategy(new SequentialSearch() );
						System.out.println("���j�M����Ƭ� " + element);
						System.out.println(SA.search(element) );
					}
					else
					{
						System.out.println("�|�L���");
					}
					break;
				case 7:
					if(SA.array != null)
					{
						if(SA.array instanceof SortableInt[])
						{
							element = new SortableInt();							
						}
						else if(SA.array instanceof SortableString[])
						{
							element = new SortableString();							
						}
						SA.setSortStrategy(new QuickSort() );
						SA.setSearchStrategy(new BinarySearch() );
						System.out.println("���j�M����Ƭ� " + element);
						System.out.println(SA.search(element) );
					}
					else
					{
						System.out.println("�|�L���");
					}
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
