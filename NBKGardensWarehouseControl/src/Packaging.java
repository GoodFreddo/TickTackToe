public class Packaging
{
	private boolean fragile = false;
	private int[] dimensions;
	public boolean isFragile()
	{
		return fragile;
	}
	public void setFragile(boolean fragile)
	{
		this.fragile = fragile;
	}
	public int[] getDimensions()
	{
		return dimensions;
	}
	public void setDimensions(int[] dimensions)
	{
		this.dimensions = dimensions;
	}
	public Packaging()
	{
	}
}
