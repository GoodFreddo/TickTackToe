import java.util.ArrayList;
import java.util.Date;
public class COEvent
{
	private ArrayList<COEventType> event = new ArrayList<COEventType>();
	private Date eventTime;
	private Employee employeeActuator = new Employee();
	public ArrayList<COEventType> getEvent()
	{
		return event;
	}
	public void setEvent(ArrayList<COEventType> event)
	{
		this.event = event;
	}
	public Date getEventTime()
	{
		return eventTime;
	}
	public void setEventTime(Date eventTime)
	{
		this.eventTime = eventTime;
	}
	public Employee getEmployeeActuator()
	{
		return employeeActuator;
	}
	public void setEmployeeActuator(Employee employeeActuator)
	{
		this.employeeActuator = employeeActuator;
	}
	public COEvent(COEventType event,Employee employee)
	{
		this.event.add(event);
		this.eventTime = new Date();
		this.employeeActuator=employee;
	}
}
