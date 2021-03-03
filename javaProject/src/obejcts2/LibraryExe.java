package obejcts2;

public class LibraryExe {

	public static void main(String[] args) {
		Book book1 = new Book("자바", "저자1", "출판사1", 1000);
		Book book2 = new Book("HTML", "저자2", "출판사2", 1000);
		Book book3 = new Book("CSS", "저자3", "출판사3", 1000);
		Book book4 = new Book("자바스크립트", "저자4", "출판사4", 1000);

		System.out.println(book1.getBookTitle());
		Member mem1 = new Member("s111", "박효정");
		mem1.rent(book1);
		mem1.rent(book2);
		mem1.rent(book3);
		mem1.overdue(book2);
		mem1.getBookInfo();
		
		

		
		Member mem2 = new Member("a222", "김한설");
		mem2.rent(book3);
		mem2.rent(book4);

//		Book[] rentBooks = new Book[3];


	}

}
