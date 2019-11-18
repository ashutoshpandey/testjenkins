package com.educo.junittest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MathUtilityTest {
	
	private MathUtility utility;
	
	@Before
	public void initialize() {
		utility = new MathUtility();
	}

	@Test
	public void testSquare() {
		int sq = utility.square(4);
		Assert.assertEquals(16, sq);
	}
	
	@Test
	public void testAdd() {
		int sum = utility.add(5, 5);
		Assert.assertEquals(10, sum);
	}
}
