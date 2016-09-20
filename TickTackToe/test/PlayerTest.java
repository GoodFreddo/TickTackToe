import static org.junit.Assert.*;
import org.junit.Test;

public class PlayerTest
{
	@Test
	public void testPlayer()
	{
		boolean playerInit = false;
		Player player = new Player("Bob");
		playerInit = player.getClass() == Player.class;
		assertEquals("Player init",true,playerInit);
	}
}