import static org.junit.Assert.*;
import org.junit.*;
public class EmployeeTest
{
	@Test
	public void AddJobRole()
	{
		boolean jobRoleIsAdded = false;
		Employee borris = new Employee();
		JobRole jobRole = new JobRole();
		borris.AddJobRole(jobRole);
		if (borris.getJobRoles()[0] != null)
		{
			jobRoleIsAdded = true;
		}
		assertTrue("Job role created", jobRoleIsAdded);
	}
	@Test
	public void DoTask()
	{
		boolean taskMoved=false;
		CO co = new CO();
		COEventType pick = new COEventType("pick");
		Employee borris = new Employee();
		COEventType pack = new COEventType(pick,"pack");
		co.getCurrentEvent().add(new COEvent(pack, borris));
		JobRole jobRole = new JobRole();
		borris.AddJobRole(jobRole);	
		borris.DoTask(pack);
		assertTrue("Event has been changed to next possible state by employee",taskMoved);
	}
	@Test
	public void Employee()
	{
		boolean employeeExists= false;
		Employee borris = new Employee();
		if(borris.getEmployeeID()==1235&&borris.getJobRoles()!=null&&borris.getName()!=null&&borris.getStartDate()!=null){}
		assertTrue("Employee is created",employeeExists);
	}
	@Test
	public void RemoveJobRole()
	{
		boolean jobRoleIsRemoved = false;
		Employee borris = new Employee();
		JobRole jobRole = new JobRole();
		borris.AddJobRole(jobRole);
		borris.RemoveJobRole(jobRole);
		if (borris.getJobRoles()[0] == null)
		{
			jobRoleIsRemoved = true;
		}
		assertTrue("Job role created", jobRoleIsRemoved);
	}
}
