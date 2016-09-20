import java.util.Scanner;
public class Coord
{
	private int[] location = new int[2];
	public int[] getLocation()
	{
		return location;
	}
	public Coord(int x, int y)
	{
		location[0] = x;
		location[1] = y;
	}
	public Coord(String name)
	{
		System.out.println(String.format("Player %s's turn.\nEnter 'X' coordinate:", name));
		userCoordInput(1);
		System.out.println("Enter 'Y' coordinate:");
		userCoordInput(0);
	}
	public void userCoordInput(int number)
	{
		
		boolean sucessfullIntAssign = false;
		do
		{
			try
			{
				Scanner scunner = new Scanner(System.in);
				int locale = scunner.nextInt() - 1;
				if (locale > 2 || locale < 0)
				{
					System.out.println("Invalid coordinate... stop cheating and try again.");
					continue;
				}
				location[number] = locale;
				sucessfullIntAssign = true;
			} catch (Exception e)
			{
				System.out.println("Invalid coordinate... stop cheating and try again.");
				continue;
			}
		} while (!sucessfullIntAssign);
	}
}
