package by.java_intro_online.mod04.task15_travel.entity;

import java.io.Serializable;

/* Form a set of proposals for the client on the choice of a tourist voucher
 * of various types (rest, excursions, treatment, shopping, cruise, etc.)
 * for an optimal choice. Take account of the choice of transport, food
 * and the number of days.
 * Implement the selection and sorting of tours.
 */

public class Travel implements Serializable {

	private static final long serialVersionUID = 35289755569074562L;
	
	private String type;
	private String transport;
	private Accommodation accommodation;
	private int price;

	public Travel() {
	}

	public Travel(String type, String transport, Accommodation accommodation) {
		this.type = type;
		this.transport = transport;
		this.accommodation = accommodation;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTransport() {
		return transport;
	}

	public void setTransport(String transport) {
		this.transport = transport;
	}

	public Accommodation getAccommodation() {
		return accommodation;
	}

	public void setAccommodation(Accommodation accommodation) {
		this.accommodation = accommodation;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accommodation == null) ? 0 : accommodation.hashCode());
		result = prime * result + price;
		result = prime * result + ((transport == null) ? 0 : transport.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Travel other = (Travel) obj;
		if (accommodation == null) {
			if (other.accommodation != null)
				return false;
		} else if (!accommodation.equals(other.accommodation))
			return false;
		if (price != other.price)
			return false;
		if (transport == null) {
			if (other.transport != null)
				return false;
		} else if (!transport.equals(other.transport))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Travel [ type " + type + ", transport " + transport + ", accommodation " + accommodation + ", price "
				+ price + " ]";
	}
}
