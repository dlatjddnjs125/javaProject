package obejcts2;

import java.util.Scanner;

public class LibraryApplication {
	public static void main(String[] args) {
		Book[] bookList = new Book[10];
		Member user = new Member();
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.println("----------------------------------------------------------------");
			System.out.println("1.도서정보등록 | 2.회원정보등록 | 3.도서대여 | 4.도서반납 | 5.도서목록 | 9.종료");
			System.out.println("----------------------------------------------------------------");
			System.out.print("선택 > ");
			int selectNo = scn.nextInt();
			if(selectNo == 1) {
				 String Title;
				 String Author;
				 String Press;
				 int Price;
//				 System.out.println(Book.length);
				 for (int i=0; i<bookList.length; i++) {
					 if(bookList[i] != null) {
						 bookList[i] = new Book();
						 System.out.println("도서정보 입력 >");
						 
						  
						 
					 }
						 
					 
					 
				}
	
					
				
			}
		}
		
	}
}
