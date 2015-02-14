/**
* @author Isaac Kaufman
* @version
**/
package com.isaacdkaufman.nim;

// why not
import javax.swing.JOptionPane;

public class HumanPlayer implements Player
{

	// Pile to act upon
	private Pile pile;

	// max objects which can be taken
	private int maxObjects;

	public HumanPlayer(Pile pile, int maxObjects)
	{
		this.pile = pile;

		this.maxObjects = maxObjects;
	}

	public void takeTurn ()
	{
		int move;
		while(true)
		{
			try
			{
				move = Integer.parseInt(JOptionPane.showInputDialog(null, "Take how many pieces of gelt?"));
				// if the move is legal (positive and <= maxObjects)
				if (move > 0 && move <= maxObjects)
				{
					pile.takeGelt(move);
					break;
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Acceptable input: 1 - " + maxObjects);
				}
			}
			catch (NumberFormatException e)
			{
				JOptionPane.showMessageDialog(null, "Acceptable input: 1 - " + maxObjects);
			}

		}
	}
}	