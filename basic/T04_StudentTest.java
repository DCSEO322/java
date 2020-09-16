package kr.or.ddit.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 문제) 학번, 이름, 국어점수, 영어점수, 수학점수, 총점, 등수를 멤버로 갖는 Student클래스를 만든다.
 * 생성자는 학번, 이름, 국어, 영어, 수학 점수만 매개변수를 받아서 처리한다. 이 Student객체들은 List에 저장하여 관리한다. List에 저장한 데이터들을
 * 학번의 오름차순으로 정렬하여 출력하는 부분과 총점의 역순으로 정렬하는 부분을 프로그램하시오.
 * (총점이 같으면 학번의 내림차순으로 정렬하도록 한다.)
 * (학번 정렬 기준은 Student클래스 자체에서 제공하도록하고 총점 정렬기준은 외부클래스에서 제공하도록 한다.)
 */
public class T04_StudentTest {
	public static void main(String[] args) {
		
		List<Student> stuList = new ArrayList<>();
		
		stuList.add(new Student("C001", "홍길동", 68, 17, 91));
		stuList.add(new Student("A001", "강감찬", 62, 72, 70));
		stuList.add(new Student("D001", "이순신", 73, 64, 42));
		stuList.add(new Student("E001", "이몽룡", 90, 57, 55));
		stuList.add(new Student("B001", "성춘향", 73, 43, 63));

		System.out.println("정렬 전");
		for (Student stu : stuList) {
			System.out.println(stu);
		}
		System.out.println("--------------------------------------------------------------------------------");

		// 학번순으로 정렬
		System.out.println("학번 순 정렬");
		Collections.sort(stuList);
		for (Student stu : stuList) {
			System.out.println(stu);
		}
		System.out.println("--------------------------------------------------------------------------------");

		Collections.sort(stuList, new totalDesc());
		System.out.println("총점 순 정렬");
		int rank = 1;
		for (Student stu : stuList) {
			stu.setRank(rank++);
			System.out.println(stu);
		}

	}
}

/**
 * 총점의 역순으로 정렬하는 클래스
 */
class totalDesc implements Comparator<Student> {

	@Override
	public int compare(Student total1, Student total2) {
		if (total1.getTotal() > total2.getTotal()) {
			return -1;
		} else if (total1.getTotal() == total2.getTotal()) {
			// 학번의 대한 오름차순에 -1을 곱하여 내림차순으로 재정렬한다.
			return total1.compareTo(total2) * -1;
		} else {
			return 1;
		}
	}

}

/**
 * 회원이 정보를 저장할 클래스 (학번을 기준으로 오름차순으로 정렬이 될 수 있게 클래스 만들기)
 */
class Student implements Comparable<Student> {
	private String Student_id;
	private String name;
	private int Kor;
	private int Eng;
	private int Mat;
	private int total;
	private int rank;

	public Student(String student_id, String name, int kor, int eng, int mat) {
		super();
		Student_id = student_id;
		this.name = name;
		Kor = kor;
		Eng = eng;
		Mat = mat;
		this.total = kor + eng + mat;
	}

	public String getStudent_id() {
		return Student_id;
	}

	public void setStudent_id(String student_id) {
		Student_id = student_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return Kor;
	}

	public void setKor(int kor) {
		Kor = kor;
	}

	public int getEng() {
		return Eng;
	}

	public void setEng(int eng) {
		Eng = eng;
	}

	public int getMat() {
		return Mat;
	}

	public void setMat(int mat) {
		Mat = mat;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Student [Student_id=" + Student_id + ", name=" + name + ", Kor=" + Kor + ", Eng=" + Eng + ", Mat=" + Mat
				+ ", total=" + total + ", rank=" + rank + "]";
	}

	/**
	 * 학번을 기준으로 오름차순 정렬이 되도록 한다.
	 */
	@Override
	public int compareTo(Student stu) {

		return getStudent_id().compareTo(stu.getStudent_id());
	}

}