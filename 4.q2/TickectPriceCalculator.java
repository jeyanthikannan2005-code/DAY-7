class TickectPriceCalculator
{
	public static void main(String[] args)
	{
		int age=61;
		if(age<12)
		{
			System.out.println("Let me check in children ticket");
			System.out.println("Pay rs 80");
		}
		else
		{
			System.out.println("Not eligible for children ticket");
			System.out.println("Let me check in adult ticket");
		}
			
		if((age<=59) && (age>=12))
		{
			System.out.println("Pay rs 150");
		}
		else
		{
			System.out.println("Not eligible for adult ticket");
			System.out.println("Let me check in senior ticket");
		}
		if(age>=60)
		{
			System.out.println("Pay rs 100");
		}
		else
		{
			System.out.println("Enter the vaild age");
		}
		
	}
}
			