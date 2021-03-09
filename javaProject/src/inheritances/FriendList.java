package inheritances;

import java.util.Scanner;

public class FriendList {
	static Friend[] friends = new Friend[10];

	public static void main(String[] args) {
//		friends[0] = new Friend();
//		friends[1] = new ComFriend("정준영","01012123434","총무부서");
//		friends[2] = new UnivFriend("도왕락","01045456767", "역사학과");
//		
//		for(Friend friend : friends) {
//			if (friend != null) {
//				System.out.println(friend.toString());
//			}
//		}
		Scanner scn = new Scanner(System.in);
		int menu = 0;
		boolean run = true;
		while (run) {
			System.out.println("---------------------");
			System.out.println("1.친구 2.학교친구 3.회사친구 4.전체목록 5.친구검색 6.종료");
			System.out.println("---------------------");
			System.out.println("선택 >");
			menu = scn.nextInt();
			if (menu == 1) {
				System.out.println("친구이름 >");
				String name = scn.next();
				System.out.println("전화번호 >");
				String phone = scn.next();
				Friend friend = new Friend(name, phone);
				saveFriend(new Friend(name,phone));

			} else if (menu == 2) {

				System.out.println("친구이름 >");
				String name = scn.next();
				System.out.println("전화번호 >");
				String phone = scn.next();
				System.out.println("전공 >");
				String major = scn.next();
				saveFriend(new UnivFriend(name, phone, major));
				

			} else if (menu == 3) {

				System.out.println("친구이름 >");
				String name = scn.next();
				System.out.println("전화번호 >");
				String phone = scn.next();
				System.out.println("부서 >");
				String dep = scn.next();
				saveFriend(new ComFriend(name, phone, dep));
				

			} else if (menu == 4) {
					for (Friend friend : friends) {
						if (friend != null) {
							System.out.println(friend.toString());

						}
					}
			} else if (menu == 5) {
				System.out.println("찾을 이름 입력 >");
				String findName = scn.next();
				for (Friend friend : friends) {
					if (friend != null && friend.getName().equals(findName)) {
						System.out.println("친구 정보 :" + friend.toString());
					}
				}

			} else if (menu == 6) {
				run = false;

			}
		}
	}

	public static void saveFriend(Friend friend) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}

		}

	}

}
