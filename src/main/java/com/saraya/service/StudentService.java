package com.saraya.service;
import com.saraya.model.Student;

import java.time.LocalDate;
import java.util.*;

public class StudentService  {
    private static List<Student> students = new ArrayList<>();

    static {
        students.add(new Student(1,"Saandati","Salim", LocalDate.now(),"6 Month",LocalDate.now()));
        students.add(new Student(2,"Ibrahim","Pape", LocalDate.now(),"6 Month",LocalDate.now()));
        students.add(new Student(3,"Raihane","Karm", LocalDate.now(),"16 Month",LocalDate.now()));
        students.add(new Student(4,"Omar","Ali", LocalDate.now(),"16 Month",LocalDate.now()));
        students.add(new Student(5,"Hassane","Salim", LocalDate.now(),"6 Month",LocalDate.now()));
    }

    public StudentService() {
    }

    public List<Student> getStudents() {

        return students;
    }
    public Student getStudent(int id) {
        return students.get(this.index(id));
    }

    public Student getStudent(long id) {
        for (Student student: this.getStudents()
             ) {
            if (student.getId() == id){
                return student;
            }
        }
        return null;
    }
    public void add(Student student){

        Collections.sort(this.getStudents(),this.comparatorId);
       long id = this.getStudents().stream().findFirst().map(Student::getId).get();

        System.out.println("id in add = " + id);
        student.setId(id+1);
        System.out.println("id+1 in add = " +student.getId());
        this.students.add(student);
    }
    public void update(int id,Student student){
        student.setId(id);
        this.students.set(this.index(id),student);
    }
    public void delete(Student student){
        this.students.remove(student);
    }
    public void delete(int id){

        this.students.remove(this.index(id));

    }

    public int index(int idStudent){
        int index = 0;
        for (Student student :this.getStudents()
        ) {
            if (student.getId()==idStudent){
                index =  this.getStudents().indexOf(student);
            }
        }
        return index;
    }

    Comparator<Student> comparatorId = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return (int) (o2.getId()-o1.getId());
        }

    };
}
