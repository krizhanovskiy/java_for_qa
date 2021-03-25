package ru.stqa.jfqa.sandbox;

public class MyFirstProgram {

	public static void main(String[] args) {
		System.out.println("Hello World");

		name("Vladimir");
		name("Natasha");

		Double lenght = 2.0;
		System.out.println("Площадь квардрата со стороной " + lenght + " = " + area(lenght));

		Double a = 2.0;
		Double b = 3.0;
		System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a, b));
	}

	public static void name(String name) {
		System.out.println("Hello " + name);
	}

	public static double area(Double lenght) {
		return lenght * lenght;
	}

	public static double area(Double a , Double b) {
		return a * b;
	}
}