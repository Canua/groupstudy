package thisisjava.chapter6;

import java.util.Scanner;

public class BankApplication {

	private static Bank_Account[] accountArray = new Bank_Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("1.계좌생성 |2.계좌목록 |3.예금 |4.출금 |5.종료");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("선택 > ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}

		}
		System.out.println("프로그램 종료");

	}

	static int index = 0;
	private static Bank_Account newAccount;

	private static void createAccount() {
		System.out.println("ㅡㅡㅡㅡ");
		System.out.println("계좌 생성");
		System.out.println("ㅡㅡㅡㅡ");
		System.out.print("계좌 번호> ");
		String ano = scanner.next();

		System.out.print("계좌주> ");
		String owner = scanner.next();

		System.out.print("초기입금액> ");
		int balance = scanner.nextInt();

		newAccount = new Bank_Account(ano, owner, balance); // 계좌 정보를

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = newAccount; // 배열에 넣는다.
				System.out.println("결과: 게좌가 생성되었습니다.");
				break;
			}
		}
	}

	private static void accountList() {
		for (int i = 0; i < accountArray.length; i++) {

			Bank_Account account = accountArray[i]; // 배열로 Printer클래스 변수에 저장

			if (accountArray[i] != null) {
				System.out.print(account.getAno());
				System.out.print("     ");
				System.out.print(account.getOwner());
				System.out.print("     ");
				System.out.println(account.getBalance());
			}
		}
	}

	private static void deposit() {
		System.out.println("ㅡㅡㅡㅡ");
		System.out.println("예금");
		System.out.println("ㅡㅡㅡㅡ");
		boolean run = true;
		while (run) {
			System.out.print("계좌번호: ");
			String ano = scanner.next();

			Bank_Account account = findAccount(ano); // ***important***

			if (account == null) {
				System.out.println("결과: 계좌가 없습니다.");
			} else {
				System.out.print("예금액: ");
				int balance = scanner.nextInt();
				account.setBalance(account.getBalance() + balance); // 예금액 더하기
				System.out.println("결과: 예금이 성공되었습니다.");
				run = false;
			}
		}
	}

	private static void withdraw() {
		System.out.println("ㅡㅡㅡㅡ");
		System.out.println("출금");
		System.out.println("ㅡㅡㅡㅡ");
		boolean run = true;
		while (run) {
			System.out.print("계좌번호: ");
			String ano = scanner.next();

			Bank_Account account = findAccount(ano); // ***important***

			if (account == null) {
				System.out.println("결과: 계좌가 없습니다.");
			} else {
				System.out.print("출금액: ");
				int balance = scanner.nextInt();
				account.setBalance(account.getBalance() - balance); // 예금액 더하기
				System.out.println("결과: 출금이 성공되었습니다.");
				run = false;
			}
		}
	}

	// Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Bank_Account findAccount(String ano) {
		Bank_Account account = null; // 초기화
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				String dbAno = accountArray[i].getAno();
				if (dbAno.equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}
}
