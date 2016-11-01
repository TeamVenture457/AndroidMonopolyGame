package test;

import backEnd.*;
import static junit.framework.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DiceTest {
	
	private Dice d1;
	private int die;
	private boolean result;
	
	@Before
	public void setUp() throws Exception {
		d1 = new Dice();
	}

	@After
	public void tearDown() throws Exception {
		d1 = null;
	}

	@Test
	public void diceValues1to6Test() {
		for(int i = 0; i < 100; i++){
			d1.rollDice();
			die = d1.getDie1();
			if(die < 1 || die > 6){
				result = false;
			}
			else{
				result = true;
			}
			assertTrue(result);
		}
	}
}
