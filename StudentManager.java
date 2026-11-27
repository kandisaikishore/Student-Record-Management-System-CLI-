import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private final List<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public boolean addStudent(Student student) {
        if (!isValid(student) || findStudentById(student.getId()) != null) {
            return false;
        }
        student.setName(student.getName().trim());
        students.add(student);
        return true;
    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(students);
    }

    public Student findStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) return student;
        }
        return null;
    }

    public boolean updateStudent(int id, String newName, Double newMarks) {
        Student student = findStudentById(id);
        if (student == null) return false;

        String normalizedName = newName == null ? "" : newName.trim();
        if (newMarks != null && !isValidMarks(newMarks)) return false;

        // Validate the complete update before mutating the existing record.
        if (!normalizedName.isEmpty()) student.setName(normalizedName);
        if (newMarks != null) student.setMarks(newMarks);
        return true;
    }

    public boolean deleteStudent(int id) {
        Student student = findStudentById(id);
        if (student == null) return false;
        return students.remove(student);
    }

    private boolean isValid(Student student) {
        return student != null
            && student.getId() > 0
            && student.getName() != null
            && !student.getName().trim().isEmpty()
            && isValidMarks(student.getMarks());
    }

    private boolean isValidMarks(double marks) {
        return Double.isFinite(marks) && marks >= 0.0 && marks <= 100.0;
    }
}
