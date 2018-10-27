package ducks;

public class DuckCall{
	QuackBehavior quackBehavior;
	DuckCall() {
		quackBehavior = new Quack();
	}

	public void display() {
		System.out.println("I'm a duck call and not a real duck at all!");
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
}
