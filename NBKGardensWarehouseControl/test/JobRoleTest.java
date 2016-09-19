import static org.junit.Assert.*;
import org.junit.*;
public class JobRoleTest
{
	@Test
	public void CheckAuthorisation()
	{
		JobRole jobRole = new JobRole();
		boolean checkPick = false;
		boolean checkPack = true;
		COEventType pick = new COEventType("pick");
		COEventType pack = new COEventType(pick, "pack");
		jobRole.getEventsAuthorised().add(pick);
		checkPick = jobRole.CheckAuthorisation(pick);
		checkPack = jobRole.CheckAuthorisation(pack);
		assertTrue("Job pick can be done", checkPick);
		assertFalse("Job pack can be done", checkPack);
	}
	@Test
	public void JobRole()
	{
		JobRole jobRole = new JobRole();
		boolean jobRoleExists = false;
		if (jobRole.getEventsAuthorised() != null && jobRole.getJobName() == "grunt")
		{
			jobRoleExists = true;
		}
		assertTrue("Job Role exists", jobRoleExists);
	}
}
