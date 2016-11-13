package com.hotel.reservation;

public class Day {

	private int day;
	private boolean availability;

	public Day(int day, boolean availability) {
		this.day = day;
		this.availability = availability;
	}

	public int getDay() {
		return day;
	}

	public boolean getAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	};

}
