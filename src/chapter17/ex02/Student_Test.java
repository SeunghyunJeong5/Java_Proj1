package chapter17.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student_Test {

	public static void main(String[] args) {
		// ArrayList 변수 선언 : <Student>
		List<Student> aList = new ArrayList<>();
		Scanner sc = new Scanner(System.in); // 콘솔로부터 값을 인풋

		boolean run = true;
		int studentNum = 0; // 스캐너로 학생수를 인풋받는 변수

		while (run) {
			System.out.println("=========================================================");
			System.out.println("1. 학생수 | 2. 점수 | 3. 점수리스트 | 4. 분석 | 5. 프로그램 종료"); // 학생수에 따른 점수 입력
			System.out.println("=========================================================");
			System.out.println("위의 번호중 하나의 정수를 입력하세요. >>>>>");

			int selectNo = sc.nextInt();
			if (selectNo == 1) {
				// 스캐너로 학생수를 인풋 받아서 studentNum 변수에 할당한다.
				System.out.println("학생수를 입력하세요. ");

				studentNum = sc.nextInt();
				System.out.println("학생수는 " + studentNum + "명 입니다. ");

			} else if (selectNo == 2) {

				// 학생수가 인풋되지 않으면 먼저 학생수를 입력하세요 메시지를 출력(studentNum !=0 의 경우만)
				// 학생수에 대한 각각의 student 객체를 생성 후 점수를 스캐너로 입력받고 aList에 저장한다. setter로
				// for문안에 스캐너 넣어서...학생수만큼...
				if (studentNum == 0) {
					System.out.println("학생수가 입력되지 않았습니다. 학생수를 먼저 입력하시고 점수를 입력해주세요.");
				} else {

					System.out.println("각 학생의 점수를 학생수 만큼 공백을 사용해서 입력해주세요. ");

					for (int i = 0; i < studentNum; i++) {

						Student s1 = new Student();
						int score = sc.nextInt();
						s1.setScore(score);

						aList.add(s1);

					}

				}

			} else if (selectNo == 3) {
				// 점수의 리스트를 출력, aList 의 Student 객체내의 값을 getter로 가져옴.
				if(studentNum==0) {
					System.out.println("학생수가 입력되지 않았습니다. 학생수를 먼저 입력하시고 점수를 입력해주세요.");
				}
				else if (aList.isEmpty()) {
					System.out.println("점수를 먼저 입력해주세요.");
				}
				else {
				System.out.println("점수의 리스트를 출력합니다.");
				for (int i = 0; i < aList.size(); i++) {
					int score = aList.get(i).getScore();
					System.out.print(score + " ");

				}
				System.out.println();
				}
			} else if (selectNo == 4) {
				// 들어온 학생들의 점수중에 최대점수를 출력
				// 평균을 출력
				int max = 0;
				int sum = 0;
				double avg = 0;
				for (int i = 0; i < aList.size(); i++) {
					int score = aList.get(i).getScore();		//Student s1 = aList.get(i)
																//int score = s1.getScore();	객체의 getter를 사용해서 점수를 받아온것. 이렇게 해도된다.
					if (score > max) {
						max = score;
					}
					sum += score;

				}
				avg = (double) sum / studentNum;
				System.out.println("입력한 점수들 중 최대값은 : " + max + "점 입니다.");
				System.out.println("입력한 점수들의 평균값은 : " + avg + "점 입니다.");

			} else if (selectNo == 5) {
				// while문을 빠져나감
				break;
				//run=false; 해도됨.
			} else {
				System.out.println("잘못 입력하셨습니다. 정수 1번부터 5번까지만 입력해주세요. ");
			}

		}
		System.out.println("프로그램이 종료되었습니다.");
		
		sc.close();

	}

}
