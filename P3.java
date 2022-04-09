import java.util.*;

abstract class vegetable{
	
String color; //instance variable
	
}

class Potato extends vegetable
{
	public String toString()
	{
		color="Brown";
		return ("Vegetable called: Potato,"+" having Color: "+color)  ;
	}
}

class Brinjal extends vegetable
{
	
	public String toString()
	{
		color="Purple";
		return ("Vegetable called: Brinjal,"+" having Color: "+color) ;
	}
}
class Tomato extends vegetable
{
	
	public String toString()
	{
		color="Red";
		return ("Vegetable called: Tomato,"+" having Color: "+color) ;
	}
}





public class P3 {
	public static void main(String[]args) {
		
		String name1,name2,name3;
		Potato p= new Potato();
		Brinjal b= new Brinjal();
		Tomato t = new Tomato();
		name1=p.toString();
		System.out.println(name1);
		name2=b.toString();
		System.out.println(name2);
		name3= t.toString();
		System.out.println(name3);
		
		
	}

}
