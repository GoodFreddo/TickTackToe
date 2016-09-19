import java.util.ArrayList;
public class Warehouse
{
	private String location;
	private ArrayList<Stock> stocks;
	private ArrayList<Supplier> suppliers;
	private ArrayList<Courier> couriers;
	private ArrayList<Employee> employees;
	private ArrayList<PO> po_s;
	private ArrayList<CO> co_s;
	public String getLocation()
	{
		return location;
	}
	public void setLocation(String location)
	{
		this.location = location;
	}
	public ArrayList<Stock> getStocks()
	{
		return stocks;
	}
	public void setStocks(ArrayList<Stock> stocks)
	{
		this.stocks = stocks;
	}
	public ArrayList<Supplier> getSuppliers()
	{
		return suppliers;
	}
	public void setSuppliers(ArrayList<Supplier> suppliers)
	{
		this.suppliers = suppliers;
	}
	public ArrayList<Courier> getCouriers()
	{
		return couriers;
	}
	public void setCouriers(ArrayList<Courier> couriers)
	{
		this.couriers = couriers;
	}
	public ArrayList<Employee> getEmployees()
	{
		return employees;
	}
	public void setEmployees(ArrayList<Employee> employees)
	{
		this.employees = employees;
	}
	public ArrayList<PO> getPo_s()
	{
		return po_s;
	}
	public void setPo_s(ArrayList<PO> po_s)
	{
		this.po_s = po_s;
	}
	public ArrayList<CO> getCo_s()
	{
		return co_s;
	}
	public void setCo_s(ArrayList<CO> co_s)
	{
		this.co_s = co_s;
	}
	public Warehouse()
	{
	}
	public void CheckAllStock()
	{
	}
	public void FindItem()
	{
	}
	public void StartPicking()
	{
	}
	public void GeneratePickList()
	{
	}
}
