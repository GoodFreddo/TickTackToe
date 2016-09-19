import static org.junit.Assert.*;
import org.junit.*;
public class COEventTypeTest
{
	@Test
	public void COEventType()
	{
		boolean COEventTypeExists = false;
		COEventType thatEventType = new COEventType("pick");
		COEventType thisEventType = new COEventType(thatEventType,"pack");
		if (thisEventType.getEventType().get(thisEventType.getEventType().size() - 1) != null)
		{
			COEventTypeExists = true;
		}
		assertEquals(true, COEventTypeExists);
	}
}
