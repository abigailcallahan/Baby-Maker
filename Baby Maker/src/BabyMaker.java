
public class BabyMaker
	{

		public static void main(String[] args)
			{
				Baby myBaby = new Baby("Abigail", 7.4, true);
				Baby myBaby2 = new Baby("Brian", 5.4, false);
				
				System.out.println("My first baby is " + myBaby.name + " and she weighs " + myBaby.weight + " lbs.");
				
				if(myBaby2.isGirl)
					{
						System.out.println("She is so cute");
					}
				else if(!myBaby2.isGirl)
					{
						System.out.println("That boy is small");
					}

			}

	}
