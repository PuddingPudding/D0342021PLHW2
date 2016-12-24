
public class SelectionSort implements SortStrategy {

	@Override
	public Comparable[] sort(Comparable[] input) {		
		for(int i = 0 ;i < input.length ; i++)
		{
			for(int j = i+1 ; j < input.length ; j++)
			{
				if(input[i].compareTo(input[j]) == Comparable.SMALLER)
				{
					Comparable temp = input[i];
					input[i] = input[j];
					input[j] = input[i];
				}
			}			
		}		
		return input;
	}

	@Override
	public Comparable[] getSortResult(Comparable[] input) 
	{
		Comparable[] output = input.clone();
			
		return sort(output);
	}

}
