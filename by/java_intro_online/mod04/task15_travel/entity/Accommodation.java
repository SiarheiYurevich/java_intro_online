package by.java_intro_online.mod04.task15_travel.entity;

import java.io.Serializable;

/* Form a set of proposals for the client on the choice of a tourist voucher
 * of various types (rest, excursions, treatment, shopping, cruise, etc.)
 * for an optimal choice. Take account of the choice of transport, food
 * and the number of days.
 * Implement the selection and sorting of tours.
 */

public class Accommodation implements Serializable {
	
	private static final long serialVersionUID = 2224185977023563350L;
	
	private int room;
	private String food;
	private int days;

	public Accommodation() {
	}

	public Accommodation(int room, String food, int days) {
		this.room = room;
		this.food = food;
		this.days = days;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + days;
		result = prime * result + ((food == null) ? 0 : food.hashCode());
		result = prime * result + room;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Accommodation other = (Accommodation) obj;
		if (days != other.days)
			return false;
		if (food == null) {
			if (other.food != null)
				return false;
		} else if (!food.equals(other.food))
			return false;
		if (room != other.room)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Accommodation [ room " + room + ", food " + food + ",days " + days + " ]";
	}

}
