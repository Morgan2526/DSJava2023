import java.time.LocalDate;

public class BookTest1 {
	public static void main(String[] args) {

		BookDetails[] books;
		books = new BookDetails[10];

		books[0] = new BookDetails(100, "Java Programming Lang", "Someone", 59.05f, LocalDate.of(2021, 3, 30));
		books[1] = new BookDetails(101, "Python Programming Lang", "Someone2", 69.05f, LocalDate.of(2021, 4, 30));
		books[2] = new BookDetails(102, "HTML Programming Lang", "Someone3", 79.05f, LocalDate.of(2021, 5, 30));
		books[3] = new BookDetails(103, "C# Programming Lang", "Someone4", 89.05f, LocalDate.of(2021, 6, 30));
		books[4] = new BookDetails(104, "JavaScript Programming Lang", "Someone5", 99.05f, LocalDate.of(2021, 7, 30));

		for (int i = 0; i < 5; i++) {
			books[i].printbook();
			System.out.println("the book is stored at " + books[i]);
		}

	}
}

class BookDetails {
	private int bookId;
	private String bookName;
	private String bookAuthor;
	private float bookPrice;
	private LocalDate publishDate;

	BookDetails(int bookId, String bookName, String bookAuthor, float bookPrice, LocalDate publishDate) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		this.publishDate = publishDate;
	}

	void printbook() {
		System.out.println("------------------------------------");
		System.out.println("BookId               :" + bookId);
		System.out.println("BookName             :" + bookName);
		System.out.println("BookAuthor           :" + bookAuthor);
		System.out.println("BookPrice            :" + bookPrice);
		System.out.println("Book Publish Date    :" + publishDate);
	}

	@Override
	public String toString() {
		return "BookDetails [bookId=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor
				+ ", bookPrice=" + bookPrice + ", publishDate=" + publishDate + "]";
	}

}
