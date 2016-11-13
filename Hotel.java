package com.hotel.reservation;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

	private String name;
	private String city;
	private List<Room> roomList = new ArrayList<>();

	public Hotel(String name, String city) {
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<Room> getRoomList() {
		return roomList;
	}

	public void setRoomList(List<Room> roomList) {
		this.roomList = roomList;
	}

	@Override
	public String toString() {
		return "Hotel [name=" + name + ", city=" + city + ", roomList=" + roomList + "]";
	}

}
