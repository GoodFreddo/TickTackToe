import java.util.ArrayList;
public class Supplier
{
	private String companyName, address, contactName, email, notes;
	private float accountBalance, creditLimit;
	private ArrayList<Item> itemsAvailiable;
	public String getCompanyName()
	{
		return companyName;
	}
	public void setCompanyName(String companyName)
	{
		this.companyName = companyName;
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
	public float getAccountBalance()
	{
		return accountBalance;
	}
	public void setAccountBalance(float accountBalance)
	{
		this.accountBalance = accountBalance;
	}
	public float getCreditLimit()
	{
		return creditLimit;
	}
	public void setCreditLimit(float creditLimit)
	{
		this.creditLimit = creditLimit;
	}
	public ArrayList<Item> getItemsAvailiable()
	{
		return itemsAvailiable;
	}
	public void setItemsAvailiable(ArrayList<Item> itemsAvailiable)
	{
		this.itemsAvailiable = itemsAvailiable;
	}
	public Supplier()
	{
	}
	public void CheckSupplierAvailiabilty()
	{
	}
	public void RemoveSupplier()
	{
	}
	public void ChangeBalance()
	{
	}
}
