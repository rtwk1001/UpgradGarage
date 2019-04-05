
package com.upgrade.solution;

public class Car {

	int timeToComplete;
	String carId;

	public Car(int timeToComplete, String carId) {
		super();
		this.timeToComplete = timeToComplete;
		this.carId = carId;
	}

	public int getTimeToComplete() {
		return timeToComplete;
	}

	public void setTimeToComplete(int timeToComplete) {
		this.timeToComplete = timeToComplete;
	}

	public String getCarId() {
		return carId;
	}

	public void setCarId(String carId) {
		this.carId = carId;
	}

}
