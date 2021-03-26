package ru.stqa.jfqa.sandbox;

public class MyFirstProgram {



	public static void main(String[] args) {
		System.out.println("Hello World");

		name("Vladimir");
		name("Natasha");

		Square s = new Square(5.0);
		System.out.println("Площадь квардрата со стороной " + s.l + " = " + area(s));

		Rectangle r = new Rectangle(5.0, 6.0);
		System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + area(r));
	}

	public static void name(String name) {
		System.out.println("Hello " + name);
	}

	public static double area(Square s) {
		return s.l * s.l;
	}

	public static double area(Rectangle r) {
		return r.a * r.b;
	}
}