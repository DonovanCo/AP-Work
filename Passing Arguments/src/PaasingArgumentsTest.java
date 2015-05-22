import static org.junit.Assert.*;

import org.junit.Test;


public class PaasingArgumentsTest extends PaasingArguments
	{

	@Test
	public void testConvertInchesToCentimeters()
		{
		assertEquals(5.08, PaasingArguments.convertInchesToCentimeters(2.0), .1);
		}

	@Test
	public void testConvertCentimetersToMeters()
		{
		assertEquals(.02, PaasingArguments.convertCentimetersToMeters(2), 0);
		}

	@Test
	public void testConvertMetersToFeet()
		{
		assertEquals(7, PaasingArguments.convertMetersToFeet(2), 1);
		}

	}
