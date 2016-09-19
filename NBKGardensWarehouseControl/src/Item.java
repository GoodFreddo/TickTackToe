public class Item
{
	private String productName;
	private Supplier preferredSupplier = new Supplier();
	private int[] dimensions;
	private int id, weight;
	private boolean fragile, individuallyWrapped, porous, canBePorous;
	private double sellPrice, buyPrice;
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getProductName()
	{
		return productName;
	}
	public void setProductName(String productName)
	{
		this.productName = productName;
	}
	public Supplier getPreferredSupplier()
	{
		return preferredSupplier;
	}
	public void setPreferredSupplier(Supplier preferredSupplier)
	{
		this.preferredSupplier = preferredSupplier;
	}
	public int[] getDimensions()
	{
		return dimensions;
	}
	public void setDimensions(int[] dimensions)
	{
		this.dimensions = dimensions;
	}
	public int getWeight()
	{
		return weight;
	}
	public void setWeight(int weight)
	{
		this.weight = weight;
	}
	public boolean isFragile()
	{
		return fragile;
	}
	public void setFragile(boolean fragile)
	{
		this.fragile = fragile;
	}
	public boolean isIndividuallyWrapped()
	{
		return individuallyWrapped;
	}
	public void setIndividuallyWrapped(boolean individuallyWrapped)
	{
		this.individuallyWrapped = individuallyWrapped;
	}
	public boolean isPorous()
	{
		return porous;
	}
	public void setPorous(boolean porous)
	{
		this.porous = porous;
	}
	public boolean isCanBePorous()
	{
		return canBePorous;
	}
	public void setCanBePorous(boolean canBePorous)
	{
		this.canBePorous = canBePorous;
	}
	public double getBuyPrice()
	{
		return buyPrice;
	}
	public void setRrp(float rrp)
	{
		this.buyPrice = rrp;
	}
	public double getSellPrice()
	{
		return sellPrice;
	}
	public void setSellPrice(double d)
	{
		this.sellPrice = d;
	}
	public Item(String productName, Supplier preferredSupplier, int[] dimensions, int id, int weight, boolean fragile,
			boolean individuallyWrapped, boolean porous, boolean canBePorous, double sellPrice, double buyPrice)
	{
		this.productName=productName;
		this.preferredSupplier=preferredSupplier;
		this.dimensions=dimensions;
		this.id=id;
		this.weight=weight;
		this.fragile=fragile;
		this.porous=porous;
		this.individuallyWrapped=individuallyWrapped;
		this.canBePorous=canBePorous;
		this.sellPrice=sellPrice;
		this.buyPrice=buyPrice;
	}
	public void ApplyPorous()
	{
	}
	public void SetNewPrice()
	{
	}
	public void ModifyItemDetails()
	{
	}
}
