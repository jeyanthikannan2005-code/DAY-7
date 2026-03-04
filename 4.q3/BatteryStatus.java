class BatteryStatus
{
	public static void main(String[] args)
	{
		int per=22;
		if(per>=80)
		{
			System.out.println("BATTERY FULL");
		}
		else if(per<=79 && per>=30)
		{
			System.out.println("BATTERY NORMAL");
		}
		else if(per<30)
		{
			System.out.println("LOW BATTERY-CHARGE NOW");
		}
		else
		{
			System.out.println("ENTER THE VALID PERCENTAGE");
		}
	}
}