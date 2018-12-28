package thisisjava.chapter6;

import java.util.Scanner;

public class MemberServiceExample {
	public static void main(String[] args) {
		MemberService meberService = new MemberService();
		boolean result = meberService.login("hong", "12345");
		
		if (result) {
			System.out.println(meberService.id + "님이 로그인 되었습니다.");
			meberService.logout("hong");
		} else {
			System.out.println("id 또는 pwd가 틀렸습니다.");
		}
	}
}
