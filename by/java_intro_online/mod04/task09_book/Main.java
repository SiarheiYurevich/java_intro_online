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

public class Main {

	public static void main(String[] args) {

		BookStore store = new BookStore();
		RandomBookGenerator generator = new RandomBookGenerator();
		Console console = new Console();
		Logic logic = new Logic();

		int numberOfBooks = 10;
		store.addStackOfBooks(generator.generateStackOfBooks(numberOfBooks));

		System.out.println("Generated books:");
		console.outputBooks(store.getStore());

		System.out.println("Books of specified author (Iiii):");
		console.outputBooks(logic.getBooksOfAuthor(store.getStore(), "Iiii"));

		System.out.println("Books of specified publisher (Kkkk):");
		console.outputBooks(logic.getBooksOfPublisher(store.getStore(), "Kkkk"));

		System.out.println("Books published after specified year (2000):");
		console.outputBooks(logic.getBooksPublishedAfterYear(store.getStore(), 2000));

	}

}
