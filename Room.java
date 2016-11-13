package com.hotel.reservation;

import java.util.ArrayList;
import java.util.List;

public class Room {

	private int roomNumber;
	private RoomType roomType;
	private double price;
	private List<Day> dayAvailable = new ArrayList<>();

	public Room(int roomNumber, RoomType roomType, double price, List<Day> dayAvailable) {
		super();
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.price = price;
		this.dayAvailable = dayAvailable;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public RoomType getRoomType() {
		return roomType;
	}

	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public List<Day> getDayAvailable() {
		return dayAvailable;
	}

	public void setDayAvailable(List<Day> dayAvailable) {
		this.dayAvailable = dayAvailable;
	}

	@Override
	public String toString() {
		return "Room [roomNumber=" + roomNumber + ", roomType=" + roomType + ", price=" + price + "]";
	}

}
