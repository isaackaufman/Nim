import com.isaacdkaufman.nim.*;

public class Nim
{
	public static void main (String[] args)
	{
		Pile pile = new Pile(10);
		System.out.println(pile.getSize());
		pile.takeGelt(3);
		System.out.println(pile.getSize());
	}
}