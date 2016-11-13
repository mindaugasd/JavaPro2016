package com.hotel.reservation;

import java.util.ArrayList;
import java.util.List;

public class HotelGenerator {

	private static List<Hotel> hotels = new ArrayList<>();
	
	private static Hotel radison = new Hotel("Radison SAS", "Kaunas");
	private static Hotel hilton = new Hotel("Hilton", "Helsinki");
	private static Hotel kempinski = new Hotel("Kempinski", "Vilnius");
	private static List<Day> dayAvailable = new ArrayList<>();
	
	
	public static List<Hotel> getHotelList() {
		
		for (int i = 1; i <= 31; i++) {
			dayAvailable.add(new Day(i, true));
		}
		
		hotels.add(radison);
		List<Room> radisonRooms = new ArrayList<>();
		radisonRooms.add(new Room(101, RoomType.SINGLE, 20, dayAvailable));
		radisonRooms.add(new Room(102, RoomType.SINGLE, 30, dayAvailable));
		radisonRooms.add(new Room(103, RoomType.DOUBLE, 40, dayAvailable));
		radisonRooms.add(new Room(104, RoomType.DOUBLE, 40, dayAvailable));
		radisonRooms.add(new Room(105, RoomType.TRIPLE, 60, dayAvailable));
		radison.setRoomList(radisonRooms);
		
		hotels.add(hilton);
		List<Room> hiltonRooms = new ArrayList<>();
		hiltonRooms.add(new Room(110, RoomType.DOUBLE, 100, dayAvailable));
		hiltonRooms.add(new Room(111, RoomType.DOUBLE, 100, dayAvailable));
		hiltonRooms.add(new Room(201, RoomType.TWIN, 120, dayAvailable));
		hiltonRooms.add(new Room(202, RoomType.TWIN, 150, dayAvailable));
		hiltonRooms.add(new Room(203, RoomType.TRIPLE, 200, dayAvailable));
		hilton.setRoomList(hiltonRooms);
		
		hotels.add(kempinski);
		List<Room> kempinskiRooms = new ArrayList<>();
		kempinskiRooms.add(new Room(306, RoomType.SINGLE, 15, dayAvailable));
		kempinskiRooms.add(new Room(307, RoomType.SINGLE, 40, dayAvailable));
		kempinskiRooms.add(new Room(308, RoomType.DOUBLE, 50, dayAvailable));
		kempinskiRooms.add(new Room(309, RoomType.DOUBLE, 40, dayAvailable));
		kempinskiRooms.add(new Room(310, RoomType.FAMILY, 75, dayAvailable));
		kempinski.setRoomList(kempinskiRooms);
		
		return hotels;
		
	}

}
