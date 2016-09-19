import java.util.Date;
public class Employee
{
	private String  name, personalInfo;
	private int employeeID;
	private Date startDate, endDate;
	private JobRole[] jobRoles;
	public int getEmployeeID()
	{
		return employeeID;
	}
	public void setEmployeeID(int employeeID)
	{
		this.employeeID = employeeID;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getPersonalInfo()
	{
		return personalInfo;
	}
	public void setPersonalInfo(String personalInfo)
	{
		this.personalInfo = personalInfo;
	}
	public Date getStartDate()
	{
		return startDate;
	}
	public void setStartDate(Date startDate)
	{
		this.startDate = startDate;
	}
	public Date getEndDate()
	{
		return endDate;
	}
	public void setEndDate(Date endDate)
	{
		this.endDate = endDate;
	}
	public JobRole[] getJobRoles()
	{
		return jobRoles;
	}
	public void setJobRoles(JobRole[] jobRoles)
	{
		this.jobRoles = jobRoles;
	}
	public Employee(){}
	public void DoTask(COEventType task)
	{
	}
	public void AddJobRole(JobRole role)
	{
	}
	public void RemoveJobRole(JobRole role)
	{
	}
}
