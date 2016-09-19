import java.util.ArrayList;
import java.util.Date;
public class Customer
{
	private String customerName, email, notes, billingAddress, deliverAddress, bankDetails;
	private int accountBalance, creditLimit, customerID;
	private Date dateOfBirth;
	private ArrayList<Item> itemHistory = new ArrayList<Item>();
	public String getCustomerName()
	{
		return customerName;
	}
	public void setCustomerName(String customerName)
	{
		this.customerName = customerName;
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
	public int getCustomerID()
	{
		return customerID;
	}
	public void setCustomerID(int customerID)
	{
		this.customerID = customerID;
	}
	public String getBillingAddress()
	{
		return billingAddress;
	}
	public void setBillingAddress(String billingAddress)
	{
		this.billingAddress = billingAddress;
	}
	public String getDeliverAddress()
	{
		return deliverAddress;
	}
	public void setDeliverAddress(String deliverAddress)
	{
		this.deliverAddress = deliverAddress;
	}
	public String getBankDetails()
	{
		return bankDetails;
	}
	public void setBankDetails(String bankDetails)
	{
		this.bankDetails = bankDetails;
	}
	public int getAccountBalance()
	{
		return accountBalance;
	}
	public void setAccountBalance(int accountBalance)
	{
		this.accountBalance = accountBalance;
	}
	public int getCreditLimit()
	{
		return creditLimit;
	}
	public void setCreditLimit(int creditLimit)
	{
		this.creditLimit = creditLimit;
	}
	public Date getDateOfBirth()
	{
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth)
	{
		this.dateOfBirth = dateOfBirth;
	}
	public ArrayList<Item> getItemHistory()
	{
		return itemHistory;
	}
	public void setItemHistory(ArrayList<Item> itemHistory)
	{
		this.itemHistory = itemHistory;
	}
	public Customer(String name, int lastID)// Customer input into system
	{
		this.customerName = name;
		this.customerID = lastID++;
	}
	public Customer(String inputDetails)// Database string handler for already
										// existent customers
	{
		// pull string from database, split by xml markup and add to attributes
	}
	public void updateDetails()// large method that controls user input into all
								// fields via scanner //later to be implemented
								// via swing
	{
	}
	public void addToCustomerHistory(Item item)// adds item to user history if
												// not already there
	{
		if (itemHistory.lastIndexOf(item) != -1)
		{
			itemHistory.add(item);
		}
	}
}
