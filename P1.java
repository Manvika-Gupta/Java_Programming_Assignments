import java.util.*;

abstract class Engineering
{
	abstract void display();
}

interface programming
{
	void coding();
}

interface drawing
{
	void draw();
}

 class computer extends Engineering implements programming
 {
	public void coding()
	 {
		 System.out.println("Coding in computer called.");
	 }
	public void display()
	{
		 System.out.println("Display in computer called.");	
	}
 }

 class mechanical extends Engineering implements drawing
 {
	 public void draw()
	 {
		 System.out.println("Drawing in mechanical called.");
	 }
	 public void display()
	{
		 System.out.println("Display in mechanical called.");	
	}
 }

public class P1 {

	public static void main(String[] args)
	{
		computer c = new computer();
		mechanical m = new mechanical();
		c.coding();
		c.display();
		m.draw();
		m.display();
	}
	
}
