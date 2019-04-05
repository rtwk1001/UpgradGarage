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
		cars.add(new Car(1, "1"));
		cars.add(new Car(1, "2"));
		cars.add(new Car(1, "3"));
		cars.add(new Car(1, "4"));
		cars.add(new Car(1, "5"));
		cars.add(new Car(1, "6"));
		cars.add(new Car(1, "7"));
		cars.add(new Car(1, "8"));
		cars.add(new Car(1, "9"));
		cars.add(new Car(1, "10"));
		cars.add(new Car(1, "11"));
		cars.add(new Car(1, "12"));
		Garage g1 = new Garage(cars, 3);
		g1.startWorking();

	}

}
