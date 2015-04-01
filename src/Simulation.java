
public class Simulation 
{
	static double pitcherHitRating;
	double pitcherStrikoutRating;
	static double hitterContactRating;
	double hitterStrikeoutRating;
	static String atBatResult;
	public static void main(String[] args) 
	{
	atBatResult = atBatResult();
	System.out.println(atBatResult);
	}
	
	public static double pitcherRatings(int position)
	{
	double hitRating = 0.780;
	double pitcherStrikeoutRating = .220;
	double[] pitchRatings = {hitRating, pitcherStrikeoutRating};
	return pitchRatings[position];
	}
	
//	public static double batterRatings(int position)
//	{
//	double contactRating = 0.400;
//	double hitterStrikeoutRating = 0.100;
//	double[] batRatings = {contactRating, hitterStrikeoutRating};
//	return batRatings[position];
//	}
	
	public static double hitPercentage()
	{
		double receivePitcherHitRating = pitcherRatings(0);
		double receiveBatterContactRating = batterRatings(0);
		double chanceOfHit = receivePitcherHitRating*receiveBatterContactRating;
		return chanceOfHit;
	}
	
	public static double strikeoutPercentage()
	{
		double receivePitcherStrikeoutRating = pitcherRatings(1);
		double receiveBatterStrikeoutRating = batterRatings(1);
		double chanceOfStrikeout = receivePitcherStrikeoutRating * receiveBatterStrikeoutRating;
		return chanceOfStrikeout;
	}
	
	public static String atBatResult ()
	{
		double receiveChanceOfHit = hitPercentage();
		double receiveChanceOfStrikeout = strikeoutPercentage();
		double chanceOfHitAndStrikeout = receiveChanceOfHit + receiveChanceOfStrikeout;
		double randomNumber = Math.random();
		if (randomNumber <= receiveChanceOfHit)
		{
			return "Hit " + randomNumber;
		}
		else if (randomNumber > receiveChanceOfHit && randomNumber <= chanceOfHitAndStrikeout)
		{
			return "StrikeOut " + randomNumber;
		}
		else
			return "Out " + randomNumber;
	}
	
}
