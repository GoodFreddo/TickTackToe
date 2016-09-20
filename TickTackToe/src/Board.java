import java.util.Scanner;
public class Board
{
	private Square[][] gameBoard = new Square[3][3];
	private Player[] players = new Player[2];
	public Square[][] getGameBoard()
	{
		return gameBoard;
	}
	public void setGameBoard(Square[][] gameBoard)
	{
		this.gameBoard = gameBoard;
	}
	public Player[] getPlayers()
	{
		return players;
	}
	public void setPlayers(Player[] players)
	{
		this.players = players;
	}
	public Board()
	{
		for (int x = 0; x < 3; x++)
		{
			for (int y = 0; y < 3; y++)
			{
				Coord coord = new Coord(x, y);
				Square square = new Square(coord);
				getGameBoard()[x][y] = square;
			}
		}
		printBoard();
	}
	public boolean isEmpty(Coord selectedCoord)
	{
		int x = selectedCoord.getLocation()[0];
		int y = selectedCoord.getLocation()[1];
		if (getGameBoard()[x][y].contents == Square.Contents.N)
		{
			return true;
		} else
		{
			return false;
		}
	}
	public void makePlayers()
	{
		for (int i = 0; i < 2; i++)
		{
			int playerNumber = i + 1;
			String playerCall;
			playerCall = String.format("Enter name of player %s", playerNumber);
			System.out.println(playerCall);
			Scanner scanner = new Scanner(System.in);
			String name1 = scanner.next();
			Player player = new Player(name1);
			getPlayers()[i] = player;
		}
	}
	public boolean playMove(Boolean theActivePlayer)
	{
		Player activePlayer;
		if (theActivePlayer)
		{
			activePlayer = getPlayers()[0];
		} else
		{
			activePlayer = getPlayers()[1];
		}
		Coord selectedCoord = new Coord(activePlayer.getName());
		int x = selectedCoord.getLocation()[0];
		int y = selectedCoord.getLocation()[1];
		if (isEmpty(selectedCoord))
		{
			if (activePlayer == getPlayers()[0])
			{
				getGameBoard()[x][y].contents = Square.Contents.x;
			} else
			{
				getGameBoard()[x][y].contents = Square.Contents.o;
			}
			printBoard();
		} else
		{
			System.out.println("That's taken, try again.");
			playMove(theActivePlayer);
		}
		return false;
	}
	public void printBoard()
	{
		System.out.println("@ 1 2 3");
		int count = 1;
		for (Square[] column : getGameBoard())
		{
			System.out.print(count);
			System.out.print(" ");
			for (Square square : column)
			{
				if (square.getContents() == Square.Contents.N)
				{
					System.out.print("\u25A0");
				} else
				{
					System.out.print(square.getContents().toString());
				}
				if (square.getCoordinates().getLocation()[1] != 2)
				{
					System.out.print('|');
				}
				if (square.getCoordinates().getLocation()[0] != 2 && square.getCoordinates().getLocation()[1] == 2)
				{
					System.out.print("\n  -----\n");
				}
			}
			count++;
		}
		System.out.println("\n\n");
	}
	public boolean checkWin(boolean activePlayer)
	{
		boolean winner = false;
		if (winningCombo(getGameBoard()[0][0].getCoordinates().getLocation(),
				getGameBoard()[0][1].getCoordinates().getLocation(),
				getGameBoard()[0][2].getCoordinates().getLocation()))
		{
			winner = true;
		}
		if (winningCombo(getGameBoard()[1][0].getCoordinates().getLocation(),
				getGameBoard()[1][1].getCoordinates().getLocation(),
				getGameBoard()[1][2].getCoordinates().getLocation()))
		{
			winner = true;
		}
		if (winningCombo(getGameBoard()[2][0].getCoordinates().getLocation(),
				getGameBoard()[2][1].getCoordinates().getLocation(),
				getGameBoard()[2][2].getCoordinates().getLocation()))
		{
			winner = true;
		}
		if (winningCombo(getGameBoard()[0][0].getCoordinates().getLocation(),
				getGameBoard()[1][1].getCoordinates().getLocation(),
				getGameBoard()[2][2].getCoordinates().getLocation()))
		{
			winner = true;
		}
		if (winningCombo(getGameBoard()[0][0].getCoordinates().getLocation(),
				getGameBoard()[1][0].getCoordinates().getLocation(),
				getGameBoard()[2][0].getCoordinates().getLocation()))
		{
			winner = true;
		}
		if (winningCombo(getGameBoard()[0][1].getCoordinates().getLocation(),
				getGameBoard()[1][1].getCoordinates().getLocation(),
				getGameBoard()[2][1].getCoordinates().getLocation()))
		{
			winner = true;
		}
		if (winningCombo(getGameBoard()[0][2].getCoordinates().getLocation(),
				getGameBoard()[1][2].getCoordinates().getLocation(),
				getGameBoard()[2][2].getCoordinates().getLocation()))
		{
			winner = true;
		}
		if (winningCombo(getGameBoard()[0][2].getCoordinates().getLocation(),
				getGameBoard()[1][1].getCoordinates().getLocation(),
				getGameBoard()[2][0].getCoordinates().getLocation()))
		{
			winner = true;
		}
		if (winner)
		{
			if (activePlayer)
			{
				String winnername = String.format("The winner is %s!", getPlayers()[0].getName());
				players[0].setScore(players[0].getScore() + 1);
				System.out.println(winnername);
			} else
			{
				String winnername = String.format("The winner is %s!", getPlayers()[1].getName());
				players[1].setScore(players[1].getScore() + 1);
				System.out.println(winnername);
			}
		}
		return winner;
	}
	private boolean winningCombo(int[] a, int[] b, int[] c)
	{
		if (getGameBoard()[a[0]][a[1]].getContents() == getGameBoard()[b[0]][b[1]].getContents()
				&& getGameBoard()[a[0]][a[1]].getContents() == getGameBoard()[c[0]][c[1]].getContents()
				&& getGameBoard()[a[0]][a[1]].getContents() != Square.Contents.N)
		{
			return true;
		}
		return false;
	}
	public boolean boardIsFull()
	{
		int count = 0;
		for (Square[] column : getGameBoard())
		{
			for (Square square : column)
			{
				if (square.getContents() != Square.Contents.N)
				{
					count++;
				}
			}
		}
		if (count == 9)
		{
			return true;
		} else
		{
			return false;
		}
	}
	public void clearBoard()
	{
		for (int x = 0; x < 3; x++)
		{
			for (int y = 0; y < 3; y++)
			{
				Coord coord = new Coord(x, y);
				Square square = new Square(coord);
				getGameBoard()[x][y] = square;
			}
		}
		printBoard();
	}
}
