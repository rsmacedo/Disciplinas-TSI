package generator.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSequenceGenerator extends generator.AbstractSequenceGenerator
{
	@Override
	public List<Integer> generateSequence(final int MAX)
	{
		List<Integer> list = new ArrayList<>(MAX);
		
		int current = 1;
		int next = Integer.MIN_VALUE;
		int previous = 0;
		
		for(int i=0; i<MAX; i++)
		{
			next = current + previous;
			list.add(next);
			
			if(i==0)
				continue;
			
			previous = current;
			current = next;
		}
		
		return list;
	}
}
