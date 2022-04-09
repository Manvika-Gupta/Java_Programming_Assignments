import java.util.*;

abstract class Animal{
	
	abstract void deliver();
	}

interface Transport{
	
	void deliver();
	}

class Tiger extends Animal{
	
	public void deliver() {}
	}

class Camel extends Animal implements Transport{

	public void deliver() {
		System.out.println("Calling deliver method from Camel class.");
	}
	Camel(){
		System.out.println("Calling Camel method.");
		   }
	}

class Deer extends Animal{
	
	public void deliver() {}
	}

class Donkey extends Animal implements Transport{
	public void deliver() {
		
		System.out.println("Calling deliver method from Donkey class");
	}
	Donkey(){
		System.out.println("Calling Donkey method.");
	}
}


public class P4 {
	
	public static void main(String[] args){
		
		Transport[] t=new Transport[4];
		t[1]=new Camel();
		t[1].deliver();
		t[2]=new Donkey();
		t[2].deliver();
}
}