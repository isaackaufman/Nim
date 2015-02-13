/**
* @author Isaac Kaufman
* @version
**/
package com.isaacdkaufman.nim;

import java.util.List;
import java.util.ArrayList;

public class Pile
{
	// arrayList of Objects to represent the pile - as of now there is no reason for this not to be an int, but as an ArrayList, this allows for more scalability as far as versions of the package go
	private final ArrayList<Object> gelt;

	// amount of indicies in the ArrayList
	private final int indicies;

	// construct Pile object with given number of indicies in the ArrayList
	public Pile (int numGelt)
	{
		// create the ArrayList
		this.gelt = new ArrayList<Object>(numGelt);

		// amount of indicies for use when repopulating the ArrayList
		this.indicies = numGelt;

		// populate the ArrayList - TODO change implementation maybe
		fillPile();
	}

	public void fillPile()
	{
		// fill ArrayList with null Objects - TODO change this implementation maybe - Does it make sense to do it this way?
		for (int i = 0; i < this.indicies; i++)
		{
			this.gelt.add(new Object());
		}
	}

	// get current size of Arraylist
	public int getSize ()
	{
		return this.gelt.size();
	}

	// pop a given number of elements off of the ArrayList - alters value .size() returns
	public void takeGelt (int numGelt)
	{
		for (int i = 0; i < numGelt; i++)
		{
			this.gelt.remove(this.gelt.size() - 1);
		}
	}

	public Pile clone ()
	{
		return new Pile(this.indicies);
	}
}