
public class Baby
	{
		private String name; 
		private double weight;
		private boolean isGirl;
		
		public Baby(String n, double w, boolean g)
		{
			name = n;
			weight = w;
			isGirl = g;
		}
		
		//not public void because it is returning
		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				//or can be name = n;
				this.name = name;
			}

		public double getWeight()
			{
				return weight;
			}

		public void setWeight(double weight)
			{
				this.weight = weight;
			}

		public boolean isGirl()
			{
				return isGirl;
			}

		public void setGirl(boolean isGirl)
			{
				this.isGirl = isGirl;
			}

		public static void barf()
		{
			System.out.println("Yuck, the baby threw up. They should be cleaned up");
		}
	}
