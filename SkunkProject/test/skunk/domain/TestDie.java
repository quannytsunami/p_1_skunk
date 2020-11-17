package skunk.domain;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class TestDie
{
	@Test
	public void test_Die_Roll_Value()
	{
		Die die = new Die();
		die.roll();
        assertTrue(die.getLastRoll() >= 1 && die.getLastRoll() <= 6);
	}
	
}
