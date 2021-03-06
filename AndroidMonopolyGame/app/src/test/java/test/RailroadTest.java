package test;

import backEnd.*;
import static junit.framework.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RailroadTest {
	
	Railroad rail;
	Bank bank;

	@Before
	public void setUp() throws Exception{
		bank = Bank.getInstance();
	}

	@After
	public void tearDown() throws Exception{
	}
	
	@Test
	public void testDescription(){
		rail = new Railroad("Test", 300, 25, 150);
		String expectedDesc = "Railroad\n" + "Test\n" + "Price: 300\n" + "Rent: 25\n" + "Mortgage: 150";
		assertEquals(rail.getDescription(), expectedDesc);
	}

}
