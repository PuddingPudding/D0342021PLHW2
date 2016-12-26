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
			System.out.println("你想要做什麼?");
			System.out.println("1.建立數字陣列");
			System.out.println("2.建立字串陣列");
			System.out.println("3.排序 (用選擇排序法)");
			System.out.println("4.排序 (用快速排序法)");
			System.out.println("5.比較選擇與快速排序法(不會影響到原陣列)");
			System.out.println("6.搜尋資料 (搜尋前會先將資料排序，使用循序搜尋法)");
			System.out.println("7.搜尋資料 (搜尋前會先將資料排序，使用二元搜尋法)");
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
				case 3:
					if(SA.array != null)
					{
						SA.setSortStrategy(new SelectionSort() );
						SA.printArray();
						SA.sort();
						System.out.println("經選擇排序後");
						SA.printArray();
					}
					else
					{
						System.out.println("尚無資料");
					}
					break;
				case 4:
					if(SA.array != null)
					{
						SA.setSortStrategy(new QuickSort() );
						SA.printArray();
						SA.sort();
						System.out.println("經快速排序後");
						SA.printArray();
					}
					else
					{
						System.out.println("尚無資料");
					}
					break;
				case 5:
					if(SA.array != null)
					{
						System.out.println("原陣列\n");
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
						System.out.println("尚無資料");
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
						System.out.println("欲搜尋的資料為 " + element);
						System.out.println(SA.search(element) );
					}
					else
					{
						System.out.println("尚無資料");
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
						System.out.println("欲搜尋的資料為 " + element);
						System.out.println(SA.search(element) );
					}
					else
					{
						System.out.println("尚無資料");
					}
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
