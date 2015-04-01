
public class Batter 
{
	public static void main(String[] args)
	{
		System.out.println("batter");
	}
	
	public static double batterRatings(int position)
	{
	double contactRating = 0.400;
	double hitterStrikeoutRating = 0.100;
	double[] batRatings = {contactRating, hitterStrikeoutRating};
	return batRatings[position];
	}
	
	
}
