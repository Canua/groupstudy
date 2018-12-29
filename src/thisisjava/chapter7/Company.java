package thisisjava.chapter7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Company {
	public static void main(String[] args) {
		String result = ""; // 결과 문자열
		Employee emp = null;
		Manager mng = null;
		String empNo = null;
		String name = null;
		String part = null;
		String position = null;

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.print("사번 입력 : ");
			empNo = in.readLine();
			System.out.print("이름 입력 : ");
			name = in.readLine();
			System.out.print("부서 입력 : ");
			part = in.readLine();
			System.out.print("직책 입력 : ");
			position = in.readLine();
		} catch (Exception e) {
			System.out.println("입력 오류");
		}
		if (position.equals("1")) {
			emp = new Employee(empNo, name, part);
			result += emp.resultStr();
		} else {
			position = (position.equals("2")) ? "대리" : "과장";
			mng = new Manager(empNo, name, part, position);
			result += mng.addStr();
		}
		System.out.println(result);
	}
}
