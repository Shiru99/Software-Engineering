import java.util.function.Function;
//Class::new refers to constructor
//by default methods are public

enum Color{
	RED,
	BLUE,
	BLACK,
	WHITE;
}

class Vehicle{
	Color col;
	Vehicle(){}
}


class Car extends Vehicle{
	Car(Color c) {col=c;System.out.println("Creating "+c+" Car");}
}

class Bus extends Vehicle{
	Bus(Color c) {col=c;System.out.println("Creating "+c+" Bus");}
}


//Binds different constants (vehicle types), associated actions (specific object creation). Introduction of a new type can be done within the enum (implementation still needs to be done separately and is the right design.). Unhandled types result in compile-time errors.

enum VehicleFactory {
	CAR(Car::new), //CAR is constant
	BUS(Bus::new); //BUS is constant

	public final Function<Color, Vehicle> factoryHelper; //attirbute of the enum type. factoryHelper is a Function interface. Functions were introduced in Java 8 onwards. This interface is parametrized with one input and one output. Any method defined in this interface works with one argument and returns one. First parameter is the type of the input, next parameter is the type of the output. There are 4 built-in methods defined for this interface. We use the apply method. The apply method applies the specified function to the input argument and returns the output. In this example. Car::new is assigned to helper (parameter passed to the constructor) when an object of the enum type is created. Car::new denotes a reference to the constructor function. What you are saying is "store a reference to the constructor function in the Function interface called helper.". When you call helper.apply with appropriate input argument, you call the Car::new constructor of the Car class passing it the Color argument. 

	//constructor for the enum. accepts a Function interface object and initializes it to the attribute of the enum
	VehicleFactory(Function<Color, Vehicle> helper) {
		this.factoryHelper = helper;
	}
}

class FactoryDemo{
	public static void main(String[] args) {
		Vehicle redCar = VehicleFactory.CAR.factoryHelper.apply(Color.RED);
		Vehicle blueBus = VehicleFactory.BUS.factoryHelper.apply(Color.BLUE);
	}
}
