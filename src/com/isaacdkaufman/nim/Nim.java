/**
* @author Isaac Kaufman
* @version
**/
package com.isaacdkaufman.nim;

public class Nim
{

	// pile to be acted upon
	private Pile pile;

	// max number of objects which can be taken per turn
	private int maxObjects;

	// array of Players (any class that implements Player) - need to initialize after other variables because they are involved in constructing a Player object
	// should only be 2 i guess - TODO think about this more
	private Player[] players;

	public Nim(Pile pile, int maxObjects)
	{
		this.pile = pile;
		this.maxObjects = maxObjects;
	}

	private void setPlayers (Player[] players)
	{
		this.players = players;
	}

	public static void main (String[] args)
	{
		// TODO (new Swing branch) let user choose this
		Nim nim = new Nim(new Pile(10), 2);

		// and this
		nim.setPlayers(new Player[] {new HumanPlayer(nim.pile, nim.maxObjects), new SmartAIPlayer(nim.pile, nim.maxObjects)});

		while (!nim.pile.isEmpty())
		{
			for (Player player : nim.players)
			{
				System.out.println("There are " + nim.pile.getObjectsLeft() + " pieces left.");

				// eh, do something maybe
				if (nim.pile.isEmpty()) { System.out.println("Game Over!"); break;}
				player.takeTurn();
			}
		}
	}
}