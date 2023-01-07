package Chapter09;

import java.util.ArrayList;
import java.util.Iterator;

public class _Quize_09 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("유재석","파이썬"));
        students.add(new Student("박명수","자바"));
        students.add(new Student("김종국","자바"));
        students.add(new Student("조세호","C"));
        students.add(new Student("서장훈","파이썬"));

        Iterator<Student> itStudent = students.iterator();
        System.out.println("자바 자격증을 보유한 학생");
        System.out.println("---------------------");
        while(itStudent.hasNext()) {
            Student s = itStudent.next();
            if(s.certification.contains("자바")){
                System.out.println(s.name);
            }
        }

    }
}
class Student {
    String name;
    String certification;

    public Student(String name, String certification) {
        this.name = name;
        this.certification = certification;
    }
}
