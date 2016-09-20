public class Game
{ //put comments here later
	public static void main(String[] args)
	{
		Board theBoard = new Board();
		theBoard.makePlayers();
		while (true)
		{
			boolean activePlayer = true;
			boolean gameWon = false;
			while (!gameWon)
			{
				if (!theBoard.playMove(activePlayer))
				{
					gameWon = theBoard.checkWin(activePlayer);
					if (theBoard.boardIsFull() && gameWon == false)
					{
						System.out.println("Board full");
						break;
					}
					activePlayer = !activePlayer;
				}
			}
			System.out.println(theBoard.getPlayers()[0].getName() + ": " + theBoard.getPlayers()[0].getScore());
			System.out.println(theBoard.getPlayers()[1].getName() + ": " + theBoard.getPlayers()[1].getScore());
			theBoard.clearBoard();
			activePlayer = !activePlayer;
		}
	}
}
