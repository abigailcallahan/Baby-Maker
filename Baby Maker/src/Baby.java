
public class Baby
	{
		String name; 
		double weight;
		boolean isGirl;
		
		public Baby(String n, double w, boolean g)
		{
			name = n;
			weight = w;
			isGirl = g;
		}
		
		public static void barf()
		{
			System.out.println("Yuck, the baby threw up. They should be cleaned up");
		}
	}
