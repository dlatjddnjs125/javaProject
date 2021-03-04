package Example;

public class MemberServiceExample {

	public static void main(String[] args) {
		Member memberService = new Member();
		boolean result = memberService.login("hong","12345");
		if(result) {
			System.out.println("로그인");
			memberService.logout("hong");
		}else {
			System.out.println("id password");
		}
				

	}

}
