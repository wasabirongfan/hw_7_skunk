import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class SkunkAppTest
{

	@Before
	public void setUp() throws Exception
	{
	}

	@Test
	public void test_new_dice_can_be_created()
	{
		Dice d = new Dice();
		assertTrue("new dice instance not null", d != null);
	}

	@Test
	public void test_new_dice_will_roll_double_skunk_first()
	{
		Dice d = new Dice(new int[]
		{ 1 }, new int[]
		{ 1 });
		d.roll();
		assertEquals("first die is not 1", 1, d.getDie1Roll());
		assertEquals("second die is not 1", 1, d.getDie2Roll());
	}

	@Test
	public void test_new_dice_rolls_boxcars_then_double_skunck()
	{
		Dice d = new Dice(new int[]
		{ 6, 1 }, new int[]
		{ 6, 1 });
		d.roll();
		assertEquals("first die is not 6", 6, d.getDie1Roll());
		assertEquals("second die is not 6", 6, d.getDie2Roll());

		d.roll();
		assertEquals("first die is not 1", 1, d.getDie1Roll());
		assertEquals("second die is not 1", 1, d.getDie2Roll());

	}
	
	@Test
	public void boolean_test_new_dice_rolls_boxcars_then_double_skunck()
	{
		Dice d = new Dice(new int[]
		{ 6, 1 }, new int[]
		{ 6, 1 });
		d.roll();
		
		assertTrue( "first is", 6 == d.getDie1Roll());
		assertTrue( "first die is not 1", 1 != d.getDie2Roll());	

		d.roll();
		
		assertTrue( "first is", 1 == d.getDie1Roll());
		assertTrue( "first die is not 6", 6 != d.getDie2Roll());	


	}
	
	
}
