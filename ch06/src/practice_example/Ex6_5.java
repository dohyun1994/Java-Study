package practice_example;

class Student {
	String name;		// 학생이름
	int ban;			// 반
	int no; 			// 번호
	int kor;			// 국어점수
	int eng;			// 영어점수
	int math;			// 수학점수
	
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
				
	}
	
	String info() {
		return name 
			+ ", " + ban 
			+ ", " + no 
			+ ", " + kor 
			+ ", " + eng 
			+ ", " + math 
			+ ", " + getTotal() 
			+ ", " + getAverage();
	}
	
	int getTotal() {
		return kor + eng + math;
	}
	
	float getAverage() {
		return (int)(getTotal()/3f *10 + 0.5f) / 10f;
	}
}

public class Ex6_5 {

	public static void main(String[] args) {
		Student s = new Student("홍길동", 1, 1, 100, 60, 76);
		System.out.println(s.info());		
	}
}
