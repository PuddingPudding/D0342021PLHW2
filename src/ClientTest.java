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
			System.out.println("你想要做什麼?");
			System.out.println("1.建立數字陣列");
			System.out.println("2.建立字串陣列");
			System.out.println(quitOption + ".離開");
			choice = keyboard.nextInt();
			
			switch(choice)
			{
				case 1:
					System.out.println("請問要多長的數字陣列?");
					array = new SortableInt[keyboard.nextInt()];
					for(int i = 0; i < array.length; i++)
					{
						array[i] = new SortableInt();						
					}
					SA.setArray(array);
					SA.printArray();
					break;
				case 2:
					System.out.println("請問要多長的字串陣列?");
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
					System.out.println("指令錯誤!");
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
//		System.out.println("選擇排序法之結果");
//		for(int i = 0; i < array.length ; i++)
//		{
//			System.out.print(array[i] + " ");
//		}
//		System.out.println();
//				
//		SA.setSortStrategy(new QuickSort() );
//		array = SA.getSortResult();
//		System.out.println("快速排序法之結果");
//		for(int i = 0; i < array.length ; i++)
//		{
//			System.out.print(array[i] + " ");
//		}
//		
//		System.out.println();
	}
}
