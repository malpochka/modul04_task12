package by.epam.car.main;

import by.epam.car.entity.*;
import by.epam.car.logic.*;
import by.epam.car.view.*;

/*Создать объект класса Автомобиль, используя классы Колесо и Двигатель.Методы:ехать, заправляться, менять колесо,
 * вывести на консоль марку автомобиля.*/

public class Main {

	public static void main(String[] args) {
		Car car = new Car();
		CarView view = new CarView();
		CarLogic logic = new CarLogic();

		view.print(car);

		logic.goCar(car);
		logic.refuel(car, 5);
		logic.changeWheel(car, 10, "Мишлен");

		view.printBrandOfWheel(car);

		logic.refuel(car, 10);

		view.printBrandOfCar(car);

		logic.stopCar(car);

	}

}
