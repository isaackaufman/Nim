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

	// construct Pile object with given number of indicies in the ArrayList
	public Pile (int numGelt)
	{
		this.gelt = new ArrayList<Object>(numGelt);
		populateList(numGelt);
	}

	public void populateList(int numGelt)
	{
		for (int i = 0; i < numGelt; i++)
		{
			this.gelt.add(new Object());
		}
	}

	public int getSize ()
	{
		return this.gelt.size();
	}

	public void takeGelt (int numGelt)
	{
		for (int i = 0; i < numGelt; i++)
		{
			this.gelt.remove(this.gelt.size() - 1);
		}
	}
}