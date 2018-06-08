package javabasics;

public abstract class Vehicle implements Travel{

}
class Car extends Vehicle{

	@Override
	public int getspeed() {
		return 0;
	}
	
}
class Bike extends Vehicle{

	@Override
	public int getspeed() {
		return 0;
	}
	
}
class Train extends Vehicle{

	@Override
	public int getspeed() {
		return 0;
	}
	
}
