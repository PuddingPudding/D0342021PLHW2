
public class SelectionSort implements SortStrategy {

	@Override
	public void sort(Comparable[] input) 
	{		
		for(int i = 0 ;i < input.length ; i++)
		{
			for(int j = i+1 ; j < input.length ; j++)
			{
				if(input[i].compareTo(input[j]) == Comparable.BIGGER)
				{
					Comparable temp = input[i];
					input[i] = input[j];
					input[j] = temp;
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

}
