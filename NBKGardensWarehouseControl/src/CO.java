import java.util.ArrayList;
import java.util.Date;
public class CO
{
	private String coID;
	private int totalCost;
	private Date dateOrdered, dateShipped;
	private boolean isPackaged;
	private ArrayList<COEvent> currentEvent = new ArrayList<COEvent>();
	private ArrayList<Item> contents = new ArrayList<Item>();
	public String getCoID()
	{
		return coID;
	}
	public void setCoID(String coID)
	{
		this.coID = coID;
	}
	public int getTotalCost()
	{
		return totalCost;
	}
	public void setTotalCost(int totalCost)
	{
		this.totalCost = totalCost;
	}
	public Date getDateOrdered()
	{
		return dateOrdered;
	}
	public void setDateOrdered(Date dateOrdered)
	{
		this.dateOrdered = dateOrdered;
	}
	public Date getDateShipped()
	{
		return dateShipped;
	}
	public void setDateShipped(Date dateShipped)
	{
		this.dateShipped = dateShipped;
	}
	public boolean isPackaged()
	{
		return isPackaged;
	}
	public void setPackaged(boolean isPackaged)
	{
		this.isPackaged = isPackaged;
	}
	public ArrayList<COEvent> getCurrentEvent()
	{
		return currentEvent;
	}
	public void setCurrentEvent(ArrayList<COEvent> currentEvent)
	{
		this.currentEvent = currentEvent;
	}
	public ArrayList<Item> getContents()
	{
		return contents;
	}
	public void setContents(ArrayList<Item> contents)
	{
		this.contents = contents;
	}
	public CO()
	{
	}
	// public void ammendOrder(Item itemAdd)
	// {
	// contents.add(itemAdd);
	// }
	public void ammendOrder(Item itemAdd, Item itemRemove)
	{
		if (itemAdd != null)
		{
			contents.add(itemAdd);
		}
		if (itemRemove != null)
		{
			contents.remove(itemRemove);
		}
	}
	// public void cancelOrder()
	// {
	// }
	public void calculateOrderTotal()
	{
	}
}
