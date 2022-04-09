import java.util.*;

interface GrandParent
{
	void grandParent();

}

interface Parent1 extends GrandParent
{
	void parent1();
}

interface Parent2 extends GrandParent
{
	void parent1();
}

interface Child extends Parent1, Parent2
{
	void child();
}

class Family implements Child
{
	public void grandParent()
	{
		System.out.println("Calling GrandParent method in family.");
	}
	public void parent1()
	{
		System.out.println("Calling Parent1 method in family");
	}
	public void parent2()
	{
		System.out.println("Calling Parent2 method in family");
	}
	public void child()
	{
		System.out.println("Calling Child method in family");
	}
	
	
	void family()
	{
		System.out.println("Family method: FAMILY IS EVERYTHING!");
	}
	
}

public class P2 {

	public static void main(String[]args)
	{
		Family f = new Family();
		f.grandParent();
		f.parent1();
		f.parent2();
		f.child();
		f.family();
		
		
		
	}
}
