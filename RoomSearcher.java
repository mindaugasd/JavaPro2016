package com.hotel.reservation;

import java.util.List;

public class RoomSearcher {

	// show room list
	public static void getRoomList(List<Hotel> hotels) {
		
		System.out.println("Rooms list:");
		hotels.stream().forEach(x -> {
			x.getRoomList()
					.stream()
					.forEach(y -> System.out.println(x.getName() + " " + y.getRoomNumber()));
		});
	}

	public static void getAllRoomList(List<Hotel> hotels) {
		
		System.out.println("All Rooms list:");
		hotels.stream().forEach(x -> {
			x.getRoomList()
					.stream()
					.forEach(y -> {
						y.getDayAvailable()
							.stream()
							.forEach(day -> System.out.println(x.getName() + "\t" + x.getCity() + "\t" + y.getRoomNumber() + "\t"
									+ y.getRoomType() + "\t" + day.getDay() + "\t" + day.getAvailability()));
					});
		});
	}
	
	public static void searchRoom(List<Hotel> hotels, String city, int people, int checkIn, int checkOut) {
		
		System.out.println("Search results:");
		
		hotels.stream()
			.filter(hotel -> hotel.getCity().equals(city))
			.forEach(room -> {
					room.getRoomList()
					.stream()
					.filter(peop -> peop.getRoomType().getPeople() == people)
					.forEach(day -> {
						day.getDayAvailable()
						.stream()
						.filter(x -> x.getDay() >= checkIn && x.getDay() < checkOut)
						.forEach(y -> System.out.println(room.getName() + "\t" + room.getCity() + "\t" + day.getRoomType() + "\t" + day.getRoomNumber() + "\t" + y.getDay() + "\t" 
						+ y.getAvailability()));
					});
			});
	}
	

}
