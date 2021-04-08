package by.epam.car.view;

import by.epam.car.entity.*;

public class CarView {
	
	public void print(Car c) {
		System.out.println(c);
	}

	public void printBrandOfCar(Car c) {

		System.out.println("Марка автомобиля: " + c.getBrand());
	}

	public void printBrandOfWheel(Car c) {
		System.out.println(
				"Вы заменили колесо на: " + c.getWheel().getBrand() + "; радиус колеса: " + c.getWheel().getRadius());
	}

}
