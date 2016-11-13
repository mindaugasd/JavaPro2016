package com.hotel.reservation;

import java.util.List;

public class Booking {

	
	public static void bookARoom(List<Hotel> hotels, String city, int people, int checkIn, int checkOut, int roomNo) {
		
		System.out.println("Booking a room...");
		
		hotels.stream()
			.filter(list -> list.getCity().equals(city))
			.forEach(hotel -> {
					hotel.getRoomList()
					.stream()
					.filter(room -> room.getRoomType().getPeople() == people && room.getRoomNumber() == roomNo)
					.forEach(rooms -> {
						rooms.getDayAvailable()
						.stream()
						.filter(day -> day.getDay() >= checkIn && day.getDay() < checkOut)
						.forEach(x -> {
							x.setAvailability(false);
							System.out.println(hotel.getName() + " " + x.getDay());
						});
					});
			});
		System.out.println("Booking finished");
	}
	
}
