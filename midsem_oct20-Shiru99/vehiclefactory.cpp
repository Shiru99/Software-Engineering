#include<iostream>
#include<string>

enum Color{
	RED,
	BLUE,
	BLACK,
	WHITE
};

enum VehicleType{
	CAR,
	BUS
};

std::string colornames[]={"RED","BLUE","BLACK","WHITE"};

class Vehicle {
	public:
	       Color col;
       		Vehicle(){}	       
};

class Car:public Vehicle{
	public:
	Car(Color c) {col=c;std::cout<<"Creating "<<colornames[c]<<" Car"<<std::endl;}
};


class Bus:public Vehicle{
	public:
	Bus(Color c) {col=c;std::cout<<"Creating "<<colornames[c]<<" Bus"<<std::endl;}
};

//Problems:
//if-else involves lot of typing and redundancy. 
//returning NULL is handled at runtime. 
//Idea of encapsulation (bind data and functionality together) and cohesion (bundling a group of related elements together) is missing. To see this in action look at enums example in FactoryDemo.java. Enums in Java are more powerful than those in C++: they can have attributes, constructors, and methods. The constants can have associated actions as well. 
Vehicle* VehicleFactory(VehicleType type, Color c) {
	if(type == BUS)
		return new Bus(c);
	else if(type == CAR)
		return new Car(c);
	else
		return NULL;
}

int main() {
	Vehicle* redCar = VehicleFactory(CAR,RED);
	Vehicle* blueBus = VehicleFactory(BUS,BLUE);
}
