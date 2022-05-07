package com.saraya.service;
import com.saraya.model.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private static List<Student> students = new ArrayList<>();

    static {
        students.add(new Student("Saandati","Salim", LocalDate.now(),"6 month",LocalDate.now()));
        students.add(new Student("Ibrahim","Pape", LocalDate.now(),"6 month",LocalDate.now()));
        students.add(new Student("Raihane","Karm", LocalDate.now(),"16 month",LocalDate.now()));
        students.add(new Student("Omar","Ali", LocalDate.now(),"16 month",LocalDate.now()));
        students.add(new Student("Hassane","Salim", LocalDate.now(),"6 month",LocalDate.now()));
    }

    public StudentService() {
    }

    public List<Student> getStudents() {

        return students;
    }
    public Student getStudent(int id) {
        return students.get(id);
    }
    public void add(Student student){
        this.students.add(student);
    }
    public void update(int index,Student student){
        this.students.set(index,student);
    }
    public void delete(Student student){
        this.students.remove(student);
    }
    public void delete(int id){
        this.students.remove(id);
    }


}
