package com.upgrade.solution;

import java.util.Queue;

public class Lanes extends Thread {
	String LaneId;
	Car currentProcesser;
	int timeToProcess;
	boolean isFree;
	static Queue<Car> carQueue;
	 int timer;

	public Lanes(String laneId, Queue<Car> queue) {
		super();
		LaneId = laneId;
		isFree = true;
		timeToProcess = 0;
		carQueue = queue;
		timer = 0;
	}

	public String getLaneId() {
		return LaneId;
	}

	public void setLaneId(String laneId) {
		LaneId = laneId;
	}

	public Car getCurrentProcesser() {
		return currentProcesser;
	}

	public void setCurrentProcesser(Car currentProcesser) {
		this.currentProcesser = currentProcesser;
	}

	public int getTimeToProcess() {
		return timeToProcess;
	}

	public void setTimeToProcess(int timeToProcess) {
		this.timeToProcess = timeToProcess;
	}

	public boolean isFree() {
		return isFree;
	}

	public void setFree(boolean isFree) {
		this.isFree = isFree;
	}

	@Override
	public String toString() {
		return "Lanes [currentProcesser=" + currentProcesser + ", timeToProcess=" + timeToProcess + ", isFree=" + isFree
				+ "]";
	}

	@Override
	public void run() {
		
		synchronized (this) {
			
			while (!carQueue.isEmpty()) {
				if (isFree) {

					currentProcesser = carQueue.poll();
					if (currentProcesser != null) {
						timeToProcess = currentProcesser.getTimeToComplete();
						isFree = false;

						System.out.println("Car " + currentProcesser.carId + " is Assigned To ServiceLne " + LaneId
								+ " at time =" + timer);
					}
					/*
					 * else System.exit(0);
					 */
				} else {
					timeToProcess--;
					timer++;
					if (timeToProcess <= 0)
						isFree = true;
				}

				try {
					
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		}
		
	}

}
