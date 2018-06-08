package javabasics;

public abstract class Animal implements Travel {

}
class Cat extends Animal {

	@Override
	public int getspeed() {
		return 0;
	}
	
}
class Monkey extends Animal {

	@Override
	public int getspeed() {
		return 0;
	}
	
}
class Dinosaur extends Animal {

	@Override
	public int getspeed() {
		return 0;
	}
	
}
