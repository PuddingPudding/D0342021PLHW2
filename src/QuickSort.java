
public class QuickSort implements SortStrategy 
{
	int totalTimes = 0;
	private void quickSort(Comparable[] input , int left , int right)
	{
		if(left >= right)
		{
			return;
		}
		else
		{
			int i = left+1 , j = right;
			while(i < j)
			{
				totalTimes++;
				while(input[i].compareTo(input[left]) != Comparable.BIGGER && i < j)
				{
					i++;
				}
				totalTimes++;
				while(input[j].compareTo(input[left]) != Comparable.SMALLER && i < j)
				{
					j--;
				}
				if(i < j)
				{
					Comparable temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
			if(input[left].compareTo(input[i]) == Comparable.SMALLER)
			{
				i--;
			}
			Comparable temp = input[i];
			input[i] = input[left];
			input[left] = temp;
			this.quickSort(input, left , i-1);
			this.quickSort(input, i+1 , right);
		}
	}
	
	@Override
	public void sort(Comparable[] input) {
		this.quickSort(input, 0 , input.length-1);
		System.out.println(totalTimes);
	}

	@Override
	public Comparable[] getSortResult(Comparable[] input) {
		// TODO Auto-generated method stub
		Comparable[] output = input.clone();
		this.sort(output);
		return output;
	}

}
