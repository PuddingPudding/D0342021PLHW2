import java.util.Random;

public class SortableString implements Comparable {

	String string;
	
	public SortableString()
	{
		this.string = "";
		int length = new Random().nextInt(7) + 3;
		for(int i = 0 ; i < length ; i++)
		{
			this.string += (char)(new Random().nextInt(26) + 'a');
		}
	}
	
	@Override
	public int compareTo(Comparable input) {
		// TODO Auto-generated method stub
		if(input == null || this.getClass() != input.getClass() )
		{
			return Comparable.ERROR;
		}
		else
		{
			SortableString obj = (SortableString)input;
			if(this.string.compareTo(obj.string) > 0)
			{
				return Comparable.BIGGER;
			}
			else if(this.string.compareTo(obj.string) == 0)
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
		return this.string;
	}
	
}
