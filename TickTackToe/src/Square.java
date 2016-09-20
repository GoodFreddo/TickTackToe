public class Square
{
	private Coord coordinates;

	public Coord getCoordinates()
	{
		return coordinates;
	}
	public enum Contents
	{
		N, x, o
	}
	Contents contents;
	public Contents getContents()
	{
		return contents;
	}
	public Square(Coord coordinates)
	{
		this.coordinates = coordinates;
		contents = Contents.N;
	}
}
