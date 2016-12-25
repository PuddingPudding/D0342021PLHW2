
public class BinarySearch implements SearchStrategy 
{
	@Override
	public int search(Comparable[] array, Comparable target) 
	{
		int i = 0 , j = array.length-1 , output = -1 , middle = (i+j)/2;
		if(array.length != 0)
		{
			boolean searchFlag = false;
			while(i != middle && !searchFlag)
			{
				middle = (i+j)/2;
				if(array[i].compareTo(target) == Comparable.SAME)
				{
					output = i;
					searchFlag = true;
				}
				else if(array[j].compareTo(target) == Comparable.SAME)
				{
					output = j;
					searchFlag = true;
				}
				else if(array[middle].compareTo(target) == Comparable.SAME)
				{
					output = middle;
					searchFlag = true;
				}
				else
				{
					if(array[middle].compareTo(target) == Comparable.BIGGER)
					{
						j = middle;
					}
					else if(array[middle].compareTo(target) == Comparable.SMALLER)
					{
						i = middle;
					}
				}
			}
		}
		return output;
	}

}
