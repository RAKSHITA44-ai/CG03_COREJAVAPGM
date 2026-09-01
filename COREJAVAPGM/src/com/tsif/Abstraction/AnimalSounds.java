package com.tsif.Abstraction;

abstract class Animal {
	abstract void makeSound(String sound);
		
	}

class Dog extends Animal  {

	@Override
	void makeSound(String sound) {
		String animal="Dog";
		System.out.println("Animal sound...");
		System.out.println("Animal :" + animal);
		System.out.println("Sound :" + sound);
		int soundlength=sound.length();
		System.out.println("Sound length :" + soundlength);
		
	}
	}
	

public class AnimalSounds {
	public static void main(String[] args) {
		Dog g=new Dog();
		g.makeSound("Bow Bow");
	}

}
