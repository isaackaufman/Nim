public class Pile
{
	// array of Gelt objects for modification by players
	protected Gelt[] gelt;

	public Pile(int numGelt)
	{
		this.gelt = new Gelt[numGelt];
	}
}