import static org.junit.Assert.*;
import org.junit.Test;
public class BoardTest
{
	@Test
	public void testBoard()
	{
		boolean boardIsExistent = false;
		Board theBoard = new Board();
		boardIsExistent = theBoard.getClass() == Board.class;
		assertEquals("Board is init", true, boardIsExistent);
	}
	@Test
	public void testIsEmpty()
	{
		Board theBoard = new Board();
		theBoard.getGameBoard()[0][0].contents = Square.Contents.x;
		assertEquals("Box check 1 is empty", true, theBoard.isEmpty(new Coord(0, 1)));
		assertEquals("Box check 2 is full", false, theBoard.isEmpty(new Coord(0, 0)));
	}
	@Test
	public void testMakePlayers()
	{
		Board theBoard = new Board();
		theBoard.makePlayers();
		assertEquals("Creates two players with names from user input", "Bob", theBoard.getPlayers()[0].getName());
	}
	@Test
	public void testPlayMove()
	{
		Board theBoard = new Board();
		theBoard.makePlayers();
		theBoard.getPlayers()[0].setName("Bob");
		theBoard.getPlayers()[0].setName("Bobby");
		theBoard.playMove(true);
		assertEquals("Test square 0,0 contains x", Square.Contents.x, theBoard.getGameBoard()[0][0].contents);
	}
	@Test
	public void testCheckWin()
	{
		Board theBoard = new Board();
		theBoard.makePlayers();
		theBoard.getPlayers()[0].setName("Bob");
		theBoard.getPlayers()[0].setName("Bobby");
		for (int i = 0; i < 3; i++)
		{
			theBoard.getGameBoard()[0][i].contents = Square.Contents.x;
		}
		assertEquals("Win condition wins", true, theBoard.checkWin(true));
	}
	@Test
	public void testBoardIsFull()
	{
		Board theBoard = new Board();
		theBoard.makePlayers();
		theBoard.getPlayers()[0].setName("Bob");
		theBoard.getPlayers()[0].setName("Bobby");
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				theBoard.getGameBoard()[j][i].contents = Square.Contents.x;
			}
		}
		assertEquals("Board is full", true, theBoard.boardIsFull());
	}
	@Test
	public void testClearBoard()
	{
		Board theBoard = new Board();
		theBoard.makePlayers();
		theBoard.getPlayers()[0].setName("Bob");
		theBoard.getPlayers()[0].setName("Bobby");
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				theBoard.getGameBoard()[j][i].contents = Square.Contents.x;
			}
		}
		theBoard.clearBoard();
		assertEquals("Board which was full is no longer full", false, theBoard.boardIsFull());
	}
}
