package com.upgrade.solution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Garage {

	List<Lanes> serviceLanes;
	Queue<Car> customers;
	int noOfLanes;

	public Garage(Queue<Car> customers, int noOfLanes) {

		this.noOfLanes = noOfLanes;
		this.serviceLanes = new ArrayList<>();
		this.customers = customers;
	}

	public void startWorking() {

		for (int i = 0; i < noOfLanes; i++) {
			{
				Lanes lane = new Lanes(i + 1 + "", customers);
				serviceLanes.add(lane);
				lane.start();
			}
		}
	}

	public static void main(String[] args) {

		Queue<Car> cars = new LinkedList<>();
		Car car1 = new Car(2, "1");
		Car car2 = new Car(20, "2");
		Car car3 = new Car(4, "3");
		Car car4 = new Car(5, "4");
		Car car5 = new Car(4, "5");
		Car car6 = new Car(8, "6");
		Car car7 = new Car(12, "7");
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		cars.add(car5);
		cars.add(car6);
		cars.add(car7);
		Garage g1 = new Garage(cars, 3);
		g1.startWorking();

	}

}
