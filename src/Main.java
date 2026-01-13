import model.Student;
import service.StudentService;

public class Main {

    public static void main(String[] args) {

        StudentService service = new StudentService();

        Student s1 = new Student(1, "Alice", "alice@email.com");
        Student s2 = new Student(2, "Bob", "bob@email.com");

        service.addStudent(s1);
        service.addStudent(s2);

        System.out.println("Students registered:");
        service.listStudents().forEach(s ->
                System.out.println(s.getId() + " - " + s.getName())
        );
    }

}
