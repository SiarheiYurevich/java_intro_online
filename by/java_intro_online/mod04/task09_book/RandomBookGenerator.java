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

import java.util.ArrayList;

public class RandomBookGenerator {

	RandomBookGenerator() {
	}

	public ArrayList<Book> generateStackOfBooks(int numberOfBooks) {

		ArrayList<Book> generatedBooks = new ArrayList<Book>(numberOfBooks);
		Book newBook;

		int idCounter = 1;
		String[] names = { "Aaaa", "Bbbb", "Cccc", "Dddd", "Eeee", "Ffff", "Gggg", "Hhhh" };
		String[] authors = { "Iiii", "Jjjj", "Yyyy" };
		String[] publishers = { "Kkkk", "Mnnn", "Nnnn" };
		String[] bindings = { "hardcover", "softcover" };

		for (int i = 0; i < numberOfBooks; i++) {

			newBook = new Book();

			newBook.setId(idCounter);
			idCounter++;
			newBook.setName(names[(int) (Math.random() * names.length)]);
			newBook.setAuthor(authors[(int) (Math.random() * authors.length)]);
			newBook.setPublisher(publishers[(int) (Math.random() * publishers.length)]);
			newBook.setYear((int) (Math.random() * 40) + 1980);
			newBook.setPages((int) (Math.random() * 200) + 200);
			newBook.setPrice((int) (Math.random() * 50) + 20);
			newBook.setBinding(bindings[(int) (Math.random() * 2)]);

			generatedBooks.add(newBook);
		}
		return generatedBooks;
	}
}
