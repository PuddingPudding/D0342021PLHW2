import java.util.Random;

public class SortableInt implements Comparable {
	int value;
	
	public SortableInt()
	{
		this.value = new Random().nextInt(100);
	}
	
	@Override
	public int compareTo(Comparable input) 
	{
		if(input == null || this.getClass() != input.getClass() )
		{
			return Comparable.ERROR;
		}
		else
		{
			SortableInt obj = (SortableInt)input;
			if(this.value > obj.value)
			{
				return Comparable.BIGGER;
			}
			else if(this.value == obj.value)
			{
				return Comparable.SAME;
			}
			else
			{
				return Comparable.SMALLER;
			}
		}
	}

	public String toString()
	{
		return "" + this.value;
	}
}
