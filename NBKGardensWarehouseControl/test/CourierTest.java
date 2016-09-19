import static org.junit.Assert.*;
import org.junit.*;
public class CourierTest
{
	@Test
	public void Courier()
	{
		Courier fastBoy = new Courier("Speedy Delivery", "There", "012346548");
		boolean fastBoyIsFast = false;
		if (fastBoy.getCourierName() != null && fastBoy.getAddress() != null && fastBoy.getContactNumber() != null)
		{
			fastBoyIsFast = true;
		}
		assertTrue("Courier is constructed with information", fastBoyIsFast);
	}
	@Test
	public void COcollectOrder()
	{
		Courier fastBoy = new Courier("Speedy Delivery", "There", "012346548");
		boolean orderCollected = false;
		CO co = new CO();
		fastBoy.collectOrder(co);
		assertTrue("Returnafied that the order is collected", orderCollected);
	}
	@Test
	public void deliverOrder()
	{
		Courier fastBoy = new Courier("Speedy Delivery", "There", "012346548");
		boolean orderDelivered = false;
		CO co = new CO();
		co.getCurrentEvent().add(new COEvent(new COEventType("pick"), new Employee()));
		fastBoy.deliverOrder(co);
		if (co.getCurrentEvent().get(co.getCurrentEvent().size() - 1).getEvent()
				.get(co.getCurrentEvent().get(co.getCurrentEvent().size() - 1).getEvent().size() - 1).getEventType()
				.get(co.getCurrentEvent().get(co.getCurrentEvent().size() - 1).getEvent()
						.get(co.getCurrentEvent().get(co.getCurrentEvent().size() - 1).getEvent().size() - 1)
						.getEventType()
						.get(co.getCurrentEvent().get(co.getCurrentEvent().size() - 1).getEvent().size() - 1)
						.getEventType().size() - 1)
				.getName() == "delivered")
		{
			orderDelivered = true;
		}
		assertTrue("Returnafied that the order is deli-byrd", orderDelivered);
	}
	@Test
	public void POdeliverOrder()
	{
		Courier fastBoy = new Courier("Speedy Delivery", "There", "012346548");
		boolean orderDelivered = false;
		PO po = new PO();
		fastBoy.deliverOrder(po);
		if (po.isRecieved())
		{
			orderDelivered = true;
		}
		assertTrue("Returnafied that the order is deli-byrd", orderDelivered);
	}
}
