package by.java_intro_online.mod05.task02_payment;

/* Create an Payment class with an inner class
 * using which we can form a purchase that can contain several products.
 */

import java.util.List;
import java.util.ArrayList;

public class Payment {

	private static int idCounter = 0;
	private final int id;
	private List<Product> products;

	{
		products = new ArrayList<Product>();
		idCounter++;
		id = idCounter;
	}

	public Payment() {
	}

	public int getId() {
		return id;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void addProduct(String name, double price) {
		Product p = new Product(name, price);
		this.products.add(p);
	}

	public void addProducts(ArrayList<Product> products) {
		this.products.addAll(products);
	}

	public static class Product {

		private String name;
		private double price;

		public Product() {
		}

		public Product(String name, double price) {
			this.name = name;
			this.price = price;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			long temp;
			temp = Double.doubleToLongBits(price);
			result = prime * result + (int) (temp ^ (temp >>> 32));
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
			Product other = (Product) obj;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Product [name=" + name + ", price=" + price + "]";
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((products == null) ? 0 : products.hashCode());
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
		Payment other = (Payment) obj;
		if (id != other.id)
			return false;
		if (products == null) {
			if (other.products != null)
				return false;
		} else if (!products.equals(other.products))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Payment [id=" + id + ", products=" + products + "]";
	}
}
