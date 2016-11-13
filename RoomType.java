package com.hotel.reservation;

public enum RoomType {

	SINGLE(1), DOUBLE(2), TWIN(2), TRIPLE(3), FAMILY(5);

	int people;

	private RoomType(int people) {
		this.people = people;
	}

	public int getPeople() {
		return people;
	}

}
