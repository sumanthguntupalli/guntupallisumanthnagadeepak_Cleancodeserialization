package houseconstruction;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratecostTest {

	@Test
	public void testCost() {
		Generatecost testObject= new Generatecost();
		assertEquals(2400.00,testObject.Cost("standard", 2),0);
	}

}
