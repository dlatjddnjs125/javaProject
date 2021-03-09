package inheritances;

public class ComFriend extends Friend {
	private String departmnet; 
	public ComFriend(String name, String phone, String department) {
		super(name,phone);
		this.departmnet = department;
		
	}
	@Override
	public String toString() {
		return "ComFriend [departmnet=" + departmnet + ", name=" + getName() + ", phone=" + getPhone() + "]";
	}
	public ComFriend() {}

}
