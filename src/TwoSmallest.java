
public class TwoSmallest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter terminating number");
		double term=IO.readDouble();
		
		System.out.println ("Enter numbers");
		double entered;
		double smallestOne;
		double smallestTwo;
		entered=IO.readDouble();
		
		if (entered!=term)
		{
			smallestOne=entered;
			smallestTwo=entered;
			do
			{
				entered=IO.readDouble();
				
				if (entered!=term && entered<=smallestOne)
				{
					smallestTwo=smallestOne;
					smallestOne=entered;
							
				}
					

				


				
				
			} while (entered!=term);
			IO.outputDoubleAnswer(smallestOne);	
			IO.outputDoubleAnswer(smallestTwo);
		}
		


		System.out.println("Ended");		

	}

}
