/**
* @author Isaac Kaufman
* @version
**/
package com.isaacdkaufman.nim;

import java.util.Random;

public class SmartAIPlayer implements Player
{
	// Pile to act upon
	private Pile pile;

	// max objects which can be taken
	private int maxObjects;

	// random number gen for when AI is second (can be in suboptimal positions)
	private Random rand;

	public SmartAIPlayer (Pile pile, int maxObjects)
	{
		this.pile = pile;

		this.maxObjects = maxObjects;

		this.rand = new Random();
	}

	public void takeTurn ()
	{
		// if the number of objects in the Pile are not a multiple of the max objects which can be taken plus 1
		if (!(this.pile.getSize() % (maxObjects + 1) == 0))
		{
			// take the objects which would leave the other player with a multiple of maxObjects + 1
			this.pile.takeGelt(pile.getSize() % (maxObjects + 1));
		}
		else
		{
			// take a random number of objects within the constraints of the game - it does not matter what move is made here
			// its best to try to throw the human player off as the game is unwinnable until he/she makes a mistake
			this.pile.takeGelt(rand.nextInt(maxObjects) + 1);
		}
	}
}