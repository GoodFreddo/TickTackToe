import static org.junit.Assert.*;
import org.junit.*;
public class COTest
{
	@Test
	public void CO()
	{
		boolean COExists = false;
		CO co = new CO();
		if (co.getCoID() != null && co.getCurrentEvent() != null && !co.isPackaged() && co.getDateOrdered() != null
				&& co.getDateShipped() != null)
		{
			COExists = true;
		}
		assertTrue(COExists);
	}
	@Test
	public void ammendOrder()
	{
		CO co = new CO();
		Supplier supplier = new Supplier();
		Item addThis = new Item("Gnomey", supplier, new int[]{1,2,3}, 1234, 22, false, false, false, false, 234, 23);
		Item removeThis = new Item("Gnomey2", supplier, new int[]{1,2,3}, 1235, 22, false, false, false, false, 234, 23);
		co.ammendOrder(removeThis,null);
		co.ammendOrder(addThis,removeThis);
		assertTrue(co.getContents().get(co.getContents().size()-1)==addThis);
	}
	@Test
	public void calculateOrderTotal()
	{
		CO co = new CO();
		Supplier supplier = new Supplier();
		Item addThis = new Item("Gnomey", supplier, new int[]{1,2,3}, 1234, 22, false, false, false, false, 234, 23);
		Item addAlsoThis = new Item("Gnomey2", supplier, new int[]{1,2,3}, 1235, 22, false, false, false, false, 234, 23);
		addThis.setSellPrice(20.0);
		addAlsoThis.setSellPrice(45.00);
		co.ammendOrder(addThis,null);
		co.ammendOrder(addAlsoThis,null);
		co.calculateOrderTotal();
		assertTrue(co.getTotalCost() == 65.00);
	}
//	@Test
//	public void cancelOrder()
//	{
//		
//	}
}
