package by.epam.car.logic;

import by.epam.car.entity.*;

public class CarLogic {
	public void goCar(Car c) {

		c.getEngine().onEngine();
		c.getWheel().spinTheWheel();

		System.out.println("Автомобиль едет");
	}

	public void stopCar(Car c) {

		c.getEngine().offEngine();
	}

	public void changeWheel(Car c, int r, String s) {

		c.getWheel().setRadius(r);
		c.getWheel().setBrand(s);

		System.out.println("Произошла замена колеса");
	}

	public void refuel(Car c, int fuel) {

		System.out.println("Вы заправляете машину");
		if (fuel < 6) {
			System.out.println("Вам необходимо дозапрать автомоблиь, в баке слишком мало топлива");
		} else {
			System.out.println("Автомобиль заправлен");
		}
	}

}
