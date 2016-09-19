import java.util.ArrayList;
public class JobRole
{
	private String jobName;
	private ArrayList<COEventType> eventsAuthorised=new ArrayList<COEventType>();
	public String getJobName()
	{
		return jobName;
	}
	public void setJobName(String jobName)
	{
		this.jobName = jobName;
	}
	public ArrayList<COEventType> getEventsAuthorised()
	{
		return eventsAuthorised;
	}
	public void setEventsAuthorised(ArrayList<COEventType> eventsAuthorised)
	{
		this.eventsAuthorised = eventsAuthorised;
	}
	public JobRole()
	{
	}
	public boolean CheckAuthorisation(COEventType event)
	{
		return false;
	}
}
