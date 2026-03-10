package DemoOnSprings7.DemoOnSpring;

public class Car {
Engine engine;
//create a constructor
public Car(Engine engine) {
	super();
	this.engine = engine;
}
public Engine getEngine() {
	return engine;
}
public void setEngine(Engine engine) {
	this.engine = engine;
}
void showDetails()
{
	System.out.println("Engine Type is : "+engine.getType());
}
}

