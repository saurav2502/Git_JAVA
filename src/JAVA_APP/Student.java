package JAVA_APP;

import java.util.*;
import java.lang.*;

public class Student {
    String name;
    int rollnum;

    public Student(String name, int rollnum) {
        this.name = name;
        this.rollnum = rollnum;
    }

    public String toString() {
        return this.name + " " + this.rollnum;
    }

}

class SortbyRoll implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.rollnum - o2.rollnum;
    }

}

class SortbyName implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}

class Driver {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("saurav", 840929));
        students.add(new Student("amit", 1234));
        students.add(new Student("sandeep", 6543));
        students.add(new Student("monu", 46455));
        students.add(new Student("suraj", 89877));
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
        Collections.sort(students, new SortbyName());

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
        Collections.sort(students, new SortbyRoll());

        System.out.println("\nSorted by name");
        for (int i = 0; i < students.size(); i++)
            System.out.println(students.get(i));
    }
}
