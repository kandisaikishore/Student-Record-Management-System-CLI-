import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private final List<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public boolean addStudent(Student s) {
        // prevent duplicate IDs
        if (findStudentById(s.getId()) != null) {
            return false;
        }
        students.add(s);
        return true;
    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(students);
    }

    public Student findStudentById(int id) {
        for (Student s : students) {
            if (s.getId() == id) return s;
        }
        return null;
    }

    public boolean updateStudent(int id, String newName, Double newMarks) {
        Student s = findStudentById(id);
        if (s == null) return false;
        if (newName != null && !newName.trim().isEmpty()) s.setName(newName);
        if (newMarks != null) s.setMarks(newMarks);
        return true;
    }

    public boolean deleteStudent(int id) {
        Student s = findStudentById(id);
        if (s == null) return false;
        return students.remove(s);
    }
}