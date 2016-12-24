
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
	public Comparable[] getSortResult(Comparable[] input) {
		Comparable[] output = input.clone();
		for(int i = 0 ;i < output.length ; i++)
		{
			for(int j = i+1 ; j < output.length ; j++)
			{
				if(output[i].compareTo(output[j]) == Comparable.SMALLER)
				{
					Comparable temp = output[i];
					output[i] = output[j];
					output[j] = output[i];
				}
			}			
		}	
		return output;
	}

}
