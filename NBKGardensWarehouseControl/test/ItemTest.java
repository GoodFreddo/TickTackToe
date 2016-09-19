import static org.junit.Assert.*;
import org.junit.*;
public class ItemTest
{
	@Test
	public void ApplyPorous()
	{
		Supplier supplier = new Supplier();
		Item item = new Item("Gnomey", supplier, new int[]
		{ 1, 2, 3 }, 1235, 22, false, false, false, false, 234, 23);
		item.setPorous(false);
		item.ApplyPorous();
		assertTrue("Item is not porous coated", item.isPorous());
	}
	@Test
	public void Item()
	{
		Supplier supplier = new Supplier();
		int[] dimension =new int[]
				{ 1, 2, 3 };
		Item item = new Item("Gnomey", supplier,dimension , 1235, 22, true, true, true, true, 234, 23);
		assertEquals("name is not set", "Gnomey", item.getProductName());
		assertEquals("supplier is not set", supplier, item.getPreferredSupplier());
		assertEquals("dimensions is not set", dimension, item.getDimensions());
		assertEquals("id is not set", 1235, item.getId());
		assertEquals("weight is not set", 22, item.getWeight());
		assertEquals("sell is not set", 234, item.getSellPrice(),0);
		assertEquals("buy is not set", 23, item.getBuyPrice(),0);
		assertEquals("fragile is not set", true, item.isFragile());
		assertEquals("wrapped is not set", true, item.isIndividuallyWrapped());
		assertEquals("porous is not set", true, item.isPorous());
		assertEquals("can be porous is not set", true, item.isCanBePorous());
	}
	@Test
	public void ModifyItemDetails()
	{
		Supplier supplier = new Supplier();
		int[] dimension =new int[]
				{ 1, 2, 3 };
		Item item = new Item("Gnomey", supplier,dimension , 1235, 22, true, true, true, true, 234, 23);
		item.ModifyItemDetails();
		assertNotEquals("Name has been changed","Gnomey",item.getProductName());
	}
	@Test
	public void SetNewPrice()
	{
		Supplier supplier = new Supplier();
		int[] dimension =new int[]
				{ 1, 2, 3 };
		Item item = new Item("Gnomey", supplier,dimension , 1235, 22, true, true, true, true, 234, 23);
		item.SetNewPrice();
		assertEquals("Sell has been changed",300,item.getSellPrice(),0);
	}
}
