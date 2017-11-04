
public class Dice
{

	private int[] die1Rolls;
	private int[] die2Rolls;
	private int loadedDieIndex;

	private int lastDie1Roll;
	private int lastDie2Roll;

	public Dice()
	{

	}

	public Dice(int[] die1Rolls, int[] die2Rolls)
	{
		loadedDieIndex = 0;
		this.die1Rolls = die1Rolls;
		this.die2Rolls = die2Rolls;
	}

	public int getDie1Roll()
	{
		return lastDie1Roll;
	}

	public int getDie2Roll()
	{
		return lastDie2Roll;
	}

	public void roll()
	{
		lastDie1Roll = die1Rolls[loadedDieIndex];
		lastDie2Roll = die2Rolls[loadedDieIndex];
		loadedDieIndex++;
	}

	// public static final int NUM_TRIALS = 360;

	public static void main(String[] args)
	{
		// Dice dice1 = new Dice();
		// int snakeEyesCount = 0;
		//
		// for (int i = 0; i < NUM_TRIALS; i++)
		// {
		// dice1.roll();
		// System.out.println(dice1);
		//
		// if (dice1.getDie2Roll() == 2)
		// snakeEyesCount++;
		// }
		//
		// System.out.println("Actual count: " + snakeEyesCount);
		// System.out.println("Expected count: " + (NUM_TRIALS / 36.0));
	}

}
