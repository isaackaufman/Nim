/**
* @author Isaac Kaufman
* @version
**/
package com.isaacdkaufman.nim;

import java.util.List;
import java.util.ArrayList;

public class Pile
{
	// array of Gelt objects for modification by players
	private final List<Object> gelt;

	// construct Pile object with given number of Gelt objects
	public Pile (int numGelt)
	{
		this.gelt = new ArrayList(numGelt);
	}

	public void takeGelt (int numGelt)
	{

	}
}