import static org.junit.Assert.*;
import org.junit.*;
public class COEventTest
{
	@Test
	public void COEvent()
	{
		boolean COEventIsInitiated = false;
		COEventType eventType = new COEventType("pick");
		Employee man = new Employee();
		COEvent event = new COEvent(eventType,man);
		if (event.getEmployeeActuator() != null && event.getEvent() !=null&& event.getEventTime()!=null)
		{
			COEventIsInitiated = true;
		}
		assertEquals(COEventIsInitiated, true);
	}
}
