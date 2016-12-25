
public class SelectionSort implements SortStrategy {

	int totalTimes = 0;
	@Override
	public void sort(Comparable[] input) 
	{		
		totalTimes = 0;
		boolean switchFlag = true; //在這一輪檢查中，是否有出現交換的動作
		for(int i = 0 ;i < input.length && switchFlag ; i++)
		{
			switchFlag = false;
			for(int j = i+1 ; j < input.length ; j++)
			{
				totalTimes++;
				if(input[i].compareTo(input[j]) == Comparable.BIGGER)
				{
					Comparable temp = input[i];
					input[i] = input[j];
					input[j] = temp;
					switchFlag = true;
				}
			}
		}
	}

	@Override
	public Comparable[] getSortResult(Comparable[] input) 
	{
		Comparable[] output = input.clone();
		this.sort(output);
		return output;
	}

	@Override
	public String getScanTime() 
	{
		System.out.println("選擇排序法之掃描次數: " + totalTimes);
		return null;
	}

}
