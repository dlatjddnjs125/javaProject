package obejcts2;

public class Member {
	private String memberId;
	private String memberName;
	private Book1[] rentBooks = new Book[5];
	
	public Member() {
		
	}
	
	
	public Member(String memberId, String memberNmae) {
		this.memberName = memberNmae;
		this.memberId = memberId;
	}
	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMeberName() {
		return memberName;
	}

	public void setMeberName(String meberName) {
		this.memberName = meberName;
	}

	public void rent(Book book) {
		for (int i = 0; i < rentBooks.length; i++) {
			if (rentBooks[i] == null) {
				rentBooks[i] = book;
				break;
			}
		}
	}

	public void overdue(Book book) {
		for (int i = 0; i < rentBooks.length; i++) {
			if (rentBooks[i].getBookTitle().equals(book.getBookTitle())) {
				rentBooks[i] = null;
				break;
			}
		}
	}

	void getBookInfo() {
		System.out.print(this.memberName + "-" );
		for(int i=0; i<rentBooks.length; i++) {
			if (rentBooks[i] != null) {
				System.out.print(rentBooks[i].getBookTitle());
				System.out.print("/");
			}
		}
		
	}
//	public String getBookInfo() {
//		String result = "";
//		for (int i = 0; i < rentBooks.length; i++) {
//			if(rentBooks[i] !=null) {
//				result = result + "/" + rentBooks[i].getBookTitle();				
//			}
//		}
//		return result;
//	}

}
