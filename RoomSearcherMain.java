package com.hotel.reservation;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class RoomSearcherMain {

	public static void main(String[] args) {
		
		List<Hotel> hotels = new ArrayList<>();
		hotels = HotelGenerator.getHotelList();
		
		//RoomSearcher.getRoomList(hotels);
		//System.out.println();
		//RoomSearcher.searchRoomByType();
		//RoomSearcher.getAllRoomList(hotels);
		
		RoomSearcher.searchRoom(hotels, "Vilnius", 2, 5, 10);
		System.out.println();
		Booking.bookARoom(hotels, "Vilnius", 2, 5, 10, 308);
		System.out.println();
		
		RoomSearcher.getAllRoomList(hotels);
		
		
		
		/*System.out.println("Welcome to our super ultra turbo mega Hotel Reservation System! Please select your language [en]");
		System.out.println("Sveikas atvykes! Pasirink kalba [lt]");
		Scanner scanner = new Scanner(System.in);
		
		String language = scanner.next();
		if (language.equals("lt")) {
			Locale.setDefault(new Locale("lt", "LT"));
		} else if (language.equals("en")) {
			Locale.setDefault(new Locale("en", "EN"));
		} else {
			throw new IllegalArgumentException();
		}
		
		Locale locale = Locale.getDefault();
		ResourceBundle bundle = ResourceBundle.getBundle("Bundle", locale);
		

		boolean reservationSystemOn = true;
		
		while (reservationSystemOn) {
			
			System.out.print(bundle.getString("city"));
			String city = scanner.next();
			System.out.print(bundle.getString("people"));
			int people = scanner.nextInt();
			System.out.print(bundle.getString("checkin"));
			int checkIn = scanner.nextInt();
			System.out.print(bundle.getString("checkout"));
			int checkOut = scanner.nextInt();
			
			RoomSearcher.searchRoom(hotels, city, people, checkIn, checkOut);
			
			System.out.print(bundle.getString("continue"));
			String doCont = scanner.next();
			if (doCont.equals("y")) {
				reservationSystemOn = true;
			} else if (doCont.equals("n")) {
				reservationSystemOn = false;
			} else {
				throw new IllegalArgumentException();
			}
		}*/
		
		
	}
	
	
	
	
}
