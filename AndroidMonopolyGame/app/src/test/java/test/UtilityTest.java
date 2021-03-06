package test;

import backEnd.*;
import static junit.framework.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UtilityTest {
	
	Utility util;
	Bank bank;

	@Before
	public void setUp() throws Exception{
		Bank bank = Bank.getInstance();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDescription(){
		util = new Utility("Test", 300, 25, 150);
		String expectedDesc = "Utility\n" + "Test\n" + "Price: 300\n" + "Rent: 25\n" + "Mortgage: 150";
		assertEquals(util.getDescription(), expectedDesc);
	}

}
