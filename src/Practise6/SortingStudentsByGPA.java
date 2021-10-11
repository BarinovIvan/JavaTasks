package Practise6;

import java.util.Arrays;
import java.util.Comparator;


public class SortingStudentsByGPA extends Student {
    public static void main(String[] args) {
        Student[] students = new Student[5];
            Comparator<Student> scomp = new StudentGPAComparator();
            students[0] = new Student(64352, 245);
            students[1] = new Student(5234, 223);
            students[2] = new Student(1, 221);
            students[3] = new Student(666, 290);
            students[4] = new Student(777, 255);
            Arrays.sort(students, scomp);
            for (int i = 0; i < 5; i++) {
                System.out.println(students[i].getiD() + " " + students[i].getGPA());
            }
    }
}

class StudentGPAComparator implements Comparator<Student>{
    public int compare(Student a,Student b){
        if(a.getGPA()>b.getGPA())
            return 1;
        else if(a.getGPA()<b.getGPA())
            return -1;
        else return 0;
    }
}
