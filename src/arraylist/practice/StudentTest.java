package arraylist.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		ArrayList<Student> studentArr = new ArrayList<Student>();
		Scanner s = new Scanner(System.in);
		String name;
		int num;
		int kor;
		int eng;
		int math;
		int sum = 0;
		double avg = 0;
		String subject;
		while (true) {

			System.out.println("메뉴를 선택하시오.");
			System.out.println("-----------------------------\n" + "1. Input Student info\n"
					+ "2. Print out all student\n" + "3. Search student info(이름으로 검색)\n"
					+ "4. Delete student info(이름으로 삭제)\n" + "5. Correct student info(학생 이름 검색 후 해당 과목 선택 후 수정");
			int choose = s.nextInt();
			if (choose == 1) {
				System.out.print("이름 : ");
				name = s.next();
				System.out.print("학번 : ");
				num = s.nextInt();
				System.out.print("국어성적 : ");
				kor = s.nextInt();
				System.out.print("영어성적 : ");
				eng = s.nextInt();
				System.out.print("수학성적 : ");
				math = s.nextInt();

				studentArr.add(new Student(name, num, kor, eng, math, sum, avg));
			} else if (choose == 2) {
				for (int i = 0; i < studentArr.size(); i++) {
					System.out.println(i + 1 + "이름 : " + studentArr.get(i).getName() + " 학번 : "
							+ studentArr.get(i).getNum() + " 국어성적 : " + studentArr.get(i).getKor() + " 영어성적 : "
							+ studentArr.get(i).getEng() + " 수학성적 : " + studentArr.get(i).getMath() + " 총합 : "
							+ studentArr.get(i).getSum() + " 평균 : " + studentArr.get(i).getAvg());
				}
			} else if (choose == 3) {
				System.out.print("이름으로 검색하기\n" + "이름을 입력하세요 :");
				name = s.next();
				boolean find = false;
				for (int i = 0; i < studentArr.size(); i++) {

					if (name.equals(studentArr.get(i).getName())) {
						find = true;
						System.out.println((i + 1) + "  이름 : " + studentArr.get(i).getName() + " 학번 : "
								+ studentArr.get(i).getNum() + " 국어성적 : " + studentArr.get(i).getKor() + " 영어성적 : "
								+ studentArr.get(i).getEng() + " 수학성적 : " + studentArr.get(i).getMath() + " 총합 : "
								+ studentArr.get(i).getSum() + " 평균 : " + studentArr.get(i).getAvg());
						break;
					}
				}
				if (find == false)
					System.out.println("해당 학생이 없습니다.");
			} else if (choose == 4) {
				System.out.print("삭제하고 싶은 정보의 학생 이름을 입력하세요 : ");
				name = s.next();
				boolean find = false;
				for (int i = 0; i < studentArr.size(); i++) {

					if (name.equals(studentArr.get(i).getName())) {
						find = true;
						studentArr.remove(i);
						System.out.println(name + " 학생의 정보 삭제 완료");
						break;
					}
				}
				if (find == false)
					System.out.println("해당 학생이 없습니다.");
			} else if (choose == 5) {
				int info = 0;
				boolean find = false;
				System.out.print("학생 정보를 수정하고 싶은 학생의 이름을 입력하세요 : ");
				name = s.next();
				for (int i = 0; i < studentArr.size(); i++) {
					if (name.equals(studentArr.get(i).getName())) {
						info = i;
						find = true;
						break;
					}
				}
				if (find != true)
					break;
				System.out.println("수정할 과목을 선택하시오 [국어, 수학, 영어]");
				subject = s.next();
				if (subject.equals("국어")) {
					System.out.print(name + " 학생의 국어 점수를 변경 합니다." + studentArr.get(info).getKor() + " -> ");
					kor = s.nextInt();
					studentArr.get(info).setKor(kor);
					studentArr.get(info).InputStudentInfo();
				} else if (subject.equals("수학")) {
					System.out.print(name + " 학생의 수학 점수를 변경 합니다." + studentArr.get(info).getMath() + " -> ");
					math = s.nextInt();
					studentArr.get(info).setMath(math);
					studentArr.get(info).InputStudentInfo();
				} else if (subject.equals("영어")) {
					System.out.print(name + " 학생의 영어 점수를 변경 합니다." + studentArr.get(info).getEng() + " -> ");
					eng = s.nextInt();
					studentArr.get(info).setEng(eng);
					studentArr.get(info).InputStudentInfo();
				}
			}

		}
	}

	public static void print() {
	}

}