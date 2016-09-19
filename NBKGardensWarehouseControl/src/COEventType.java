import java.util.ArrayList;
public class COEventType
{
	private String name;
	private ArrayList<COEventType> eventType = new ArrayList<COEventType>();
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public ArrayList<COEventType> getEventType()
	{
		return eventType;
	}
	public void setEventType(ArrayList<COEventType> eventType)
	{
		this.eventType = eventType;
	}
	public COEventType(String name) //first time constructor
	{
		this.name=name;
		eventType.add(this);
	}
	public COEventType(COEventType thatEventType, String name)//constructor for all following iterations
	{
		this.name=name;
		eventType.add(thatEventType);
	}
}
