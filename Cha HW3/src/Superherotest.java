import java.util.LinkedList;
public class Superherotest {
public static void main (String [] args)
{
	LinkedList <SuperHero>list = new LinkedList<SuperHero>();
	SuperHero s = new SuperHero("Flash", "1970");
	list.add(s);
	s = new SuperHero ("Superman", "1930");
	list.add(s);
	System.out.println(list.get(1));//#2
}
}

