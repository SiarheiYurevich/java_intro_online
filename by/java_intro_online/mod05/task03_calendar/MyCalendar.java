package by.java_intro_online.mod05.task03_calendar;

/* Create class Calendar with inner class
 * using which you can store information about day off and holidays. 
 */

import java.util.List;
import java.util.ArrayList;

public class MyCalendar {

	private List<FreeDay> myFreeDays;

	{
		myFreeDays = new ArrayList<FreeDay>();
	}

	public MyCalendar() {
	}

	public List<FreeDay> getMyFreeDays() {
		return myFreeDays;
	}

	public void setMyFreeDays(List<FreeDay> myFreeDays) {
		this.myFreeDays = myFreeDays;
	}

	public void addFreeDays(List<FreeDay> freeDays) {
		this.myFreeDays.addAll(freeDays);
	}

	public void addFreeDay(FreeDay newFreeDay) {
		myFreeDays.add(newFreeDay);
	}

	public enum Type {
		DAYOFF, HOLIDAY
	};

	public static class FreeDay extends Date {

		private Type type;
		private String name;

		public FreeDay() {
		}

		public FreeDay(int year, int month, int day, Type type, String name) {
			super(year, month, day);
			this.type = type;
			this.name = name;
		}

		public FreeDay(Date date, Type type, String name) {
			super(date.getYear(), date.getMonth(), date.getDay());
			this.type = type;
			this.name = name;
		}

		public Type getType() {
			return type;
		}

		public void setType(Type type) {
			this.type = type;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = super.hashCode();
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + ((type == null) ? 0 : type.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (!super.equals(obj))
				return false;
			if (getClass() != obj.getClass())
				return false;
			FreeDay other = (FreeDay) obj;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (type != other.type)
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "FreeDay [name=" + name + ", type=" + type + ", " + super.toString() + "]";
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((myFreeDays == null) ? 0 : myFreeDays.hashCode());
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
		MyCalendar other = (MyCalendar) obj;
		if (myFreeDays == null) {
			if (other.myFreeDays != null)
				return false;
		} else if (!myFreeDays.equals(other.myFreeDays))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MyCalendar [myFreeDays=" + myFreeDays + "]";
	}

}
