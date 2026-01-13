package service;

import model.Student;
import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> listStudents() {
        return students;
    }

    public boolean removeStudentById(int id) {
        return students.removeIf(s -> s.getId() == id);
    }
}
