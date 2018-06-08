package javabasics;

public abstract class Animal implements Travel,Owner {

}
class Cat extends Animal {

	@Override
	public int getspeed() {
		return 0;
	}

	@Override
	public String getOwnerName() {
		return null;
	}
	
}
class Monkey extends Animal {

	@Override
	public int getspeed() {
		return 0;
	}

	@Override
	public String getOwnerName() {
		return null;
	}
	
}
class Dinosaur extends Animal {

	@Override
	public int getspeed() {
		return 0;
	}

	@Override
	public String getOwnerName() {
		return null;
	}
	
}
