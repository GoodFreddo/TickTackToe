import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.*;
public class CustomerTest
{
	@Test
	public void Customer()
	{
		Customer john = new Customer("John", 1234);
		boolean customerExists = false;
		if (john.getCustomerName() != null && john.getCustomerID() == 1235 && john.getDeliverAddress() != null
				&& john.getBillingAddress() != null)
		{
			customerExists = true;
		}
		assertTrue("Customer constructs", customerExists);
	}
	@Test
	public void addToCustomerHistory()
	{
		boolean itemAdded = false;
		Supplier supplier = new Supplier();
		Customer john = new Customer("John", 1234);
		Item hammock = new Item("Hamhawk", supplier, new int[]{1,2,3}, 1234, 22, false, false, false, false, 234, 23);
		Item gnome = new Item("Gnomey", supplier, new int[]{1,2,3}, 1235, 22, false, false, false, false, 234, 23);
		Item anotherHammock = hammock;
		ArrayList<Item> addableItems = new ArrayList<Item>();
		addableItems.add(hammock);
		addableItems.add(anotherHammock);
		addableItems.add(gnome);
		for (Item item : addableItems)
		{
			john.addToCustomerHistory(item);
		}
		if(john.getItemHistory().size()==2&&john.getItemHistory().get(1)==gnome){
			itemAdded = true;
		}
		assertTrue("Unique item added to history", itemAdded);
	}
	@Test
	public void updateDetails()
	{
		boolean detailsChanged = false;
		assertTrue("Details have been changed", detailsChanged);
	}
}
