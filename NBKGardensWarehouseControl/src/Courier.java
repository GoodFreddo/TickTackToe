import java.util.Date;
public class Courier
{
	private String courierName, address, contactName, contactNumber, email, notes;
	private int balance, creditLimit;
	private Date deliveryTime, collectionTime;
	public String getCourierName()
	{
		return courierName;
	}
	public void setCourierName(String courierName)
	{
		this.courierName = courierName;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public String getContactName()
	{
		return contactName;
	}
	public void setContactName(String contactName)
	{
		this.contactName = contactName;
	}
	public String getContactNumber()
	{
		return contactNumber;
	}
	public void setContactNumber(String contactNumber)
	{
		this.contactNumber = contactNumber;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getNotes()
	{
		return notes;
	}
	public void setNotes(String notes)
	{
		this.notes = notes;
	}
	public int getBalance()
	{
		return balance;
	}
	public void setBalance(int balance)
	{
		this.balance = balance;
	}
	public int getCreditLimit()
	{
		return creditLimit;
	}
	public void setCreditLimit(int creditLimit)
	{
		this.creditLimit = creditLimit;
	}
	public Date getDeliveryTime()
	{
		return deliveryTime;
	}
	public void setDeliveryTime(Date deliveryTime)
	{
		this.deliveryTime = deliveryTime;
	}
	public Date getCollectionTime()
	{
		return collectionTime;
	}
	public void setCollectionTime(Date collectionTime)
	{
		this.collectionTime = collectionTime;
	}
	public Courier(String name, String address, String phonenumber)
	{
		this.contactName=name;
		this.address=address;
		this.contactNumber=phonenumber;
	}
	public void deliverOrder(PO po) //changes PO delivered bool to true
	{
	}
	public void collectOrder(CO co)//adds event to currentEvent with Type collected
	{
	}
	public void deliverOrder(CO co)//adds event to currentEvent with Type delivered
	{
		// TODO Auto-generated method stub
		
	}
}
