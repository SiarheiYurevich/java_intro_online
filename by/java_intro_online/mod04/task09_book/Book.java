package by.java_intro_online.mod04.task09_book;

/* Create a class Book whose specification is given below.
 * Write constructors, set- and get- methods, and toString method.
 * Write a class that aggregates an array of type Book with appropriate constructors and methods.
 * Specify data selection criteria and output this data to the console.
 * Book: id, name, author(s), publisher, year of publication, number of pages, price, binding type.
 * Find and output:
 * a) list of books of specified author;
 * b) list of books of specified publisher;
 * c) list of books published after specified year.
 */

public class Book {

	private int id;
	private String name;
	private String author;
	private String publisher;
	private int year;
	private int pages;
	private int price;
	private String binding;

	public Book() {
	}

	public Book(int id, String name, String author, String publisher, int year, int pages, int price, String binding) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.year = year;
		this.pages = pages;
		this.price = price;
		this.binding = binding;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int gerPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBinding() {
		return binding;
	}

	public void setBinding(String binding) {
		this.binding = binding;
	}

	@Override
	public String toString() {
		return "Book [ name " + name + ", author(s) " + author + ", publisher " + publisher + ", year " + year
				+ ", pages " + pages + ", price " + price + ", binding " + binding + " ]";
	}
}
