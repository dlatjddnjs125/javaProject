package Example;

public class Member {
	private String name;
	private String id;
	private String password;
	int age;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Member(String id) {
		this.id = id;
	}

	public Member(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public Member() {
	}

//	Member user1 = new Member("hong", "12345");
//	Member user2 = new Member("강자바", "java");

	boolean login(String id, String password) {
		if (id == "hong" && password == "12345") {
			return true;
		} else {
			return false;
		}

	}

	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}

}
