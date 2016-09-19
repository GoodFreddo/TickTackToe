import java.util.ArrayList;
public class Stock
{
	private ArrayList<Item> items;
	private String location;
	private int price;
	private Supplier supplier = new Supplier();
	public ArrayList<Item> getItems()
	{
		return items;
	}
	public void setItems(ArrayList<Item> items)
	{
		this.items = items;
	}
	public String getLocation()
	{
		return location;
	}
	public void setLocation(String location)
	{
		this.location = location;
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	public Supplier getSupplier()
	{
		return supplier;
	}
	public void setSupplier(Supplier supplier)
	{
		this.supplier = supplier;
	}
	public Stock()
	{
	}
	public void MoveLocation()
	{
	}
	public void FindItemLocation()
	{
	}
	public void AddItem()
	{
	}
	public void RemoveItem()
	{
	}
}
