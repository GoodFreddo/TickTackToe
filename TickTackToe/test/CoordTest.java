import static org.junit.Assert.*;
import org.junit.Test;

public class CoordTest
{
	@Test
	public void testCoordIntInt()
	{
		Coord coord = new Coord(0,0);
		assertEquals("Coord pre-set init",Coord.class,coord.getClass());
	}
	@Test
	public void testCoordString()
	{
		Coord coord = new Coord("Bob");
		assertEquals("Coord user-set init",1,coord.getLocation()[0]+1);
		assertEquals("Coord user-set init",1,coord.getLocation()[1]+1);
	}
}
