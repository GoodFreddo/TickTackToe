import java.util.ArrayList;
import java.util.Date;
public class PO
{
	private String poID;
	private float totalCost;
	private ArrayList<Item> items;
	private Supplier supplier = new Supplier();
	private Date orderDate, deliveryDate;
	private boolean recieved, ordered;
	private Employee assignedEmployee = new Employee();
	public String getPoID()
	{
		return poID;
	}
	public void setPoID(String poID)
	{
		this.poID = poID;
	}
	public float getTotalCost()
	{
		return totalCost;
	}
	public void setTotalCost(float totalCost)
	{
		this.totalCost = totalCost;
	}
	public ArrayList<Item> getItems()
	{
		return items;
	}
	public void setItems(ArrayList<Item> items)
	{
		this.items = items;
	}
	public Supplier getSupplier()
	{
		return supplier;
	}
	public void setSupplier(Supplier supplier)
	{
		this.supplier = supplier;
	}
	public Date getOrderDate()
	{
		return orderDate;
	}
	public void setOrderDate(Date orderDate)
	{
		this.orderDate = orderDate;
	}
	public Date getDeliveryDate()
	{
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate)
	{
		this.deliveryDate = deliveryDate;
	}
	public boolean isRecieved()
	{
		return recieved;
	}
	public void setRecieved(boolean recieved)
	{
		this.recieved = recieved;
	}
	public boolean isOrdered()
	{
		return ordered;
	}
	public void setOrdered(boolean ordered)
	{
		this.ordered = ordered;
	}
	public Employee getAssignedEmployee()
	{
		return assignedEmployee;
	}
	public void setAssignedEmployee(Employee assignedEmployee)
	{
		this.assignedEmployee = assignedEmployee;
	}
	public PO()
	{
	}
	public void AmmendOrder()
	{
	}
	public void CalculateOrderTotal()
	{
	}
	public void RemoveOrder()
	{
	}
}
